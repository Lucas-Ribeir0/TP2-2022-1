public class Conta {
    private double saldo;
    private double limite;
    // Apenas o metodo de consulta saldo 
    public double getSaldo() {
        return this.saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        if (limite >= 0) {
            this.limite = limite;
        }
    }
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }


    public boolean sacar(double valor) {
        double novoSaldo = this.getSaldo() - valor;
        if (Math.abs(novoSaldo) <= this.getLimite()){
            // this.saldo = novoSaldo;
            this.setSaldo(novoSaldo); // Usando metodo privado.
            return true;
        }
        return false;
        }

    public boolean depositar(double valor) {
        if (valor <= this.getLimite() + this.getSaldo()) {
            double novoSaldo = this.getSaldo() - valor;
            // this.saldo = novoSaldo;
            this.setSaldo(novoSaldo); // Usando o metodo privado
            return true;
        }
        return false;
    }
}
