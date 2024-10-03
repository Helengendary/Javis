public abstract class ArrayList<T> implements Collection<T> {
    private T[] data;
    
    public ArrayList(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public ArrayList() {
        data = create(10);
    }

    private T[] create(int size) {
        Object[] array = new Object[size];
        return (T[])array;
    }
}
