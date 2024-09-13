import java.util.ArrayList;

public class Cargo {
    private int hierarquia;
    private float Salario;
    public ArrayList<String> funcoes;
    public String horárioSaída;
    public  String horárioEntrada;

    

    public void setHierarquia(int hierarquia) {
        this.hierarquia = hierarquia;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public int getHierarquia() {
        return hierarquia;
    }

    public float getSalario() {
        return Salario;
    }

    public void trabalha() {

    }
}
