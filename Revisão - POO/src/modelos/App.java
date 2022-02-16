package modelos;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<Cliente> lista= new LinkedList<Cliente>();
        for (int i = 0; i < 10; i++) {
            Cliente tmp = new Cliente();
            tmp.nome = "Nome da Pessoa" + i;
            tmp.cpf = "CPF da Pessoa" + i;
            tmp.saldo = 1000+50 * i;
            lista.add(tmp);
        }
        System.out.println("-------------------------");
        System.out.println(lista);

        Cliente turing = lista.get(1);
        turing.nome = "Turing";

        Cliente juca = lista.get(3);
        juca.nome = "Juca";
    }
}