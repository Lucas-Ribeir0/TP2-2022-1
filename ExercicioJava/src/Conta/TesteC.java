package Conta;

public class TesteC {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cc2 = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cc2.deposita(2000);
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cc2.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cc2.getSaldo());
        System.out.println(cp.getSaldo());

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cc2);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());


        System.out.println("\n - = - Início Metódo Banco - = - \n");
        Banco bc = new Banco();

        bc.adiciona(c);
        bc.adiciona(cc);
        bc.adiciona(cc2);
        bc.adiciona(cp);

        System.out.println(bc.pegaConta(1).getClass().getSimpleName());
        System.out.println(bc.pegaConta(3).getClass().getSimpleName());

        System.out.println(bc.pegaTotalDeContas());

        for(int i = 0; i < (bc.pegaTotalDeContas()); i++) {
            adc.roda(bc.Contas.get(i));
        }
    }
}
