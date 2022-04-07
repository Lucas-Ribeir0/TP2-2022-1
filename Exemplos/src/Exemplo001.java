import java.util.*;
public class Exemplo001 {
    public static void main(String[] args) {
        //SET -> é um tipo conjunto
        Set<Integer> conjunto = new LinkedHashSet<Integer>();
        conjunto.add(6);
        conjunto.add(12);
        conjunto.add(15);
        System.out.println(conjunto);
    }
}
