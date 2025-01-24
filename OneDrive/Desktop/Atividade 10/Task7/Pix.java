package Task7;

// Classe Pix que estende FormaPagamento
public class Pix extends FormaPagamento {

    // Método para processar o pagamento com Pix
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " processado via Pix.");
        } else {
            System.out.println("Falha na validação do pagamento via Pix.");
        }
    }

    // Método para validar o pagamento com Pix
    @Override
    public boolean validarPagamento() {
        // Validação simples de exemplo
        System.out.println("Validando pagamento via Pix...");
        return true; // Considerando que o Pix é validado com sucesso.
    }
}

