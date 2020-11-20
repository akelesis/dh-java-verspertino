package br.com.dh.jwt.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.dh.jwt.dto.ForgottenPasswordDTO;
import br.com.dh.jwt.entities.Usuario;
import br.com.dh.jwt.exceptions.SenhaInvalidaException;
import br.com.dh.jwt.repositories.UsuarioRepository;
import br.com.dh.jwt.util.Mail;

@Service
public class UsuarioServiceImpl implements UserDetailsService {
	@Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UsuarioRepository repository;
    
    @Autowired
    private JwtService jwtService;
    
    @Autowired
    private EmailService emailService;

    @Transactional
    public Usuario salvar(Usuario usuario){
        return repository.save(usuario);
    }

    public UserDetails autenticar( Usuario usuario ){
        UserDetails user = loadUserByUsername(usuario.getLogin());
        boolean senhasBatem = encoder.matches( usuario.getSenha(), user.getPassword() );

        if(senhasBatem){
            return user;
        }

        throw new SenhaInvalidaException();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository.findByLogin(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado na base de dados."));

        String[] roles = usuario.isAdmin() ?
                new String[]{"ADMIN", "USER"} : new String[]{"USER"};

        return User
                .builder()
                .username(usuario.getLogin())
                .password(usuario.getSenha())
                .roles(roles)
                .build();
    }
    
    public void recoverPassword(ForgottenPasswordDTO dto) {
    	Optional<Usuario> userOpt = repository.findByLogin(dto.getEmail());
    	if(userOpt.isPresent()) {
    		Usuario user = userOpt.get();
    		String token = jwtService.gerarToken(user);
    		
    		Mail mail = new Mail();
    		mail.setTo(dto.getEmail());
    		mail.setSubject("Recuperação de senha - MeuSite.com.br");
    		emailService.sendEmail(mail, token);
    	}
    }
}
