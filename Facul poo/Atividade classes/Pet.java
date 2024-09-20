public class Pet {

    public String Nome;
    public String Raca;
    public String Porte;
    public Integer Idade;
    public String Cor;
    public boolean Comida;

    public Pet (String nome, String raca, String porte, Integer idade, String cor){
        this.Nome = nome;
        this.Raca = raca;
        this.Porte = porte;
        this.Idade = idade;
        this.Cor = cor;
        this.Comida = false;
    }

    public void ColocarComida(){
        if (this.Comida == true){
            System.out.println("Já tem comida");
        } else {
            this.Comida = true;
            System.out.println("Pote cheio!");
        }
    }

    public void EmitirSom (String som){
        System.out.println(som);
    }

    public void Comer () {
        if (this.Comida) {
            System.out.println("Comendo");
            this.Comida = false;
        } else {
            System.out.println("Não tem comida!");
        }
    }

    public void Brincar() throws InterruptedException {
        System.out.println("Brincando");
        Thread.sleep(2000);
        System.out.println("Brincou");
    }
}
