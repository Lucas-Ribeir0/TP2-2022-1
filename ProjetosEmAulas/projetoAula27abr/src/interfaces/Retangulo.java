package interfaces;

public class Retangulo extends Poligono {
    public Retangulo() {
        super(4);
    }

    @Override
    public void pintar(int cor) {
        System.out.println("Retangulo.pintar");
    }

    @Override
    public void desenhar() {
        System.out.println("Retangulo.desenhar");
    }

    @Override
    public void aumentar(int valor) {
        System.out.println("Retangulo.aumentar");
    }
    public void info() {
        System.out.println("Retangulo.info");
    }
    @Override
    public void colar() {
        System.out.println("Rentagulo.colar");        
    }
    
    
}
