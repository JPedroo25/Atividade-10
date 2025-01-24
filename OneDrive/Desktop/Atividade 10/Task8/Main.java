package Task8;

public class Main {
    public static void main(String[] args) {
        // Criando o sistema de folha de pagamento
        SistemaDeFolhaPagamento sistema = new SistemaDeFolhaPagamento();

        // Criando e adicionando funcionários
        Funcionario estagiario = new Estagiario("João", 1500);
        Funcionario desenvolvedor = new Desenvolvedor("Maria", 4000);
        Funcionario gerente = new Gerente("Carlos", 8000);

        sistema.adicionarFuncionario(estagiario);
        sistema.adicionarFuncionario(desenvolvedor);
        sistema.adicionarFuncionario(gerente);

        // Calculando e exibindo a folha de pagamento
        sistema.calcularFolhaPagamento();

        // Promovendo um funcionário
        sistema.promoverFuncionario(estagiario); // Estagiário promovido para Desenvolvedor
        sistema.promoverFuncionario(desenvolvedor); // Desenvolvedor promovido para Gerente

        // Calculando novamente após as promoções
        System.out.println("\nApós as promoções:");
        sistema.calcularFolhaPagamento();
    }
}

