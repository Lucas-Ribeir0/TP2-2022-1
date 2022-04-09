public class Exercicio4 {
    public static void main(String[] args) {
        for(int i = 1, fatorial = 1; i <= 10; i++) {
            fatorial = fatorial * i;

            int fat = 0;
            fat = i;

            System.out.println("Fatorial de " + i + " é (" + (fat - 1) + "!) * " + fat + " = " + fatorial); 
        }
    }
}
