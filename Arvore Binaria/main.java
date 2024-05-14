public class main{
    public static void main(String[] args) { 

        ManipularArquivo file = new ManipularArquivo();
        List<List<Integer>> lista = file.Resto("./text/desafio1.txt", 4);
        Hash<Integer> hash = new Hash<Integer>();
        

        for(int i = 0; i < lista.size(); i++){
            System.out.print(i + " > ");
            List<Integer> filhos = lista.get(i);
            for (int j = 0; j < filhos.size(); j++) {
                System.out.print(filhos.get(j).toString() + ", ");
            }
            System.out.println();
        }

        for (int i = 0; i < lista.size(); i++) {
            List<Integer> filhos = lista.get(i);
            
            for (int j = 0; j < filhos.size(); j++) {
                int value = filhos.get(j);
                
                if (hash.contains) {
                    System.out.println("Um ciclo");    
                }
                hash.addHash(value);
                
                    
            }
        }          
    }
}
