public class Item {

    String nome;
    String preco;

    public Item(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void getItem() {
        System.out.println("Nome:" + this.nome);
    }
}

