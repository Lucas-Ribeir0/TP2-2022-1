package Conta;

import java.util.ArrayList;

public class Banco {
    protected ArrayList<Conta> Contas = new ArrayList<>(10);
    private int contador = 0;

    void adiciona(Conta c) {
            Contas.add(c);
            
            System.out.println("A " + c.getClass().getSimpleName() +  " foi adicionado na posição: " + (contador + 1));

            contador++;
    };

    Conta pegaConta(int x) {
        return Contas.get(x - 1);
    };
    int pegaTotalDeContas() {
        return (Contas.size());
    }
}
