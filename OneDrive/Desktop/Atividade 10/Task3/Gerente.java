package Task3;

// Subclasse Gerente
public class Gerente extends Funcionario {

    // Construtor
    public Gerente(String nome, double salario) {
        super(nome, salario); // Chama o construtor da classe base
    }

    // Sobrescrita do método calcularBonus
    @Override
    public double calcularBonus() {
        return salario * 0.20; // Bônus de 20% para Gerente
    }
}

