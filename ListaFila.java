public class ListaFila<T> {
    
    NoFila<T> head;
    NoFila<T> tail;
    int size;

    ListaFila(){
        head = null;
        tail = null;
        size = 0;
    }

    void enqueue(T value) {

        size++;

        NoFila<T> nofila = new NoFila<T>(value);

        if (head == null) {
          
           head = nofila;
           tail = nofila;
           return;
        }

        tail.setNext(nofila);
        nofila.setPrev(tail);
        tail = nofila;

    }

    T dequeue(){
        T retorna = head.getData();

        head = head.getNext();
        head.setPrev(null);
        
        return retorna;
    }

    T peek(){
        return head.getData();
    }

    public int getSize() {
        return size;
    }

}
