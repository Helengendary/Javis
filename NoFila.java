public class NoFila<T> {
    
    T data;
    NoFila<T> next;
    NoFila<T> prev;

    NoFila(T data){
        this.data = data;

        next = null;
        prev = null;

    }

    public T getData() {
        return data;
    }

    public NoFila<T> getNext() {
        return next;
    }

    public void setNext(NoFila<T> next) {
        this.next = next;
    }

    public NoFila<T> getPrev() {
        return prev;
    }

    public void setPrev(NoFila<T> prev) {
        this.prev = prev;
    }
    
}