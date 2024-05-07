public class Main {
    public static void main(String[] args) {
        
        // Cria lista Generica
        Stack<Integer> ListaInt = new Stack<Integer>(10);

        ListaInt.push(10);
        ListaInt.push(20);
        ListaInt.push(30);
        ListaInt.push(40);
        ListaInt.push(50);
        ListaInt.push(60);
        ListaInt.push(70);
        ListaInt.push(80);
        ListaInt.push(90);

        
        Integer pop = ListaInt.pop();
        
        System.out.println(pop);
       

        System.out.println(ListaInt.pop());
        System.out.println(ListaInt.peek());

        System.out.println();
        System.out.println(ListaInt.size());
    }
}