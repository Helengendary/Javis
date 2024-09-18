import java.util.ArrayList;

public class Loja {
    public String Nome;
    public ArrayList<Produto> Produtos;
    public Integer TotalVendas;

    public Loja(String nome) {
        this.Nome = nome;
        this.TotalVendas = 0;
        this.Produtos = null;
    }

    public void MostrarProdutos() {

        if (Produtos == null) {
            return;
        }

        for (int i = 0; i < Produtos.size(); i++) {

            System.out.println(i + " - "  + Produtos.get(i).Nome + ", R$" + Produtos.get(i).Preco);
        }
    }

    public void venderProduto(Produto oldProduto) {
        if (oldProduto.Quantidade == 0) {
            System.out.println("Produto Indisponível");
            return;
        }

        oldProduto.Quantidade--;
        TotalVendas++;
    }
}
