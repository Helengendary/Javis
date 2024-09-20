import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
public static void main(String[] args) {
 
    Scanner scan = new Scanner(System.in);
    ArrayList<Loja> Lojas = new ArrayList<>();
    ArrayList<Dono> Donos = new ArrayList<>();
    ArrayList<Cliente> Clientes = new ArrayList<>();

    Dono atual = new Dono(null, null, null, null, null);
    Cliente atualCliente = new Cliente(null, null, null, null);

    boolean dentro = true;
    int locate = 1;

    while (dentro) {

        switch (locate) {

            case 1:
                System.out.print("\n2 - Dono de loja\n3 - Usuário\n4 - Registrar Loja\n0 - Fechar\n");
                locate = scan.nextInt();

                break;

            case 2:
                System.out.println("\nMenu Dono da Loja\n5 - Entrar\n6 - Cadastrar\n1 - Voltar\n");
                locate = scan.nextInt();

                break;

            case 3:
                System.out.println("\nMenu Usuário\n7 - Entrar\n8 - Cadastrar\n1 - Voltar\n");
                locate = scan.nextInt();
                break;

            case 4:
                System.out.println("\nMenu Registrar Loja\n18 - Ver\n19 - Registrar\n1 - Voltar");
                locate = scan.nextInt();
                break;

            case 5:
                for (int i = 0; i < Donos.size(); i++) {
                    System.out.println(i + " - " + Donos.get(i).Nome);
                }

                int indexDonoAtual = scan.nextInt();

                atual = Donos.get(indexDonoAtual);

                System.out.println("Entrado como " + atual.Nome);

                locate = 9;
                break;

            case 6:
                System.out.println("Cadatro Dono de Loja\nNome: ");
                String nomeDono = scan.next();
                scan.nextLine();

                System.out.print("CPF:");
                String cpfDono = scan.next();
                scan.nextLine();

                System.out.print("CEP:");
                String cepDono = scan.next();
                scan.nextLine();

                System.out.print("Numero do endereço:");
                int numeroDono = scan.nextInt();
                scan.nextLine();

                for (int i = 0; i < Lojas.size(); i++) {
                    System.out.println(i + " - " + Lojas.get(i).Nome);
                }

                int indexLojaDono = scan.nextInt();
                scan.nextLine();

                atual = new Dono(nomeDono, cpfDono, cepDono, numeroDono, Lojas.get(indexLojaDono));
                System.out.println("Cadastrado e entrado como " + atual.Nome);
                Donos.add(atual);


                locate = 9;
                break;

            case 7:
                for (int i = 0; i < Clientes.size(); i++) {
                    System.out.println(i + " - " + Clientes.get(i).Nome);
                }

                int indexClienteAtual = scan.nextInt();
                scan.nextLine();

                atualCliente = Clientes.get(indexClienteAtual);

                System.out.println("Entrado como " + atualCliente.Nome);

                locate = 13;
                break;

            case 8:
                System.out.println("Cadatro:\nNome: ");
                String nomeCliente = scan.nextLine();
                scan.nextLine();

                System.out.print("CPF:");
                String cpfCliente = scan.nextLine();

                System.out.print("CEP:");
                String cepCliente = scan.nextLine();

                System.out.print("Numero do endereço:");
                int numeroCliente = scan.nextInt();
                scan.nextLine();

                atualCliente = new Cliente(nomeCliente, cpfCliente, cepCliente, numeroCliente);
                System.out.println("Cadastrado e entrado como " + atualCliente.Nome);

                locate = 13;
                break;

            case 9:
                System.out.println("10 - Registrar Produto\n11 - Excluir Produto\n12 - Ver quantidade de vendas\n2 - Voltar");
                locate = scan.nextInt();
                break;

            case 10:
                System.out.println("Nome: ");
                String nomeNewProduto = scan.next();
                scan.nextLine();

                System.out.println("Preço: ");
                Float precoNewProduto = scan.nextFloat();
                scan.nextLine();

                System.out.println("Quantidade: ");
                int quantNewProduto = scan.nextInt();
                scan.nextLine();

                atual.novoProduto(nomeNewProduto, precoNewProduto, quantNewProduto, atual.getLoja());


                locate = 9;
                break;

            case 11:
                ArrayList<Produto> produtos = atual.getLoja().Produtos;
                System.out.println(produtos + " Helena");

                for (int i = 0; i < produtos.size(); i++) {
                    System.out.println(i + " - " + produtos.get(i).Nome);
                }

                int indexProdutoExcluir = scan.nextInt();

                produtos.remove(indexProdutoExcluir);

                locate = 9;
                break;

            case 12:
                System.out.println("A quantidade de vendas da Loja " + atual.getLoja().Nome + " é " + atual.TotalVendasLoja());
                locate = 9;
                break;

            case 13:
                System.out.println("\n14 - Ir as compras\n15 - Ver Carrinho\n3 - Voltar\n");
                locate = scan.nextInt();
                break;

            case 14:
                atualCliente.VerCatalogo(Lojas);

                System.out.println("Numero da loja que deseja comprar: ");
                int compraLoja = scan.nextInt();

                System.out.println("Numero do produto que deseja adicionar ao carrinho: ");
                int compraProduto = scan.nextInt();

                atualCliente.AdicionarCarrinho(Lojas.get(compraLoja).Produtos.get(compraProduto));

                locate = 13;
                break;

            case 15:
                for (int i = 0; i < atualCliente.getCarrinho().size(); i++) {
                    System.out.println(i + " - " + atualCliente.getCarrinho().get(i).Nome + ", R$ " + atualCliente.getCarrinho().get(i).Preco);
                }

                System.out.println("\n16 - Realizar Compra\n17 - Esvaziar Carrinho\n13 - Voltar\n");
                locate = scan.nextInt();
                break;

            case 16:
                atualCliente.Comprar(Lojas);
                locate = 15;
                break;

            case 17:
                atualCliente.EsvaziarCarrinho();
                locate = 15;
                break;

            case 18:
                for (int i = 0; i < Lojas.size(); i++) {
                    System.out.println("Nome: " + Lojas.get(i).Nome);
                    Lojas.get(i).MostrarProdutos();
                    System.out.println("Total de vendas: " + Lojas.get(i).TotalVendas + "\n");
                }

                locate = 4;
                break;

            case 19:
                System.out.print("\nNome: ");
                String newLojaNome = scan.next();
                scan.nextLine();

                Loja newLoja = new Loja(newLojaNome);
                Lojas.add(newLoja);

                System.out.println("Loja inserida com sucesso.");

                locate = 4;
                break;

            case 0:
                dentro = false;
                break;

            default:
                System.out.println("Ta no default");
                break;
        }
    }
}
}
