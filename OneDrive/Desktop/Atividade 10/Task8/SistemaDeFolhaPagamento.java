package Task8;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeFolhaPagamento {

    private List<Funcionario> funcionarios;

    // Construtor
    public SistemaDeFolhaPagamento() {
        funcionarios = new ArrayList<>();
    }

    // Método para adicionar funcionários
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para calcular a folha de pagamento
    public void calcularFolhaPagamento() {
        double totalSalarios = 0;
        double totalBonus = 0;

        // Iterando sobre a lista de funcionários
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirInformacoes();
            totalSalarios += funcionario.calcularSalario();
            totalBonus += funcionario.calcularBonus();
            System.out.println();
        }

        System.out.println("Total de Salários: R$ " + totalSalarios);
        System.out.println("Total de Bônus: R$ " + totalBonus);
    }

    // Método para promover um funcionário
    public void promoverFuncionario(Funcionario funcionario) {
        if (funcionario instanceof Estagiario) {
            Estagiario estagiario = (Estagiario) funcionario;
            System.out.println(estagiario.getNome() + " foi promovido para Desenvolvedor.");
            adicionarFuncionario(new Desenvolvedor(estagiario.getNome(), estagiario.getSalarioBase()));
            funcionarios.remove(funcionario);
        } else if (funcionario instanceof Desenvolvedor) {
            Desenvolvedor desenvolvedor = (Desenvolvedor) funcionario;
            System.out.println(desenvolvedor.getNome() + " foi promovido para Gerente.");
            adicionarFuncionario(new Gerente(desenvolvedor.getNome(), desenvolvedor.getSalarioBase()));
            funcionarios.remove(funcionario);
        }
    }
}

