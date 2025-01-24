package Task6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de Animal
        List<Animal> animais = new ArrayList<>();

        // Adicionando instâncias das subclasses
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        // Iterando sobre a lista e chamando o método emitirSom() de cada animal
        for (Animal animal : animais) {
            animal.emitirSom(); // Polimorfismo: o método correto é chamado para cada tipo de animal
        }
    }
}

