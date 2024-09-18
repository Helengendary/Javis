public class Dono extends User{

    private Loja Loja;

    public Dono (String nome, String cpf, String cep, Integer numero, Loja loja) {
        super(nome, cpf, cep, numero);
        this.Loja = loja;
    }

    public void novoProduto(String nome, Float preco, Integer quantidade) {
        Produto produto = new Produto(nome, preco, quantidade, this.Loja);
        System.out.println("Produto registrado com sucesso!");
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