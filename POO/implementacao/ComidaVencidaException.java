package poo.implementacao;

public class ComidaVencidaException extends Exception {
    @Override
    public String getMessage() {
        return "Esta vencida!";
    }
}
