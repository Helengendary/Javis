public class Hash<T> {
        
    private int size = 0; // Tamanho do vetor
    private NodeHash<T> head = null;
    private NodeHash<T> tail = null;

    public void addHash(T valor){

        size ++;
        
        NodeHash<T> node = new NodeHash<>(valor);

        if(head == null){
            tail = node;  // fim recebe o nó
            head = node;  // inicio recebe o nó
            return;
        }

        tail.setNext(node); // fim aponta pro proximo que é o nó
        node.setPrevious(tail); // o nó aponta pro anterior que é o fim 
        tail = node; // fim recebe o nó

    }

    T dequeue(){

        head = head.getNext();
        T retorna = head.getValue();

        return retorna;
    }

    T peek(){

        return head.getValue();
    }

    Integer size() {
        return this.size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NodeHash<T> getHead() {
        return head;
    }

    public void setHead(NodeHash<T> head) {
        this.head = head;
    }

    public NodeHash<T> getTail() {
        return tail;
    }

    public void setTail(NodeHash<T> tail) {
        this.tail = tail;
    }
    
}
