class NoEmpregados
{
    // Atributo next
    private NoEmpregados next = null;
    NoEmpregados getNext() {
        return next;
    }
    void setNext(NoEmpregados next) {
        this.next = next;
    }

    // Atributo Empregado
    private Empregado value;
    Empregado getEmpregado() {
        return value;
    }

    // Construtor
    NoEmpregados(Empregado value) {
        this.value = value;
    }
}   
