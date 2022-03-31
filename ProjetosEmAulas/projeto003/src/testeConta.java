package projeto003.src;

public class testeConta {
    public static void main(String[] args) {
        // Instanciar um objeto do tipo Conta
        Conta contaCebolinha = new Conta();

        // Definir os valores da conta do Cebolinha
        contaCebolinha.agencia = "0123-4";
        contaCebolinha.saldo = 2050.07;
        contaCebolinha.nConta = "3333.33";
        contaCebolinha.limite = 500;
        // contaCebolinha.nomeCliente = "Cebolinha";

        System.out.println("Objeto " + contaCebolinha);
        System.out.println("Saldo: " + contaCebolinha.saldo);
        Conta aux = contaCebolinha;
        System.out.println("Objeto aux: " + aux);
        
        aux.saldo += 1000; // Operação de deposito -> Orientação Objetos -> DEFINIR RESPONSABILIDADE -> PARA A PRÓPRIA CLASSE.
        
        System.out.println("Saldo contaCebolinha R$ " + contaCebolinha.saldo);
        
        contaCebolinha.depositar(3000);
        System.out.println("Saldo contaCebolinha R$ " + contaCebolinha.saldo);

        contaCebolinha.depositar(-1000); // Esse lançamento não vai ter efeito.
        System.out.println("Saldo contaCebolinha R$ " + contaCebolinha.saldo);

        if(contaCebolinha.sacar(10000)) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("\nSaldo insuficiente ou valor inválido\n");
        }
        System.out.println("Saldo contaCebolinha R$ " + contaCebolinha.saldo);

        // Teste Transferência
        Conta contaChicoBento = new Conta();
        contaChicoBento.depositar(100);
        System.out.println("Antes da Transferência");
        System.out.println("Conta Chico Bento: " + contaChicoBento.saldo);
        System.out.println("Conta Cebolinha " + contaCebolinha.saldo);
        // Transferir do Cebolinha para Chico Bento
        if(contaCebolinha.transferir(1000, contaChicoBento)) {
            System.out.println("Transferência Realizada");
        } else {
            System.out.println("Falha na transferência");
        }
        System.out.println("Após a Transferência");
        System.out.println("Conta Chico Bento: " + contaChicoBento.saldo);
        System.out.println("Conta Cebolinha " + contaCebolinha.saldo); 

    }
}
