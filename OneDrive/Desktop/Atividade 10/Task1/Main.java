package Task1;

public class Main {
    public static void main(String[] args) {
        // Criando um produto
        Produto produto = new Produto("Laptop", 2500.0, 10);

        // Exibindo as informações do produto
        produto.exibirInformacoes();

        // Tentando alterar o preço para um valor negativo
        produto.setPreco(-1500.0); // Exibe erro

        // Alterando a quantidade em estoque para um valor negativo
        produto.setQuantidadeEmEstoque(-5); // Exibe erro

        // Alterando corretamente os valores
        produto.setPreco(2200.0);
        produto.setQuantidadeEmEstoque(15);

        // Exibindo as novas informações do produto
        produto.exibirInformacoes();
    }
}
