public class Conta {

    public Cliente cliente;
    private float saldo;


    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public Conta (Cliente cl) {
        this.cliente = cl;
        setSaldo(0);
    }

    public void Sacar(float value) {
        if ((this.saldo - value) < 0) {
            System.out.print("Saldo Insuficiente");
        } else {
            this.setSaldo(this.saldo - value);
            System.out.print("\nNovo saldo: R$" + this.getSaldo() + "\n\n");
        }
    }

    public void Depositar(float value) {
        this.setSaldo(this.saldo + value);
        System.out.print("\nNovo saldo: R$" + this.getSaldo() + "\n\n");
    }
}
