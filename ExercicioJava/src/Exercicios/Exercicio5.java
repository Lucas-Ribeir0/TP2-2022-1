package Exercicios;
public class Exercicio5 {
    public static void main(String[] args) {
        for(long i = 1, fatorial = 1; i <= 30; i++) {

            fatorial = fatorial * i;

            long fat = 0;
            fat = i;

            System.out.println("Fatorial de " + i + " é (" + (fat - 1) + "!) * " + fat + " = " + fatorial); 
        }
    }
}
