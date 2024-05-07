public class Stack<T> {

    private T[] stack;// Cria um vetor
    
    private Integer size = 0; // Tamanho do vetor

    Stack (int capacity) {
        stack = (T[])(new Object[capacity]);// Cria um vetor como parametro a capacidade
    }














    

    //  // Adiciona algo no vetor
    //  void push(T value) {

    //     //Verifica o tamanho do vetor
    //     if (size == stack.length){

    //         T[] copy = (T[])(new Object[2  * stack.length]); // Cria uma cópia

    //         // Impletamenta o que estava em stack para a copia
    //         for (int i = 0; i < size; i++){
    //             copy[i] = stack[i];
    //             stack = copy;
    //         } 
            
    //     }

    //     // Arrasta todos os numeros uma casa para frente
    //     if (size > 0) {
            
    //         int operador = size-1;
            
    //         for (int i = size; operador >= 0; i--){
    //             stack[i] = stack[operador];
    //             operador--;
    //         } 
    //     }
        
    //     stack[0] = value; // Adiciona o parametro a lista no valor zero
    //     size++; // aumenta o tamanho
    // }
    
    // // Retorna o ultima valor no indice 0 
    // void pop(){
        
    //     // Arrasta todos os numeros uma casa para frente
    //     if (size > 0) {
            
    //         int operador = size - 1;

    //         for (int i = size; operador >= 0; i--){
    //             stack[i] = stack[operador];
    //             operador--;
    //         }
    //     }

    //     stack[0] = stack[size];
    //     stack[size] = null;
    // }




    




    void push(T value) {

        //Verifica o tamanho do vetor
        if (size == stack.length){

            T[] copy = (T[])(new Object[2  * stack.length]); // Cria uma cópia

            // Impletamenta o que estava em stack para a copia
            for (int i = 0; i < size; i++){
                copy[i] = stack[i];
                stack = copy;
            } 
            
        }
        
        stack[size] = value; // Adiciona o parametro a lista no valor zero
        size++; // aumenta o tamanho
    }

    T pop() {

        size--;
        return stack[size];
    }

    T peek() {
        return stack[size-1];
    }

    // Retorna o tamanho da lista
    Integer size() {
        return this.size;
    }
}
