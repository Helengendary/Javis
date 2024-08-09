public class Main {
    public static void main(String[] args){
        Escrita lapis = new Escrita("BIC", "Grafite");
        Escrita caneta = new Escrita("BIC", "Tinta");
        Escrita marcaTexto = new Escrita("BIC", "Tinta florecente");

        System.out.println("\nLápis\n");

        lapis.setCor("Rosa");
        lapis.setEspessura(0.7F);
        lapis.setTamanho(12F);
        lapis.escrever("Comprar Biscoito");
        lapis.escrever("Comprar pulseira");

        System.out.println("\nCaneta\n");

        caneta.setCor("Azul");
        caneta.setTamanho(40F); 
        caneta.setEspessura(0.9F);
        caneta.escrever("Helena");
        caneta.escrever("Picinin");

        System.out.println("\nMarca Texto\n");

        marcaTexto.setCor("Amarelo");
        marcaTexto.setTamanho(20F);
    }
}
