package Task7;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de diferentes formas de pagamento
        FormaPagamento cartaoCredito = new CartaoCredito();
        FormaPagamento boleto = new Boleto();
        FormaPagamento pix = new Pix();

        // Simulando pagamentos
        double valorPagamento = 150.0; // Valor para o pagamento

        // Processando pagamento com Cartão de Crédito
        cartaoCredito.processarPagamento(valorPagamento);

        // Processando pagamento com Boleto
        boleto.processarPagamento(valorPagamento);

        // Processando pagamento com Pix
        pix.processarPagamento(valorPagamento);
    }
}

