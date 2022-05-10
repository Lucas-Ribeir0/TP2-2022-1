package polimorfismo;

public class Circulo extends Forma {
    public void desenhar() {
        System.out.println("Círculo");
    }
    public void colorir() {
        System.out.println("Colorir círculo");
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }  
}
