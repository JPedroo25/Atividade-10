package Task8;

public class Desenvolvedor extends Funcionario {

    // Construtor
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // O salário do desenvolvedor é o salário base
        return getSalarioBase();
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.10; // 10% de bônus sobre o salário base
    }
}

