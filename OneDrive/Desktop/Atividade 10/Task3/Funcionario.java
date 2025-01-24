package Task3;

// Classe base Funcionario
public class Funcionario {
    // Atributos protegidos
    protected String nome;
    protected double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para calcular o bônus (deve ser sobrescrito pelas subclasses)
    public double calcularBonus() {
        return 0.0; // Valor padrão para a classe base (não implementado aqui)
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }
}

