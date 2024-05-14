import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class ManipularArquivo {

    List<List<Integer>> Resto(String file, int capacidade){
        
        List<List<Integer>> lista = new List<List<Integer>>(capacidade); //criando lista de lista, definindo lista pais

        for (int i = 0; i < capacidade; i++)
            lista.add(null); 
        
        File resto = new File(file); // definindo arquivo
        Scanner scanner = null;
        
        try{
            scanner = new Scanner(resto);
            
            while (scanner.hasNextLine()) { // indo de linha em linha 

                List<Integer> filhos = new List<Integer>(capacidade); // definindo lista filhos

                String linha = scanner.nextLine(); // linha recebe cada linha
                
                int posicaoCaractereEspecifico = linha.indexOf('>'); // definindo caracter especifico

                String caracteresAposCaractereEspecifico = linha.substring(posicaoCaractereEspecifico + 1); // pegando os valores a aprit do caracter definido
                
                String[] substrings  = caracteresAposCaractereEspecifico.split(","); // removendo virgula
                
                for (int i = 0; i < substrings.length; i++) {
                    
                    String caracter = substrings[i].trim(); // trim() remove os espaços em branco em excesso
                    
                    if (caracter.equals(""))
                        continue; // se tiver espaço em branco continua
                    
                    filhos.add(Integer.parseInt(caracter)); // convertendo para int
                }  
                
                char primeiroCaractere = linha.charAt(0); // seprando o primeiro caracter
                int primeiro = Character.getNumericValue(primeiroCaractere); // convertendo primeirocaracter para int
                lista.set(primeiro, filhos); //inserindo na lista pai
            }

        }catch (IOException e) {  
            System.out.println("Error: Not found file" + e.getMessage());
        }finally {
            if (scanner != null) {
              scanner.close(); 
            }    
        }

        return lista;
    }
}
