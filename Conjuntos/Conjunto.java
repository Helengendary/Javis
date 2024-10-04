import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.CompoundName;

public class Conjunto {

    private ArrayList<Object> conteudo = null;
    private static ArrayList<ArrayList<Object>> listaIntersecao = new ArrayList<>();
    private static ArrayList<ArrayList<Object>> listaUniao = new ArrayList<>();

    Scanner scan = new Scanner(System.in);
 
    // Geters e Setters
    public ArrayList<Object> getConteudo() {
        return conteudo;
    }

    public void setConteudo(ArrayList<Object> conteudo) {
        this.conteudo = conteudo;
    }

    // Função essencial, porém não obrigatória
    public void add(Object valor) {

        if (conteudo == null) {
            conteudo = new ArrayList<>();
        }

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

        if (outro == null) {
            return false;
        }

        if (conteudo == null) {


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
        }

        return true;
    }



    // Para conseguir fazer a interseção de mais de dois conjuntos
    public static void addUniao(Conjunto Conjuntinho) {
        listaUniao.add(Conjuntinho.getConteudo());
    }

    public static void zerarUniao() {
        listaUniao.clear();
    }

    public static void verUniao() {
        System.out.print(listaUniao);
    }
    
    
    
    // Fazer a interseção
    public static ArrayList<Object> uniao() {
        
        boolean tahlahjah = true;
        
        ArrayList<Object> conjunto = new ArrayList<>();
        
        for (int i = 0; i < listaUniao.size(); i++) {
            
            for (int j = 0; listaUniao.get(i) != null && j < listaUniao.get(i).size(); j++) {
                
                tahlahjah = false;
                
                for (int j2 = 0; j2 < conjunto.size(); j2++) {  
                    
                    if (listaUniao.get(i).get(j) == conjunto.get(j2)) {
                        tahlahjah = true;
                    }
                    
                }
                
                if (!tahlahjah) {
                    conjunto.add(listaUniao.get(i).get(j));
                }
            }
        }
        
        return conjunto ;
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




    // Fazer a união
    public static ArrayList<Object> intersecao() {
        
        ArrayList<Object> conjunto = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> COMPARAR = new ArrayList<>();
        
        for (int i = 0; listaIntersecao.get(i) != null && i < listaIntersecao.size(); i++) {
            COMPARAR.add(criarComparador(listaIntersecao.get(i).size()));
        }
        
        for (int i = 0; i < listaIntersecao.size(); i++) {
            for (int j = 0; listaIntersecao.get(i) != null &&j < listaIntersecao.get(i).size(); j++) {
                
                COMPARAR.get(i).set(j, 1);
                
                for (int j2 = 0; j2 < listaIntersecao.size(); j2++) {   
                    if (j2 != j) {
                        for (int k = 0; listaIntersecao.get(j2) != null && k < listaIntersecao.get(j2).size(); k++) {
                            if (listaIntersecao.get(i).get(j) == listaIntersecao.get(j2).get(k) && COMPARAR.get(j2).get(k) == 0) {
                                conjunto.add(listaIntersecao.get(i).get(j));
                            }
                        }                    
                    }
                }
            }
        }
        
        return conjunto ;
    }
}
