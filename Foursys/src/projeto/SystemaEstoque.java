package projeto;

import java.util.Scanner;

public class SystemaEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        // PODUTOS DO ESTOQUE
        estoque.adicionarItem(new Item("001", "Arroz", 100, 4.99));
        estoque.adicionarItem(new Item("002", "Feijão", 150, 5.49));
        estoque.adicionarItem(new Item("003", "Macarrão", 200, 2.89));
        estoque.adicionarItem(new Item("004", "Óleo", 120, 6.99));
        estoque.adicionarItem(new Item("005", "Sal", 180, 1.99));
        estoque.adicionarItem(new Item("006", "Açúcar", 100, 3.49));
        estoque.adicionarItem(new Item("007", "Farinha", 150, 2.69));
        estoque.adicionarItem(new Item("008", "Café", 80, 9.99));
        estoque.adicionarItem(new Item("009", "Leite", 90, 3.89));
        estoque.adicionarItem(new Item("010", "Achocolatado", 70, 7.49));
        estoque.adicionarItem(new Item("011", "Biscoito", 120, 2.99));
        estoque.adicionarItem(new Item("012", "Refrigerante", 100, 5.99));
        estoque.adicionarItem(new Item("013", "Suco", 80, 4.49));
        estoque.adicionarItem(new Item("014", "Molho de Tomate", 150, 3.99));
        estoque.adicionarItem(new Item("015", "Manteiga", 60, 7.89));
        estoque.adicionarItem(new Item("016", "Iogurte", 90, 3.69));
        estoque.adicionarItem(new Item("017", "Pão", 200, 0.60));
        estoque.adicionarItem(new Item("018", "Queijo", 50, 15.99));
        estoque.adicionarItem(new Item("019", "Presunto", 300, 13.49));
        estoque.adicionarItem(new Item("020", "Cereal", 200, 8.99));

        double valorTotalCompra = 0.0;

        while (true) {
            System.out.println("Sistema de Controle de Estoque");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Atualizar item");
            System.out.println("4. Consultar item");
            System.out.println("5. Listar todos os itens");
            System.out.println("6. Sair");
            System.out.println("7. Comprar item");
            System.out.println("8. Valor total da compra");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    estoque.adicionarItem(new Item(codigo, nome, quantidade, preco));
                    break;
                case 2:
                    System.out.print("Código do item a remover: ");
                    codigo = scanner.nextLine();
                    estoque.removerItem(codigo);
                    break;
                case 3:
                    System.out.print("Código do item a atualizar: ");
                    codigo = scanner.nextLine();
                    System.out.print("Nova quantidade: ");
                    quantidade = scanner.nextInt();
                    System.out.print("Novo preço: ");
                    preco = scanner.nextDouble();
                    estoque.atualizarItem(codigo, quantidade, preco);
                    break;
                case 4:
                    System.out.print("Código do item a consultar: ");
                    codigo = scanner.nextLine();
                    Item item = estoque.consultarItem(codigo);
                    if (item != null) {
                        System.out.println(item);
                    } else {
                        System.out.println("Item não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Itens no estoque:");
                    for (Item i : estoque.listarTodosItens()) {
                        System.out.println(i);
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                case 7:
                    System.out.print("Código do item a comprar: ");
                    codigo = scanner.nextLine();
                    System.out.print("Quantidade a comprar: ");
                    int quantidadeCompra = scanner.nextInt();
                    Item itemCompra = estoque.comprarItem(codigo, quantidadeCompra);
                    if (itemCompra != null) {
                        valorTotalCompra += itemCompra.getPreco() * quantidadeCompra;
                    }
                    break;
                case 8:
                    System.out.printf("Valor total da compra: R$ %.2f%n", valorTotalCompra);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
