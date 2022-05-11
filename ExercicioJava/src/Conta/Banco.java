package Conta;

public class Banco {
    protected Conta Contas[] = new Conta[3];
    private int contador = 0;

    void adiciona(Conta c) {
            Contas[contador] = c;
            
            System.out.println("A " + c.getClass().getSimpleName() +  " foi adicionado na posição: " + (contador + 1));

            contador++;
    };

    Conta pegaConta(int x) {
        return Contas[x - 1];
    };
    int pegaTotalDeContas() {
        return Contas.length;
    }
}
