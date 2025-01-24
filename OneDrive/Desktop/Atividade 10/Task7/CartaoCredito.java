package Task7;

// Classe CartaoCredito que estende FormaPagamento
public class CartaoCredito extends FormaPagamento {

    // Método para processar o pagamento com cartão de crédito
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " processado com cartão de crédito.");
        } else {
            System.out.println("Falha na validação do pagamento com cartão de crédito.");
        }
    }

    // Método para validar o pagamento com cartão de crédito
    @Override
    public boolean validarPagamento() {
        // Aqui, uma validação simples de exemplo. Pode ser aprimorada.
        System.out.println("Validando cartão de crédito...");
        return true; // Vamos assumir que o cartão foi validado com sucesso.
    }
}

