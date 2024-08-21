import java.util.ArrayList;

public class Banco {
    public String Nome;
    private ArrayList<String> Clientes;

    public ArrayList<String> getClientes() {
        return Clientes;
    }

    public void addClientes(String nome) {
        Clientes.add(nome);
    }
}
