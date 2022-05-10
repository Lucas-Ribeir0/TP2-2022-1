package app;

import modelos.CD;
import modelos.Eletronico;
import modelos.Livro;
import modelos.Midia;
import modelos.Produto;

public class App {
    public static void mensagem(Produto produto) {
        if (produto.ehCaro()){
            System.out.println(produto.getNome() + " Produto caro");
        }else{
            System.out.println(produto.getNome() + "Produto barato");
        }
    }
    public static void main(String[] args) {
        Produto p = new Produto("caneta",18.5);
        mensagem(p);

        Livro livro = new Livro();
        livro.setNome("Java como Programar");
        livro.setPreco(200);
        mensagem(livro);

        Livro livro2 = new Livro("Python",120,"Manzano");
        mensagem(livro2);
        
        Midia mid = new Midia();
        mid.setNome("Nome da midia");

        CD cd = new CD();
        cd.setNome("Emocoes");
        cd.setPreco(50);
        cd.setArtista("Roberto Carlos");
        cd.setFaixas(13);

        Eletronico tv = new Eletronico("TV", 500, 127);
        //System.out.println(tv.ehCaro());
        mensagem(tv);

        livro2.imprimir();
        tv.imprimir();

    }
}
