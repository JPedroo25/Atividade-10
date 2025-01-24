package Task3;

// Subclasse Desenvolvedor
public class Desenvolvedor extends Funcionario {

    // Construtor
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario); // Chama o construtor da classe base
    }

    // Sobrescrita do método calcularBonus
    @Override
    public double calcularBonus() {
        return salario * 0.10; // Bônus de 10% para Desenvolvedor
    }
}

