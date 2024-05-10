import java.util.Random;

abstract class Individuos {

    Random random = new Random();

    protected int moedas = 10;
    abstract boolean contribuicao();
    abstract int value();

    public int getMoeda() {
        return this.moedas;
    }

    public void addMoedas(int quantidade) {
        this.moedas += quantidade;
    }
    
    public void removeMoedas() {
        this.moedas -= 1;
    }

    public void probabilidadeRemoveMoedas() {
        
        int probabilidade = random.nextInt(100);
        
        if (probabilidade <= 10) {

            this.moedas -= 1;
        }
    } 
}
