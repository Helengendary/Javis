import java.util.Random;

public class Mundo {
    
    public Lista lista;
    
    void CriarMundo(int colaborativo, int trapaceiro) {
        
        int totalPessoas = colaborativo + trapaceiro;
        lista = new Lista(totalPessoas);
        
        for (int i = 0; i < colaborativo; i++) {
            
            lista.add(new Colaborativo());
        }
        
        for (int i = colaborativo; i < (trapaceiro+colaborativo); i++) {
            
            lista.add(new Trapaceiro());
        }
    }
    
    int Aleatorio(int pessoas) {
        Random gerador = new Random();
        
        return gerador.nextInt(pessoas);
    }

    public void Clonar(Individuos pessoa, Lista lista) {

        if (pessoa.value() == 1) {
                
            lista.add(new Colaborativo());
        }
        if (pessoa.value() == 2) {
                
            lista.add(new Trapaceiro());
        }
    }
    
    public void Rodada() {
        
        Individuos player1 = null;
        Individuos player2 = null;
        
        for (int i = 0; i < lista.getSize()/2; i++) {
            
            player1 = lista.get(Aleatorio(lista.getSize()));
            player2 = lista.get(Aleatorio(lista.getSize()));

            Boolean Jogada2 = player2.contribuicao();
            Boolean Jogada1 = player1.contribuicao();
            
            if (Jogada2 && Jogada1) {

                player1.addMoedas(1);
                player2.addMoedas(1);
            }
            
            if(!Jogada1 && Jogada2){
                
                player2.removeMoedas();
                player1.addMoedas(4);
            }
            
            if(Jogada1 && !Jogada2){
                
                player1.removeMoedas();
                player2.addMoedas(4);
            } 
            
            if(!Jogada1 && !Jogada2){
                
                player1.removeMoedas();
                player2.removeMoedas();
            }             
        }
        
        int TotalColabs = 0, TotalTraps = 0;
        
        for (int j = 0; j < lista.getSize(); j++) {
            
            player1 = lista.get(j);

            player1.removeMoedas();



            // Verifica Moedas
            if (player1.getMoeda() >= 20) {
                
                Clonar(player1, lista);
            }
            if (player1.getMoeda() <= 0) {
                lista.remove(j);
            }
            



            // Verifica pessoa
            if (player1.value() == 1) {
                TotalColabs++;
            }
            if (player1.value() == 2) {
                TotalTraps++;
            }   
        }
        

        System.out.printf("Colaborativos: %d || Trapaceiros: %d\n\n", TotalColabs, TotalTraps);
    }
}
