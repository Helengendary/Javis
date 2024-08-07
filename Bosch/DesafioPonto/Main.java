import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sair = 0;
        
        Scanner scanner = new Scanner(System.in);

        ListaEmpregados listaEmpregados = new ListaEmpregados();
        ListaPonto listaPonto = new ListaPonto();

        Empregado logado = null;
        
        System.out.println("======= LOGIN ========");
        System.out.print("Digite seu cpf: ");
        Long cpf_verifica = scanner.nextLong();
        System.out.print("Digite sua senha: ");
        int senha_verifica = scanner.nextInt();



        while (sair == 0) {
            
            if (cpf_verifica == 12345678910L && senha_verifica == 1234){
                System.out.println("\n1. Cadastrar novo empregado\n2. Listar empregados\n3. Historico\n4. Sair");                    
                int operador = scanner.nextInt();
                scanner.nextLine();
                
                switch (operador) {
                    case 1:
                    // listaEmpregados.add();
                    System.out.print("Digite o nome do novo funcionario: ");
                    String novo_nome = scanner.nextLine();
    
                    System.out.print("Digite o cpf do novo funcionario: ");
                    Long novo_cpf = scanner.nextLong();
    
                    System.out.print("Digite a data de nascimento do novo funcionario: ");
                    int novo_data = scanner.nextInt();
    
                    System.out.print("Digite a senha do novo funcionario: ");
                    int novo_senha = scanner.nextInt();
    
                    Empregado empregado = new Empregado(novo_nome, novo_cpf, novo_data, novo_senha);
                    listaEmpregados.add(empregado);
                    
                    break;
    
                    case 2: 
                    for(int i = 0; i < listaEmpregados.getSize(); i++) {
                        Empregado imprimir = listaEmpregados.get(i);
                        System.out.println("Nome: " + imprimir.getNome() + " | CPF: " + imprimir.getCpf());
                    }
                    break;
                
    
                    case 4:
                        sair = 1;
                    default: 
                    break;
                }
            }   else if (cpf_verifica != 12345678910L && senha_verifica != 1234) {
                
                    // Funcionario1
                    System.out.println("====== CADASTRAR PONTO ======");
                    System.out.println("Digite seu cpf: ");
                    Long cpffunc = scanner.nextLong();
                    scanner.nextLine();
            
                    System.out.println("Dia: ");
                    int dia = scanner.nextInt();
            
                    System.out.println("Mes: ");
                    int mes = scanner.nextInt();
    
                    System.out.println("Ano: ");
                    int ano = scanner.nextInt();
            
                    System.out.println("Digite a hora");
                    int hora = scanner.nextInt();
        
                    System.out.println("Digite o minuto: ");
                    int min = scanner.nextInt();
    
                    Ponto ponto = new Ponto(cpffunc, hora, min, dia, mes, ano);
                    listaPonto.addPonto(ponto);
            } 
        }
        
    }
}
