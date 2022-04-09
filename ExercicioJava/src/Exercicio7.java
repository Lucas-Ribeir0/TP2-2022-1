public class Exercicio7 {
    public static void main(String[] args) {
        int x = 13;
        int y = 0;

        do {
            if ((x % 2) == 0) {
                y = x / 2;
            } else {
                y = 3 * x + 1;
            };
            if (y != 1) {
            System.out.print(y + " -> ");
            } else {
            System.out.print(y);
            }
            x = y;

        } while (y != 1);
    }
}
