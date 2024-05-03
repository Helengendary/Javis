class Ponto {

    private long cpf = 0;
    private int hora = 0;
    private int min = 0;
    private int dia = 0;
    private int mes = 0;
    private int ano = 0;

    public Ponto(Long cpf, int hora, int min, int dia, int mes, int ano) {
        
        this.cpf = cpf;
        this.hora = hora;
        this.min = min;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}

// criar lista encadeada para aramzenar funcionarios
// ponto so pede min e horas
