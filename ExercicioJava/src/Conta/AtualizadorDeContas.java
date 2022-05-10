package Conta;

public class AtualizadorDeContas {
    
    private double saldoTotal = 0;
    private double selic;

    AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    void roda(Conta c) {
        System.out.println("Seu saldo anterior da " + c.getClass().getSimpleName() + " antes do ajuste é: R$ " + c.getSaldo());
        
        c.saldo += c.saldo * this.selic;

        this.saldoTotal += c.saldo;

        System.out.println("Seu saldo atual da " + c.getClass().getSimpleName() + " após o ajuste é: R$ " + c.getSaldo() + "\n");
    }

    public double getSaldoTotal() {
        return this.saldoTotal;
    }
    
}
