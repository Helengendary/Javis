
public class Main {
    
    public static void main(String[] args) {

        Conjunto helena = new Conjunto();

        Conjunto ribeiris = new Conjunto();
        
        
        helena.add(21);
        helena.add(12);
        helena.add(4);
        helena.add(11);
        helena.add(3);
        helena.add(ribeiris);
        
        ribeiris.add(11);
        ribeiris.add(112);
        ribeiris.add(13);
        
        // System.out.println(ribeiris.getConteudo());
        
        // System.out.println(helena.getConteudo());
        
        // System.out.println(helena.pertence(3));
        // System.out.println(helena.ehSubconjunto(ribeiris.getConteudo()));


        Conjunto.addIntersecao(ribeiris);
        Conjunto.addIntersecao(helena);
        System.out.println(Conjunto.intersecao());
        
        // Conjunto dois = new Conjunto();
        // Conjunto doisdois = new Conjunto();
        // dois.add(2);
        // doisdois.add(2);
        // doisdois.add(2);

        // TESTE DE NÚMEROS REPETIDOS
        // System.out.println(dois.getConteudo());
        // System.out.println(doisdois.getConteudo());
        // System.out.println(dois.ehSubconjunto(doisdois.getConteudo()));
    }


}
