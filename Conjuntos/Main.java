
public class Main {
    
    public static void main(String[] args) {

        Conjunto helena = new Conjunto();

        Conjunto ribeiris = new Conjunto();
        
        Conjunto juan = new Conjunto();

        Conjunto igual = new Conjunto();
        
        Conjunto igualigual = new Conjunto();

        Conjunto teste = new Conjunto();
        
        Conjunto testeteste = new Conjunto();
        
        helena.add(21);
        helena.add(12);
        helena.add(4);
        helena.add(11);
        helena.add(3);
        helena.add(ribeiris);
        
        ribeiris.add(11);
        ribeiris.add(112);
        ribeiris.add(13);
        ribeiris.add(ribeiris);
        
        igual.add(1);
        igualigual.add(1); 


        teste.add(igual);
        testeteste.add(igualigual);
        testeteste.add(igual);


        System.out.println("cont igual: " + igualigual.getConteudo());
        System.out.println("cont teste: " + testeteste.getConteudo());
        System.out.println("teste " + testeteste.ehSubconjunto(igualigual.getConteudo()));

        // System.out.println(ribeiris.getConteudo());
        
        // System.out.println(helena.getConteudo());
        
        // System.out.println(helena.pertence(3));
        // System.out.println(helena.ehSubconjunto(ribeiris.getConteudo()));


        Conjunto.addIntersecao(ribeiris);
        Conjunto.addIntersecao(helena);
        Conjunto.addIntersecao(juan);
        System.out.println(Conjunto.intersecao());

        Conjunto.addUniao(ribeiris);
        Conjunto.addUniao(helena);
        Conjunto.addUniao(juan);
        System.out.println(Conjunto.uniao());


        System.out.println("helena C juan: " + helena.ehSubconjunto(juan.getConteudo()));
        System.out.println("Conteúdo do Juan: " + juan.getConteudo());
        
        System.out.println("11 e helena: " + helena.pertence(11));
        
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
