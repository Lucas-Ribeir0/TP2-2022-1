package Exercicios;
public class Exercicio6 {
    public static void main(String[] args) {
        int fibo = 1, a1 = 1, a2 = 0;

        do {
            System.out.print(fibo + ", ");
            	
			fibo = a1 + a2;
			a2 = a1;
			a1 = fibo;
            
        } while(fibo <= 100);
    }
}
