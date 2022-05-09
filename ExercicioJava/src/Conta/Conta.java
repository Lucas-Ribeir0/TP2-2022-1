package Conta;

public class Conta {
    protected double saldo;

    void deposita(double valor) {
        this.saldo += valor;
    }

    void saca(double valor) {
        this.saldo -= valor;
    }

    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }

    double getSaldo() {
        return this.saldo;
    }
    
}
