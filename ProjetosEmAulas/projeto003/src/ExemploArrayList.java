package projeto003.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(8);
        System.out.println(lista);
        lista.add(0, 50); // na pos 0 adiciona 50
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(lista.remove(1));
        System.out.println(lista);

        LinkedList<String> nomes = new LinkedList<String>();
        nomes.add("Cebolinha");
        nomes.add("Cascao");
        nomes.add("Monica");
        System.out.println(nomes);
        System.out.println(nomes.remove("Cascao"));
        System.out.println(nomes);
        System.out.println("tamanho: " + nomes.size());
        for (String personagem : nomes) {
            System.out.println(personagem.toUpperCase());
        }
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
            
        }
    }
}
