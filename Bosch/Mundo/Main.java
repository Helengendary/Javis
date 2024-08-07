public class Main {

    public static void main(String[] args) {
    
        Mundo mundo = new Mundo();

        Integer colaborativos = 1;
        Integer trapaceiros = 123;
        Integer rabugentos = 0;

        mundo.CriarMundo(colaborativos, trapaceiros, rabugentos);
        
        while (mundo.Rodada() != 0) {
            mundo.Rodada();
        } 
    }
}