public class Pessoa {
    private String nome;
    public Time birth;

    public Pessoa (String nome, Time hora) {
        this.nome = nome;
        this.birth = hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
