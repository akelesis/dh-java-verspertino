package mvc;

public class StudentController {
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setStudentName(String nome) {
		model.setNome(nome);
	}
	
	public String getStudentName(){
	   return model.getNome();		
	}

	public void setStudentRollNo(String rollNo){
		model.setMatricula(rollNo);		
	}

	public String getStudentRollNo(){
		return model.getMatricula();		
	}

	public void updateView(){				
		view.imprimeDetalhesEstudante(model.getNome(), model.getMatricula());
	}	
}
