package projeto002.src;

public class ConceitosBasicos {
    public static void main(String[] args) {
        //!Condicional
        int x = 10;
        if (x>5) {
            System.out.println(x + " É maior que 5 ");
        } else {
            System.out.println(x + " É menor ou igual a 5");
        }
        // Estrutura de repetição
        for (int i = 0; i < 0; i++) {
            System.out.println("ola " + i);
        }
        // System.out.println(" Valor de i " + i); // i no escopo de FOR
        int j = 0;
        while (j < 10) {
            System.out.println("Mundo " + j);
            j++; // Incrementar o valor de j
        }
        // Do - While -> condição é avaliada após o loop
        int z = 0;
        do {
            System.out.println("Valor de z: " + z);
            z++;
        } while(z < 5);
    }
}
