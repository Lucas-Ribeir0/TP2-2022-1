public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        // c.saldo = 5000; // Não devemos permitir isto!
        System.out.println("Saldo: R$ " + c.getSaldo());
        c.setLimite(1000);
        if(c.depositar(20)){
            System.out.println("Deposito com sucesso");
        } else {
            System.out.println("Deposito nao realizado");
        }
        System.out.println("Saldo anterior: R$" + c.getSaldo());
        if(c.sacar(990)){
            System.out.println("Saque Realizado");
            System.out.println("Saldo atual R$ " + c.getSaldo());
        }else{
            System.out.println("Saque não foi permitido");
        }
    }
}
