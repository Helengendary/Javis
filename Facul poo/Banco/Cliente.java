import java.util.ArrayList;

public class Cliente {
    public String Nome;
    public String CPF;

    public Cliente(String nome, String cpf) {

        this.Nome = nome.toUpperCase();
        this.CPF = cpf;
    }

    public void UpdateCliente(String nome, String cpf){

        this.Nome = nome.toUpperCase();
        this.CPF = cpf;
    }
}