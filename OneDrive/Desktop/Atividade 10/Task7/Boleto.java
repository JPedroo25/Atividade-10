package Task7;

// Classe Boleto que estende FormaPagamento
public class Boleto extends FormaPagamento {

    // Método para processar o pagamento com boleto
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " processado via boleto.");
        } else {
            System.out.println("Falha na validação do pagamento via boleto.");
        }
    }

    // Método para validar o pagamento com boleto
    @Override
    public boolean validarPagamento() {
        // Validação simples: simula que o boleto é válido após a verificação
        System.out.println("Validando boleto...");
        return true; // Supondo que o boleto seja sempre válido.
    }
}

