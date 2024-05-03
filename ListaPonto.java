public class ListaPonto {

    private NoPonto head = null;
    private int size = 0;

    void addPonto(Ponto ponto){

        size++; // tam da lista aumneta em 1
        NoPonto node = new NoPonto(ponto); //No que tem ponto associado
        
        if(head == null){
            head = node; // inicio recebe o nó
            return;
        }

        NoPonto atual = head;
        while (atual.getNext() != null) {
            
            atual = atual.getNext(); //enquanto o atual tiver o proximo o atual recebe o proximo
        }

        atual.setNext(node); // proximo do atual é o node
    }

    // ponto get(int index){
        
    // }
    //retorna tam da lista
    int getSize(){
        return size;
    }
}
