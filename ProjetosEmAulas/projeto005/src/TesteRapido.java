

public class TesteRapido {
    public static void main(String[] args) {
        String cpf = "111.444.777-35";

        // Desejamos eliminar . e -
        cpf = cpf.replace(".", ""); // Substitui os caracteres na primeira aspa pelos da segunda.
        cpf = cpf.replace("-", "");
        System.out.println(cpf);
        
        for (int i = 0; i < cpf.length(); i++) {
            // System.out.println(cpf.charAt(i));
        }

        // char dv1 = '2';
        // Converter para inteiro
        // int n1 = Character.getNumericValue(dv1);
        // System.out.println(n1);

        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

    }
}
