package interfaces;

public abstract class Poligono implements Forma, Figuras {
    private int lados;
    // Construtor
    public Poligono(int lados){
        this.lados = lados;
    }

    // Método concreto
    public int getLados() {
        return this.lados;
    }

    // Método Abstrato
    public abstract void pintar(int cor);
}
