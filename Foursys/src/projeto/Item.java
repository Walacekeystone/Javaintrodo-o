package projeto;

public class Item {
    private String codigo;
    private String nome;
    private int quantidade;
    private double preco;

    public Item(String codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public String toString() {
        return "Item{" +
                "codigo = " + codigo + '\'' +
                " nome = " + nome + '\'' +
                " quantidade =" + quantidade +
                " preco =" + preco +
                '}';
    }

    // SERIALIZA O ITEM PARA UMA STRING
    public String toCSV() {
        return codigo + "," + nome + "," + quantidade + "," + preco;
    }

    // DESSERIALIZA UMA STRING PARA UM ITEM
    public static Item fromCSV(String csv) {
        String[] parts = csv.split(",");
        String codigo = parts[0];
        String nome = parts[1];
        int quantidade = Integer.parseInt(parts[2]);
        double preco = Double.parseDouble(parts[3]);
        return new Item(codigo, nome, quantidade, preco);
    }
}
