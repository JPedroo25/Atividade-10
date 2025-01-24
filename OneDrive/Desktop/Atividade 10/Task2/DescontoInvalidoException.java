package Task2;

// Exceção personalizada para desconto inválido
public class DescontoInvalidoException extends Exception {
    public DescontoInvalidoException(String mensagem) {
        super(mensagem);
    }
}

