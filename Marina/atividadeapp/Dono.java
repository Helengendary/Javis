public class Dono extends User{

    public Dono (String nome, String cpf, String cep, Integer numero) {
        super(nome, cpf, cep, numero);
    }
    private Loja Loja;

    public void novoProduto(String nome, Float preco, Integer quantidade) {
        Produto produto = new Produto(nome, preco, quantidade, this.Loja);
        Loja.Produtos.add(produto); 
    }

    public void retirarProduto(Produto produto) {
        System.out.println("Produto retirado com sucesso");
        Loja.Produtos.remove(produto);
    }

    public Integer TotalVendasLoja() {
        return Loja.TotalVendas;
    }

    public Loja getLoja() {
        return Loja;
    }

    public void setLoja(Loja loja) {
        Loja = loja;
    }
}