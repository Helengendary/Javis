class List<T> {

    private T[] data;// Cria um vetor
    
    private Integer size = 0; // Tamanho do vetor

    List (int capacity) {
        data = (T[])(new Object[capacity]);// Cria um vetor como parametro a capacidade
    }

    // Adiciona algo no vetor
    void add(T value) {

        //Verifica o tamanho do vetor
        if (size == data.length){

            T[] copy = (T[])(new Object[2  * data.length]); // Cria uma cópia

            // Impletamenta o que estava em data para a copia
            for (int i = 0; i < size; i++){
                copy[i] = data[i];
            data = copy;
            } 
        }
        
        data[size] = value; // Adiciona o parametro a lista
        size++; // aumenta o tamanho
    }

    // Retorna o tamanho da lista
    Integer size() {
        return this.size;
    }

    // Retorna certo valor de um indice
    T get(int index) {

        // Se o parametro for maior que o tamanho da lista retorn null
        if (index >= size) {
            return null;
        }

        return this.data[index]; // Retorna o valor do indice
    }

    void set(int index, T value){
        this.data[index] = value;
    }
}
