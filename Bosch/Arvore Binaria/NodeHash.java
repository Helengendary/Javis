public class NodeHash<T> {
    
    private NodeHash<T> next = null;
    private NodeHash<T> previous = null;

    NodeHash(T value){

        this.value = value; 
    }
    
    public NodeHash<T> getPrevious() {
        return previous;
    }
    public void setPrevious(NodeHash<T> previous) {
        this.previous = previous;
    }
    public NodeHash<T> getNext() {
        return next;
    }
    public void setNext(NodeHash<T> next) {
        this.next = next;
    }
    
    private T value;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
