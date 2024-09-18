public class NoPonto {
    // Atributo next
    private NoPonto next = null;
    NoPonto getNext() {
        return next;
    }
    void setNext(NoPonto next) {
        this.next = next;
    }

    // Atributo Empregado
    private Ponto value;
    Ponto getPonto() {
        return value;
    }

    // Construtor
    NoPonto(Ponto value) {
        this.value = value;
    }
}
