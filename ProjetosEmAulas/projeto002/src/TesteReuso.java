package projeto002.src;

import entidades.PessoaFisica;
import util.Reuso; // Importa a classe de outra pasta, definida pelo "package" no inicío do arquivo.
public class TesteReuso {
    public static void main(String[] args) {
        Reuso.print("Olá Mundo");
        Reuso.print(4);
        Reuso.print(7.6);

        PessoaFisica pf = new PessoaFisica();
        pf.nome = "Alan Touring";
        pf.cpf  = "111.111.111-06";

        Reuso.print(pf);
    }
}
