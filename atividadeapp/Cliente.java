import java.util.ArrayList;

public class Cliente extends User {
    public Cliente (String nome, String cpf, String cep, Integer numero) {
        super(nome, cpf, cep, numero);
    }
    private ArrayList<Produto> Carrinho;

    

    public void AdicionarCarrinho(Produto prod) {
        if (prod.Quantidade > 0) {
            Carrinho.add(prod);
            System.out.println("Produto adicionado ao carrinho!");
        } else {
            System.out.println("Produto Indisponivel");
        }
    }  

    public void VerCatalogo(ArrayList<Loja> Lojas) {
        for (int i = 0; i < Lojas.size(); i++) {
            System.out.println(i + " - " + Lojas.get(i).Nome);
            Lojas.get(i).MostrarProdutos();
        }
    }

    public void Comprar(ArrayList<Loja> Lojas) {
        for (Loja loja : Lojas) {
            for (Produto produto : Carrinho) {
                loja.venderProduto(produto);
            }
        }

        Carrinho.clear();
        System.out.println("Compras feitas e carrinho vazio!! :)");
    }
    public void EsvaziarCarrinho() {

        Carrinho.clear();
        System.out.println("Carrinho vazio!! :)");
    }

    public ArrayList<Produto> getCarrinho() {
        return Carrinho;
    }
}
