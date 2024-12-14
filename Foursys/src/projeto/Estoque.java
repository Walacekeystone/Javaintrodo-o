package projeto;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Item> itens;

    public Estoque() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(String codigo) {
        itens.removeIf(item -> item.getCodigo().equals(codigo));
    }

    public void atualizarItem(String codigo, int quantidade, double preco) {
        for (Item item : itens) {
            if (item.getCodigo().equals(codigo)) {
                item.setQuantidade(quantidade);
                item.setPreco(preco);
                break;
            }
        }
    }

    public Item consultarItem(String codigo) {
        for (Item item : itens) {
            if (item.getCodigo().equals(codigo)) {
                return item;
            }
        }
        return null;
    }

    public List<Item> listarTodosItens() {
        return new ArrayList<>(itens);
    }

    public Item comprarItem(String codigo, int quantidadeCompra) {
        for (Item item : itens) {
            if (item.getCodigo().equals(codigo)) {
                int quantidadeAtual = item.getQuantidade();
                if (quantidadeAtual >= quantidadeCompra) {
                    item.setQuantidade(quantidadeAtual - quantidadeCompra);
                    return item;
                } else {
                    System.out.println("Quantidade insuficiente em estoque.");
                    return null;
                }
            }
        }
        System.out.println("Item não encontrado.");
        return null;
    }
}



