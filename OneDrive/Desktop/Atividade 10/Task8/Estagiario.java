package Task8;

public class Estagiario extends Funcionario {

    // Construtor
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // O salário do estagiário é o salário base
        return getSalarioBase();
    }

    @Override
    public double calcularBonus() {
        return 0; // Estagiários não recebem bônus
    }
}

