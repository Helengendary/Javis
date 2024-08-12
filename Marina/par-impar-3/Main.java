import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Aleatorio {

    public ArrayList<Integer> Aleatorio(int tam) {
        ArrayList<Integer> lista  = new ArrayList<>();
        Random rand = new Random();
    
        for (int i = 0; i < tam; i++) {
            int ale = rand.nextInt(99);
            lista.add(ale);
        }
    
        return lista;
    };
    
    public void Verificar(ArrayList<Integer> lista) {

        for (int i = 0; i<lista.size(); i++) {
            int atual = lista.get(i);

            if ((atual%2) == 0) {
                System.out.println(atual + " é Par");
            } else if ((atual%3) == 0) { 
                System.out.println(atual + " é Múltiplo de três");
            } else {
                System.out.println(atual + " é Impar");
            }
        }
    }
}

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Aleatorio ale = new Aleatorio();

        System.out.println("Digite o tamanho do array");
        int tamanho = scanner.nextInt();

        ArrayList<Integer> lista = ale.Aleatorio(tamanho);

        ale.Verificar(lista);
    }
}