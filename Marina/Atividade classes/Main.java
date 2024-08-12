public class Main {
    public static void main(String[] args) throws InterruptedException {
        Pet cachorro = new Pet("Paçoca", "Vira lata", "Pequeno", 5, "Loiro");
        Pet gato = new Pet("Jasmin", "Siamês", "Pequeno", 10, "Branca, rosto, patinha e rabo preto");
        Pet porco = new Pet("Napoleão", "Landrace", "Médio", 24, "Rosa");

        // a idade está em meses

        System.out.println("\nCachorro\n");

        cachorro.EmitirSom("Au au au");
        cachorro.Comer();
        cachorro.Brincar();
        cachorro.ColocarComida();
        cachorro.Comer();

        System.out.println("\nGato\n");

        gato.EmitirSom("Au au au");
        gato.Comer();
        gato.Brincar();
        gato.ColocarComida();
        gato.Comer();

        System.out.println("\nPorco\n");

        porco.EmitirSom("Au au au");
        porco.Comer();
        porco.Brincar();
        porco.ColocarComida();
        porco.Comer();
    }


}
