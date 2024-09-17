public class Dono extends User{

    public Dono (String nome, String cpf, String cep, Integer numero) {
        super(nome, cpf, cep, numero);
    }
    private Loja Loja;

    public Loja getLoja() {
        return Loja;
    }

    public void setLoja(Loja loja) {
        Loja = loja;
    }
}