package projeto003.src;

import java.util.Arrays;

public class ExemploVetor {
    public static void main(String[] args) {
        int numeros[] = new int [6];
        // 0 - 1 - 2 - 3 - 4 - 5 - 6 -> Tamanho 6
        System.out.println("Consultar tamanho do vetor");
        System.out.println(numeros.length);
        // Loop
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Posição " + i);
            System.out.println(", Conteúdo " + numeros[i]);
        }
        // numeros[6] = 80; 
        numeros[0] = 20;
        numeros[4] = 65;
        numeros[5] = 70;

        for (int i : numeros) { // for i in numeros: Se Python
            System.out.println(i);
        }
        String nomes[] = new String[5]; // Vetor de Strings
        nomes[0] = "Cebolinha"; nomes[1] = "Cascao"; nomes[2] = "Magali"; nomes[3] = "Monica"; nomes[4] = "Franjinha";

        for (String personagem : nomes) {
            System.out.println("Personagem " + personagem);
        }
        Arrays.sort(numeros); // Ordena o vetor de números;
        Arrays.sort(nomes); // Ordena o vetor de nomes;
        System.out.println("Vetor Ordenado");
        for (String personagem : nomes) {
            System.out.println("Personagem " + personagem);
        }
        System.out.println("Vetor Ordenado");
        for (int i : numeros) {
            System.out.println(i);
        }

        String strA = "Chico Bento";
        nomes[1] = strA;
        System.out.println("Posição 1: " + nomes[1]);
        strA = "Ze Lele";
        System.out.println("Posição 1: " + nomes[1]);
    }
}
