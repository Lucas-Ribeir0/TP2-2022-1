package LojaDeProduto;

import java.util.ArrayList;
import java.util.Collections;

public class Loja {

    public static void buscaProduto(ArrayList<Produto> estoque, int produto) {
        boolean ver = false;
        for (int i = 0; i < estoque.size(); i++) {
            if(estoque.get(i).getCodBar() == produto) {
                System.out.println("O produto foi encontrado na posição " + i);
                ver = true;
            } else if (i + 1 == estoque.size() && ver == false) {
                System.out.println("O produto não foi encontrado");
            }
        }        
    }
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();

        estoque.add(new Livros("Harry Pote", 25.50, "J. K. Rolling Stones", 111));
        estoque.add(new Livros("Senhor dos Anéis", 87.00, "Tolkien", 222));
        estoque.add(new CDs("Metallica", 10.50, 12, 777));
        estoque.add(new CDs("Metallica", 10.00, 12, 777));
        estoque.add(new CDs("Metallica", 10.00, 12, 898));
        estoque.add(new CDs("Jay-Z", 10.00, 10, 555));
        estoque.add(new DVDs("Seven Anões", 89.00, "1:48:00", 333));
        
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println(estoque.get(i).toString());
        }        
        
        System.out.println();
        
        System.out.println(estoque.get(0).equals(estoque.get(2)));
        
        buscaProduto(estoque, 777);
        
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println(estoque.get(i).toString());
        }        
        
        // System.out.println(estoque);
        
        System.out.println("===============");
        Collections.sort(estoque);
        System.out.println("===============");
        
        // System.out.println(estoque);
        
        
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println(estoque.get(i).toString());
        }        

        }
}
