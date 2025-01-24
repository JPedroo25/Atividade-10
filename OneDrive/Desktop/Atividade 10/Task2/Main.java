package Task2;

public class Main {
    public static void main(String[] args) {
        // Criando um produto
        Produto produto = new Produto("Smartphone", 1500.0, 20);

        // Exibindo as informações do produto
        produto.exibirInformacoes();

        try {
            // Tentando aplicar um desconto de 60% (inválido)
            produto.aplicarDesconto(60.0);
        } catch (DescontoInvalidoException e) {
            System.out.println(e.getMessage()); // Exibe erro
        }

        try {
            // Tentando aplicar um desconto de 30% (válido)
            produto.aplicarDesconto(30.0);
        } catch (DescontoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        // Exibindo as informações após o desconto
        produto.exibirInformacoes();
    }
}

