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

    public void getNome() {
        System.out.println("Nome: " + this.nome);
    }

    public void adicionarItem(String item, String preco) {
        this.cardapio.add(item + " " + preco);
    }

    public void imprimirMenu() {
        for (String item : cardapio) {
            System.out.println(item);
        }
    }
}
