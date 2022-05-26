package exception;

public class Conta {
    public double saldo;
    public boolean sacar(double qtd) throws IllegalArgumentException{
        if (saldo<qtd){
            throw new IllegalArgumentException("Sem saldo");
        }
        saldo = saldo - qtd;
        return true;
    }
}
