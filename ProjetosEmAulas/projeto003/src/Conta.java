package projeto003.src;

/*
* Conta
*/

public class Conta {
    // Atributos
    String nConta;
    String agencia;
    Titular titular;
    double saldo;
    double limite;

    // Operação -> Metodos
    /**
     * Método para depositar valor em uma Conta
     * @param valor - valor real, correspondente ao deposito a ser realizado.
     */
    public void depositar(double valor) {
        if (valor > 0){
        this.saldo += valor; // Equivalente á -> saldo = saldo + valor
        } else {
        
        }
    }
    /**
     * Método para sacar valores em uma conta, contanto que haja valores a serem sacados.
     * @param valor - valor real, correspondente ao saque a ser realizado
     * @return true se foi possível sacar o valor, false caso contrário
     */
    public boolean sacar(double valor) {
        // Fazer o método do saque! && -> AND
        if ((valor > 0) && (saldo + limite >= valor)){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if(this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void extrato(){
        System.out.println(" ------- Extrato -------- ");
        System.out.println("Titular: " + titular.nome);
        System.out.println("----------------------------");
        System.out.println("Ag: " + agencia + "Conta: " + nConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Limite: R$ " + limite);
        System.out.println("Disponível: R$ " + (saldo + limite));
    }
}
