public class Colaborativo extends Individuos {


    @Override
    boolean contribuicao() {

        moedas --;
        return true;
    }

    @Override
    int value(){
        return 1;
    }
}

