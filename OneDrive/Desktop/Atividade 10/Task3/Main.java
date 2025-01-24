package Task3;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Gerente e Desenvolvedor
        Funcionario gerente = new Gerente("Carlos", 5000.0);
        Funcionario desenvolvedor = new Desenvolvedor("Ana", 4000.0);

        // Exibindo informações e bônus de cada funcionário
        System.out.println("Informações do Gerente:");
        gerente.exibirInformacoes();
        System.out.println("Bônus: R$ " + gerente.calcularBonus() + "\n");

        System.out.println("Informações do Desenvolvedor:");
        desenvolvedor.exibirInformacoes();
        System.out.println("Bônus: R$ " + desenvolvedor.calcularBonus());
    }
}

