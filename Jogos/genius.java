import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Genius {
    public static void main(String[] args) {
        boolean acerto = true;
        int jogadas = 0;
        List<Integer> sorteados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (acerto) {
            jogadas++;
            Random random = new Random();
            int atual = random.nextInt(4) + 1;
            sorteados.add(atual);

            for (int i = 0; i < jogadas; i++) {
                limparTela();
                System.out.println((i + 1) + ": " + sorteados.get(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                limparTela();
            }

            for (int i = 0; i < jogadas; i++) {
                System.out.print("Insira o número " + (i + 1) + " da sequência: ");
                int user = scanner.nextInt();
                if (sorteados.get(i) != user) {
                    System.out.println("Você errou");
                    System.out.println("A sequência era " + sorteados);
                    acerto = false;
                }
            }

            if (jogadas == 100) {
                System.out.println("Parabéns, você chegou em 100 jogadas!");
                acerto = false;
            }
        }
    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}