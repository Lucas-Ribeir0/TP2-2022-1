package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;;

public class App {
    public static void main(String[] args) {
        try {
            metodo1();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }        
        System.out.println("Fim do programa");
    }

    public static void metodo1() throws FileNotFoundException{
        FileInputStream file = new java.io.FileInputStream("arquivo.txt");
        System.out.println("Arquivo encontrado");
    }
}
