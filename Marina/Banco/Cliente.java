import java.util.ArrayList;

public class Cliente {
    public String Nome;
    public String CPF;
    private float Saldo;

    public void Cliente(String nome, String cpf) {

        this.Nome = nome.substring(0, 1).toUpperCase() + nome.substring(1);;
        this.CPF = cpf;
        this.setSaldo(0);
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    public void Sacar(float value) {
        float saldoOld = this.getSaldo();
        float saldoNew = saldoOld - value;

        if (saldoNew > 0){
            System.out.println("Saldo insuficiente!");
        } else {
            this.setSaldo(saldoOld - value);
            System.out.println("Você sacou R$" + value);
        }
    }

    public void Depositar(float value){
        float saldoOld = this.getSaldo();

        this.setSaldo(saldoOld + value);
        System.out.println("Você depositou R$" + value);
    }

    public void VerificarSaldo(){
        float saldoAtual = getSaldo();

        System.out.println("Saldo Atual: R$" + saldoAtual);
    }

    public void UpdateInfo(int atributo, String value) {
        switch (atributo) {
            case 1:
                this.Nome = value;
                break;
            case 2:
                this.CPF = value;
                break;
            default:
                break;
        }
    }
}