public class TiposNumericos {
    public static void main(String[] args) {
        // float - corresponde a valores numéricos reais
        float peso = 48.6f; // f ao final para variáveis do tipo float
        double altura = 1.84; // quando o valor real for double, dispensa o f
        int pesoInteiro = (int)peso; // convertendo de real para int
        // espero que o int seja 48 -> vamos asusmir a parte inteira
        System.out.println("Peso Inteiro: " + pesoInteiro);

        String idade = "22";
        // converter de String para int
        int idadeInt = Integer.parseInt(idade);
        // converter de String para double
        double idadeDouble = Double.parseDouble(idade);
    }
}
