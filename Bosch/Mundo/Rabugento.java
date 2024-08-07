public class Rabugento extends Individuos{
    
    boolean contri = true;
    
    @Override
    boolean contribuicao() {


        if ( == false) {
            contri = false;
        }
        return contri;
    }

    @Override
    int value(){
        return 3;
    }
}
