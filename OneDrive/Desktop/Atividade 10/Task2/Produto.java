package Task2;

public class Produto {
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        setPreco(preco); // Usando o setter para validar o preço
        setQuantidadeEmEstoque(quantidadeEmEstoque); // Usando o setter para validar a quantidade
    }

    // Métodos para acessar (getters)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Métodos para modificar (setters) com validação
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo.");
        }
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque >= 0) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else {
            System.out.println("Erro: A quantidade em estoque não pode ser negativa.");
        }
    }

    // Método para aplicar o desconto
    public void aplicarDesconto(double porcentagem) throws DescontoInvalidoException {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new DescontoInvalidoException("Erro: O desconto não pode ser negativo ou superior a 50%.");
        }

        // Calcula o novo preço após aplicar o desconto
        double desconto = preco * (porcentagem / 100);
        preco -= desconto; // Atualiza o preço com o desconto aplicado
    }

    // Método para exibir informações do produto
    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}

