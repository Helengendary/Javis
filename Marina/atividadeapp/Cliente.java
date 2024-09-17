import java.util.ArrayList;

public class Cliente extends User {
    public Cliente (String nome, String cpf, String cep, Integer numero) {
        super(nome, cpf, cep, numero);
    }
    private ArrayList<Produto> Carrinho;

    public void AdicionarCarrinho(Produto prod) {
        Carrinho.add(prod);
    }  

    public void VerCatalogo(ArrayList<Loja> Lojas) {
        for (Loja loja : Lojas) {
            System.out.println(loja.Nome);
            loja.MostrarProdutos();
        }
    }

    public void Comprar(ArrayList<Loja> Lojas) {
        for (Loja loja : Lojas) {
            for (Produto produto : Carrinho) {
                // if (condition) {
                    
                // }
                // loja.venderProduto(produto);
            }
        }


        Carrinho.clear();
        System.out.println("Compras feitas e carrinho vazio!! :)");
    }
}
