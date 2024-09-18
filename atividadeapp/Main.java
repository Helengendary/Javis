import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
public static void main(String[] args) {
 
    Scanner scan = new Scanner(System.in);
    ArrayList<Loja> Lojas = new ArrayList<>();
    ArrayList<Dono> Donos = new ArrayList<>();
    ArrayList<Cliente> Clientes = new ArrayList<>();


    System.out.print("1 - Dono de loja\n2 - Usuário\n3 - Registrar Loja\n");
    int user = scan.nextInt();

    Dono atual = new Dono(null, null, null, null, null);
    Cliente atualCliente = new Cliente(null, null, null, null);

    switch (user) {
        
        case 1:
            System.out.println("\n1 - Entrar\n2 - Cadastrar");
            int donoEntrada = scan.nextInt();

            switch (donoEntrada) {
                case 1:
                    
                    for (int i = 0; i < Donos.size(); i++) {
                        System.out.println(i + " - " + Donos.get(i).Nome);
                    }

                    int indexDonoAtual = scan.nextInt();
                    scan.nextLine();

                    atual = Donos.get(indexDonoAtual);

                    System.out.println("Entrado como " + atual.Nome);

                    break;
                
                case 2:
                    System.out.println("Cadatro:\nNome: ");
                    String nomeDono = scan.nextLine();
        
                    System.out.print("CPF:");
                    String cpfDono = scan.nextLine();
        
                    System.out.print("CEP:");
                    String cepDono = scan.nextLine();
                    
                    System.out.print("Numero do endereço:");
                    int numeroDono = scan.nextInt();
                    
                    for (int i = 0; i < Lojas.size(); i++) {
                        System.out.println(i + " - " + Lojas.get(i).Nome);
                    }
        
                    int indexLojaDono = scan.nextInt();
                    scan.nextLine();
                    
                    atual = new Dono(nomeDono, cpfDono, cepDono, numeroDono, Lojas.get(indexLojaDono));
                    
                    break;
            
                default:
                    break;
            }

            System.out.println("1 - Registrar Produto\n2 - Excluir Produto\n3 - Ver quantidade de vendas\n");
            int escolhaTarefaDono = scan.nextInt();

            switch (escolhaTarefaDono) {
                case 1:

                    System.out.println("Nome: ");
                    String nomeNewProduto = scan.nextLine();
                    
                    System.out.println("Preço: ");
                    Float precoNewProduto = scan.nextFloat();
                    
                    System.out.println("Quantidade: ");
                    int quantNewProduto = scan.nextInt();

                    atual.novoProduto(nomeNewProduto, precoNewProduto, quantNewProduto);

                    break;
                case 2:
                    ArrayList<Produto> produtos = atual.getLoja().Produtos;

                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println(i + " - " + produtos.get(i).Nome);
                    }

                    int indexProdutoExcluir = scan.nextInt();

                    produtos.remove(indexProdutoExcluir);
                
                    break;
                case 3:
                    System.out.println("A quantidade de vendas da Loja " + atual.getLoja().Nome + " é " + atual.TotalVendasLoja());
                    break;
            
                default:
                    break;
            }

            break;

        case 2:
            System.out.println("1 - Entrar\n2 - Cadastrar");
            int clienteEntrada = scan.nextInt();

            switch (clienteEntrada) {
                case 1:
                    
                    for (int i = 0; i < Clientes.size(); i++) {
                        System.out.println(i + " - " + Clientes.get(i).Nome);
                    }

                    int indexClienteAtual = scan.nextInt();
                    scan.nextLine();

                    atualCliente = Clientes.get(indexClienteAtual);

                    System.out.println("Entrado como " + atualCliente.Nome);

                    break;
                
                case 2:
                    System.out.println("Cadatro:\nNome: ");
                    String nomeDono = scan.nextLine();
                    scan.nextLine();
                    
                    System.out.print("CPF:");
                    String cpfDono = scan.nextLine();
                    
                    System.out.print("CEP:");
                    String cepDono = scan.nextLine();
                    
                    System.out.print("Numero do endereço:");
                    int numeroDono = scan.nextInt();
                    scan.nextLine();
                    
                    atualCliente = new Cliente(nomeDono, cpfDono, cepDono, numeroDono);
                    break;
            
                default:
                    break;
                }

                System.out.println("\n1 - Ir as compras\n2 - Ver Carrinho\n");

                int escolhaCliente = scan.nextInt();

                switch (escolhaCliente) {
                    case 1:
                        atualCliente.VerCatalogo(Lojas);
                        
                        System.out.println("Numero da loja que deseja comprar: ");
                        int compraLoja = scan.nextInt();
                        
                        System.out.println("Numero do produto que deseja adicionar ao carrinho: ");
                        int compraProduto = scan.nextInt();
        
                        atualCliente.AdicionarCarrinho(Lojas.get(compraLoja).Produtos.get(compraProduto));
                        
                        break;

                    case 2:
                        for (int i = 0; i < atualCliente.getCarrinho().size(); i++) {
                            System.out.println(i + " - " + atualCliente.getCarrinho().get(i).Nome + ", R$ " + atualCliente.getCarrinho().get(i).Preco);
                        }

                        System.out.println("\n1 - Realizar Compra\n2 - Esvaziar Carrinho\n");
                        int escolhaCarrinho = scan.nextInt();

                        switch (escolhaCarrinho) {
                            case 1:
                                atualCliente.Comprar(Lojas);
                                break;
                        
                            case 2:
                                atualCliente.EsvaziarCarrinho();

                            default:
                                break;
                        }
                        break;
                
                    default:
                        break;
                }

                break;
            
        case 3:
            boolean pro = true;

            while (pro) {
                System.out.println("1 - Ver\n2 - Registrar\n0 - sair");
                int scanloja = scan.nextInt();
                scan.nextLine();
    
                switch (scanloja) {
                    case 1:                        
                        for (int i = 0; i < Lojas.size(); i++) {
                            System.out.println("Nome: " + Lojas.get(i).Nome);
                            Lojas.get(i).MostrarProdutos();
                            System.out.println("Total de vendas: " + Lojas.get(i).TotalVendas + "\n"); 
                        }
                        break;
                
                    case 2: 
                        System.out.print("Nome: ");
                        String newLojaNome = scan.nextLine();
                        
                        Loja newLoja = new Loja(newLojaNome);
                        Lojas.add(newLoja);

                        System.out.println("Loja inserida com sucesso.");   
                        break;

                    case 3:
                        pro = false;
                        break;
                }

            }
    
        default:
            break;
    }
    scan.close();
}
}
