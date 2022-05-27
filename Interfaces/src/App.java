import java.util.Collections;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> nomes = new LinkedList<String>();
        nomes.add("Monica");
        nomes.add("Magali");
        nomes.add("Cebolinha");
        nomes.add("Cascao");
        System.out.println(nomes);
        Collections.sort(nomes);// ordena a lista
        System.out.println(nomes);

        LinkedList<Produto> produtos = new LinkedList<Produto>();
        produtos.add(new Produto("Mouse", 60.0));
        produtos.add(new Produto("Teclado", 50.0));
        produtos.add(new Produto("Caneta", 4.0));
        System.out.println(produtos);
        Collections.sort(produtos);// para funcionar Produtos deve implementar a interface Comparable
        System.out.println(produtos);
        Produto.setTipo("preco");
        Collections.sort(produtos);// para funcionar Produtos deve implementar a interface Comparable
        System.out.println(produtos);
    }
}
