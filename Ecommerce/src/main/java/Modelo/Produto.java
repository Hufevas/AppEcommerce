package Modelo;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidadeEstoque;

    public Produto(int id, String nome, String descricao, double preco, int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s - R$ %.2f | Estoque: %d\nDescrição: %s\n",
                id, nome, preco, quantidadeEstoque, descricao);
    }
}
