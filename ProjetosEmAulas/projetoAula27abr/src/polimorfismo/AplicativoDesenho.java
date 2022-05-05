package polimorfismo;

public class AplicativoDesenho {
    public static void canvas(Forma f) {
        f.desenhar(); // Comportamento polimorfismo
    }

    public static void exibir(Forma elementos[]) {
        System.out.println(" - - - EXIBIR - - - ");
        for (Forma f : elementos) {
            f.desenhar();
        }
    }

    public static void canvas2(Forma f) {
        f.desenhar();
        if (f instanceof Circulo){
            Circulo c = (Circulo)f;
            c.colorir();
        }
    }

    public static void main(String[] args) {
        Circulo tipoCirculo = new Circulo();
        
        canvas(tipoCirculo);
        canvas(new Quadrado());

        Forma vetor[] = {new Circulo(), new Quadrado(), new Circulo()};
        exibir(vetor);

        if (tipoCirculo instanceof Forma){ // Verifica o tipo de um objeto
            System.out.println("Realmente é um círculo"); 
        }
        canvas2(new Quadrado());
        canvas2(new Circulo());
    }
}
