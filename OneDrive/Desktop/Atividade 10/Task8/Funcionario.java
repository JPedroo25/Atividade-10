package Task8;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    // Construtor
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato para calcular o salário (a ser implementado pelas subclasses)
    public abstract double calcularSalario();

    // Método abstrato para calcular o bônus (a ser implementado pelas subclasses)
    public abstract double calcularBonus();

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Salário: R$ " + calcularSalario());
        System.out.println("Bônus: R$ " + calcularBonus());
    }
}

