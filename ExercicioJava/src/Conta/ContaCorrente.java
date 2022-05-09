package Conta;

public class ContaCorrente extends Conta {
    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    void deposita(double valor) {
        this.saldo += valor - 0.10;
    }
}
