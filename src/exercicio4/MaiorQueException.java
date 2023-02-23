package exercicio4;

public class MaiorQueException extends Exception{

    @Override
    public String getMessage() {
        return "Maior que o numero sorteado";
    }
    
}
