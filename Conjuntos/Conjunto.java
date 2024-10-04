import java.util.ArrayList;
import java.util.Scanner;

public class Conjunto {

    private ArrayList<Object> conteudo = new ArrayList<>();
    private static ArrayList<ArrayList<Object>> listaIntersecao = new ArrayList<>();

    Scanner scan = new Scanner(System.in);
 
    public ArrayList<Object> getConteudo() {
        return conteudo;
    }

    // Geters e Setters
    public void setConteudo(ArrayList<Object> conteudo) {
        this.conteudo = conteudo;
    }

    public void add(Object valor) {
        conteudo.add(valor);
    }


    // Para facilitar a comparação
    public static ArrayList<Integer> criarComparador(int tamanho) {

        ArrayList<Integer> listaNumerica = new ArrayList<>(); 

        for (int i = 0; i < tamanho; i++) {
            listaNumerica.add(0);
        }

        return listaNumerica;
    }



    // Função E 
    public boolean pertence(Object outro) {
        
        for (Object object : conteudo) {
            if (object == outro) {
                return true;
            }
        }
        
        return false;
    }


    // Função C
    public boolean ehSubconjunto(ArrayList<Object> outro) {
        boolean tahDentro = false;
        int index = 0;

        // Verifica repetição
        ArrayList<Integer> comparados = criarComparador(conteudo.size());
 
        for (Object outrosObject : outro) {
            for (Object originalObject : conteudo) {
                if (outrosObject == originalObject && comparados.get(index) == 0) {
                    comparados.set(index, 1);
                    tahDentro = true;
                }
                index++;
            }

            if (!tahDentro) {
                return false;
            }

            tahDentro = false;
            index = 0;
        }

        return true;
    }



    // Para conseguir fazer a interseção de mais de dois conjuntos
    public static void addIntersecao(Conjunto Conjuntinho) {
        listaIntersecao.add(Conjuntinho.getConteudo());
    }

    public static void zerarIntersecao() {
        listaIntersecao.clear();
    }

    public static void verIntersecao() {
        System.out.print(listaIntersecao);
    }



    // Fazer a interseção
    public static ArrayList<Object> intersecao() {

        boolean tahlahjah = true;

        ArrayList<ArrayList<Integer>> COMPARAR = new ArrayList<>();

        ArrayList<Object> conjunto = new ArrayList<>();

        for (int i = 0; i < listaIntersecao.size(); i++) {
            COMPARAR.add(criarComparador(listaIntersecao.get(i).size()));
        }

        for (int i = 0; i < listaIntersecao.size(); i++) {

            System.out.println(listaIntersecao.get(i));

            for (int j = 0; j < listaIntersecao.get(i).size(); j++) {

                
                if (conjunto.size() == 0 || !tahlahjah) {
                    conjunto.add(listaIntersecao.get(i).get(j));
                    System.out.println(tahlahjah);
                }
                
                tahlahjah = false;
                
                for (int j2 = 0; j2 < conjunto.size(); j2++) {  
                    if (listaIntersecao.get(i).get(j) == conjunto.get(j2) && j2 != 0) {
                        tahlahjah = true;
                    }
                }
                
                System.out.println("2" + tahlahjah);
            }
        }

        return conjunto ;
    }
}
