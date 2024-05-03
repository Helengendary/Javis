public class ListaEmpregados {

    private NoEmpregados head = null;
    private int size = 0;

    void add(Empregado empregado){

        size++; // tam da lista aumneta em 1
        NoEmpregados node = new NoEmpregados(empregado); //No que tem empregado associado
        
        if(head == null){
            head = node; // inicio recebe o nó
            return;
        }

        NoEmpregados atual = head;
        while (atual.getNext() != null) {
            
            atual = atual.getNext(); //enquanto o atual tiver o proximo o atual recebe o proximo
        }

        atual.setNext(node); // proximo do atual é o node
    }

    Empregado get(int index){
        NoEmpregados atual = head;
        
        for (int i = 0; i < index; i++) {
            atual = atual.getNext();
        }

        return atual.getEmpregado(); 
    }
    //retorna tam da lista
    int getSize(){
        return size;
    }


}
