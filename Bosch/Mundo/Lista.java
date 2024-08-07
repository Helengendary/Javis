public class Lista {

    private Individuos[] data;
    
    private Integer size = 0;

    Lista(int capacity) {
        data = new Individuos[capacity];
    }
    
    void add(Individuos value) {

        if (size == data.length) {

            Individuos[] copy = new Individuos[data.length*2];

            for(int i = 0; i < size; i++) {

                copy[i] = data[i];
            }

            data = copy;
        }

        data[size] = value;
        size++;
    }

    void remove(int index){

        data[index] = data[size-1];
        size--; 
    }

    public Integer getSize() {
        return size;
    }

    Individuos get(int index) {
        if (index >= size) {
            return null;
        }

        return this.data[index];
    }
}
