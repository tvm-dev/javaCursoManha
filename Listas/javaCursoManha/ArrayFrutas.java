package javaCursoManha;

public class ArrayFrutas {
    private String nome;
    private String cor;
    private double peso; // em gramas

    // Construtor da classe Frutas:
    public ArrayFrutas(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    // Métodos para acessar os atributos:
    // Acessando o nome;
    public String getNome() {
        return nome;
    }

    // Acessando a cor:
    public String getCor() {
        return cor;
    }

    // Acessando o peso:
    public double getPeso() {
        return peso;
    }

    // Método para imprimir as informações das frutas:
    public void imprimirInfos() {
        System.out.println("Fruta: " + nome + ", Cor: " + cor + ", Peso: " + peso + " g");
    }
}

// Classe principal:
class Main {
    public static void main(String[] args) {
        // Criação de um array de objetos de classe ArrayFrutas:
        ArrayFrutas[] arrayFrutas = {
            new ArrayFrutas("Maçã", "Vermelha", 150.5),
            new ArrayFrutas("Banana", "Amarela", 125.5),
            new ArrayFrutas("Laranja", "Laranja", 180),
            new ArrayFrutas("Uva", "Verde", 200.5),
            new ArrayFrutas("Manga", "Verde", 2000.5)
        };

        // Exibindo informações de cada fruta:
        System.out.println("Informações sobre as frutas: ");
        for (int i = 0; i < arrayFrutas.length; i++) {
            arrayFrutas[i].imprimirInfos();
        }
    }
}
