package Eccomerce;

import Conexao.ConexaoMySQL;
import DAO.ProdutoDAO;
import Modelo.Produto;
import java.util.List;

public class AppEcommerce {
    public static void main(String[] args) {
        ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
        ProdutoDAO produtoDAO = new ProdutoDAO(conexaoMySQL);

        System.out.println("\nLista dos 5 Produtos do E-commerce:\n");

        List<Produto> produtos = produtoDAO.listarProdutos();

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }
}
