public class Dono extends User{

    private Loja Loja;

    public Dono (String nome, String cpf, String cep, Integer numero, Loja loja) {
        super(nome, cpf, cep, numero);
        this.Loja = loja;
    }

    public void novoProduto(String nome, Float preco, Integer quantidade, Loja loja) {
        Produto produto = new Produto(nome, preco, quantidade, this.Loja);
        loja.Produtos.add(produto);
        System.out.println("Produto registrado com sucesso!");
    }

    public void retirarProduto(Produto produto) {
        System.out.println("Produto retirado com sucesso");
        this.Loja.Produtos.remove(produto);
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