import java.util.ArrayList;

public class Restaurante {
    String nome;
    double avaliacao;
    ArrayList<String> cardapio;

    public Restaurante(String nome, double avaliacao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.cardapio = new ArrayList<>();
    }

    void getNome() {
        System.out.println("Nome: " + this.nome);
    }

    void adicionarItem(String item) {
        this.cardapio.add(item);
    }

    void imprimirMenu() {
        for (String item : cardapio) {
            System.out.println(item);
        }
    }
}
