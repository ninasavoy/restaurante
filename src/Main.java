import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Restaurante> restaurantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Listar restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o nome do restaurante: ");
                String nome = scanner.nextLine();
                System.out.println("Digite a avaliacao do restaurante: ");
                double avaliacao = scanner.nextDouble();
                Restaurante restaurante = new Restaurante(nome, avaliacao);
                restaurantes.add(restaurante);
                System.out.println("Restaurante " + nome + " cadastrado com sucesso!");
            }
            else if (opcao == 2) {
                System.out.println("Restaurantes cadastrados:");
                for (int id = 0; id < restaurantes.size(); id++) {
                    Restaurante restaurante = restaurantes.get(id);
                    System.out.println(id + ":" + restaurante);
                    restaurante.imprimirMenu();
                }
            }
            else if (opcao == 3) {
                System.out.println("Escolha o número do restaurante para adicionar um item ao menu: ");
                int avaliacao = scanner.nextInt();
                Restaurante rest = restaurantes.get(avaliacao);
                System.out.println("Digite o nome do item: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o preco do item: ");
                String preco = scanner.nextLine();
                Item item = new Item(nome, preco);
                String dinge = item.toString();
                rest.adicionarItem(dinge);

            }
            else if (opcao == 4) {
                System.out.print("Obrigado por utilizar o sistema de cadastro de restaurantes!");
                break;
            }
            else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
