class Horario {
    int hora = 0;
    int minuto = 0;
    int segundo = 0;
    int data = 0;
    int mes = 0;

    public void adicionar(int horas, int minutos, int segundos)
    {
        this.segundo += segundos;
        if (this.segundo > 59)
        {
            minutos += segundo / 60;
            this.segundo %= 60;
        }

        this.minuto += minutos;
        if (this.minuto > 59) {
            horas += minuto / 60;
            this.minuto %= 60;
        }

        this.hora += horas;
        if (this.hora > 23)
        {
            this.hora %= 24;
        }
    }
    
    public void adicionar(int minutos, int segundos){

        adicionar(0, minutos, segundos);
    }

     public void adicionar(int segundos)
    {
        adicionar(0, 0, segundos);
    }

    public void adicionar(Horario horario)
    {
        adicionar(horario.hora, horario.minuto, horario.segundo);
    }

}

