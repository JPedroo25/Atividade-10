package Task8;

public class Gerente extends Funcionario {

    // Construtor
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // O salário do gerente é o salário base + 20% de bônus
        return getSalarioBase();
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.20; // 20% de bônus sobre o salário base
    }
}

