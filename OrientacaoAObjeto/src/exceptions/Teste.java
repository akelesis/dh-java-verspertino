//package exceptions;

public class Teste {
    public static void main(String[] args) throws Exception {
        teste02();
        teste();
    }

    
    public static void teste() throws Exception {
        throw new Exception();
    }
    
    public static void teste02() {
        throw new RuntimeException();
    }
}