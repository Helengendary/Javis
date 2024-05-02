public class ListaEmpregados {

    private NoEmpregados head = null;
    private int size = 0;

    void add(Empregado empregado) {
        size++;
        NoEmpregados node = new NoEmpregados(empregado);
        if (head == null) {
            head = node;
            return;
        }

        NoEmpregados atual = head;
        while ( atual.getNext() != null) {
            atual = atual.getNext();
        }

        atual.setNext(node);
    }


    // Empregado get(int index){

    // }

    int getSize() {
        return size;
    }
}
