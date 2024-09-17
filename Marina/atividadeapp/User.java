public class User {

    public String Nome;
    private String CPF;
    private String CEP;
    private Integer NumeroCep;

    public User (String nome, String cpf, String cep, Integer numeroCep) {
        this.Nome = nome;
        this.CPF = cpf;
        this.CEP = cep;
        this.NumeroCep = numeroCep;
    }
    
    public String getNome() {
        return Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getCEP() {
        return CEP;
    }

    public Integer getNumeroCep() {
        return NumeroCep;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public void setNumeroCep(Integer numeroCep) {
        NumeroCep = numeroCep;
    }
}