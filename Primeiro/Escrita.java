import java.util.Scanner;

public class Escrita {

    public Escrita(String marca, String Material){

    }

    public String Marca;
    public String Material;
    public Float Espessura;
    public String Cor;
    public String Note = "";

    public void escrever(String texto){
        System.out.println("Escrevendo...");
        Note += texto + "\n";
        System.out.println("Notas: " + Note);
    }

    public void setMarca(String marca) {
        Marca = marca;
        System.out.println("Marca: " + Marca);
    }

    public void setEspessura(Float espessura) {
        Espessura = espessura;
        System.out.println("Espessura: " + Espessura);
    }

    public void setMaterial(String mat){
        this.Material = mat;
        System.out.println("Material: " + this.Material);
    }

    public void setCor(String cor){
        this.Cor = cor;
        System.out.println("Cor: " + this.Cor);
    }
}
