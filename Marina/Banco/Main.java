import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cliente cl = new Cliente("","");;
        Conta conta = new Conta(cl);

        Boolean play = true;

        while (play) {

            System.out.print("1 - Cadastro\n2 - Sacar\n3 - Depositar\n4 - Verificar Saldo\n5 - Alterar info pessoais\n6 - Sair");
            int resposta = scan.nextInt();

            switch (resposta) {
                case 1:
                    System.out.print("Digite seu nome:");
                    String newnome = scan.next();

                    System.out.print("Digite seu CPF:");
                    String newcpf = scan.next();

                    cl.UpdateCliente(newnome, newcpf);
                    break;

                case 2:
                    System.out.print("Valor do deposito: ");
                    float newsaldo = scan.nextFloat();

                    conta.Sacar(newsaldo);
                    break;

                case 3:
                    System.out.print("Valor do deposito: ");
                    newsaldo = scan.nextFloat();

                    conta.Depositar(newsaldo);
                    break;

                case 4:
                    System.out.print("\nSaldo atual: R$" + conta.getSaldo() + "\n\n");
                    break;

                case 5:
                    System.out.print("\n\n1 - Mudar Nome\n2 - Mudar CPF\n3 - Ambos");
                    int mudanca = scan.nextInt();

                    switch (mudanca) {
                        case 1:
                            System.out.print("Digite seu nome:");
                            newnome = scan.next();
                            cl.Nome = newnome;
                            break;
                        case 2:
                            System.out.print("Digite seu CPF:");
                            newcpf = scan.next();
                            cl.CPF = newcpf;
                            break;
                        case 3:
                            System.out.print("Digite seu nome:");
                            newnome = scan.next();

                            System.out.print("Digite seu CPF:");
                            newcpf = scan.next();

                            cl.CPF = newcpf;
                            cl.Nome = newnome;
                            break;
                    }
                    break;

                case 6:
                    System.out.println("Sistema encerrado!");
                    play = false;
                    break;

                default:
                    System.out.print("\n\nERROR");
                    break;
            }
        }
    }
}

