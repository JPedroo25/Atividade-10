package Task5;

public class Main {
    public static void main(String[] args) {
        // Criando um array de IMeioTransporte
        IMeioTransporte[] transportes = new IMeioTransporte[3];

        // Instanciando os diferentes meios de transporte
        transportes[0] = new Carro();
        transportes[1] = new Bicicleta();
        transportes[2] = new Trem();

        // Percorrendo o array e chamando os métodos acelerar() e frear() para cada transporte
        for (IMeioTransporte transporte : transportes) {
            transporte.acelerar(); // Polimorfismo: chama o método específico para cada tipo
            transporte.frear();    // Polimorfismo: chama o método específico para cada tipo
            System.out.println();  // Apenas para separar a saída de cada transporte
        }
    }
}

