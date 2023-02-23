package exercicio4;

public class MenorQueException extends Exception{

    @Override
    public String getMessage() {
        return "Menor que o numero sorteado";
    }
    
}
