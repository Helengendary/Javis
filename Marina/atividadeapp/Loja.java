import java.util.ArrayList;

public class Loja {
    public String Nome;
    public ArrayList<Produto> Produtos;
    public Integer TotalVendas;

    public Loja(String nome, Integer totalVendas, ArrayList<Loja> Loja) {
        Nome = nome;
        TotalVendas = totalVendas;
        Loja.add(this);
    }

    public void MostrarProdutos() {
        for (Produto prod : this.Produtos) {
            System.out.println(prod.Nome + ", R$" + prod.Preco);
        }
    }

    public void venderProduto(Produto oldProduto) {
        
        if (oldProduto.Quantidade == 0) {
            System.out.println("Produto Indisponível");
            return;
        }

        oldProduto.Quantidade--;
    }
}
