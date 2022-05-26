package interfaces;

public class App {
    public static void main(String[] args) {
        // Forma forma = new Forma() -- ERRO
        // Poligono poligono = new Poligno(4) -- Erro

        Retangulo retangulo = new Retangulo();
        retangulo.aumentar(3);
        retangulo.desenhar();
        System.out.println("lados: " + retangulo.getLados());
        retangulo.pintar(5);

        // Poligono obj = new Retangulo();
    }
}
