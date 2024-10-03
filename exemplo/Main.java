public class Main {
    public static void main(String[] args) {

        Pessoa helena = new Pessoa("helena", Time.now());
        Time relogio = new Time(1,1,1,1,1);
 
        while(relogio.isBiggerThan(Time.now())) {
            System.out.println("maior");
        }

        System.out.println("Helena");
        System.out.println(helena.getNome());
    
        
    }
}