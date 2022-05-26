package LojaDeProduto;

import java.util.ArrayList;

public class Loja {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();

        estoque.add(new Livros("Harry Pote", 25.50, "J. K. Rolling Stones", 111));
        estoque.add(new Livros("Senhor dos Anéis", 87.00, "Tolkien", 222));
        estoque.add(new CDs("Metallica", 10.00, 12, 111));
        estoque.add(new CDs("Jay-Z", 10.00, 10, 555));
        estoque.add(new DVDs("Seven Anões", 89.00, "1:48:00", 333));
        
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println(estoque.get(i).toString());
        }        

        System.out.println();

        System.out.println(estoque.get(0).equals(estoque.get(2)));
    }
}
