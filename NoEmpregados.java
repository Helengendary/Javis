public class NoEmpregados {
    private NoEmpregados next = null;
    NoEmpregados getNext() {
        return next;
    }

    void setNext(NoEmpregados next) {
        this.next = next;
    }
    
    private Empregado value;
    Empregado getEmpregado() {
        return value;
    }

    NoEmpregados(Empregado value) {
        this.value = value;
    }
    
}