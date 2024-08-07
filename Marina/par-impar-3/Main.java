import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> Aleatorio(int tam) {
        ArrayList<Integer> lista  = new ArrayList<>;
        Random rand = new Random();

        for (int i = 0; i < tam; i++) {
            int ale = rand.nextInt(99);
            lista.add(ale);
        }

        return lista;
    };

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array");
        int tamanho = scanner.nextLine();

        ArrayList<Integer> lista = Aleatorio(tamanho);
    }
}