import java.util.ArrayList;
import java.util.Scanner;

public class Conjunto {

    Scanner scan = new Scanner(System.in);

    private ArrayList<Object> conteudo = new ArrayList<>();

    public ArrayList<Object> getConteudo() {
        return conteudo;
    }

    public void setConteudo(ArrayList<Object> conteudo) {
        this.conteudo = conteudo;
    }

    public void add(Object valor) {
        conteudo.add(valor);
    }

    public boolean pertence(Object outro) {
        
        for (Object object : conteudo) {
            if (object == outro) {
                return true;
            }
        }
        
        return false;
    }

    public boolean ehSubconjunto(ArrayList<Object> outro) {
        boolean tahDentro = false;
        int index = 0;

        ArrayList<Integer> comparados = new ArrayList<>();

        for (int i = 0; i < conteudo.size(); i++) {
            comparados.add(0);
        }
 
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

    public static ArrayList<Object> intersecao(ArrayList<ArrayList<Object>> objetosIntersecao) {
        boolean tahDentro = false; 
        int index = 0;

        ArrayList<Integer> reciclavel = new ArrayList<>();

        ArrayList<ArrayList<Integer>> COMPARAR = new ArrayList<>();

        for (int i = 0; i < objetosIntersecao.size(); i++) {
            COMPARAR.add(reciclavel);
            for (Object object : objetosIntersecao.get(i)) {
                COMPARAR.get(i).add(0);
            }
        }

        for (ArrayList<Integer> arrayList : COMPARAR) {
            System.out.println(arrayList);
        }
    }
}
