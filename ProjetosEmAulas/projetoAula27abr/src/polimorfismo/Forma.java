package polimorfismo;

public abstract class Forma {
    // Toda classe filha precisa implementar o método abstrato "desenhar()"
    public abstract void desenhar();
    // Esse metodo não necessariamente precisa ser sobrescrito pelas subclasses;
    public String oi() {
        return "oi";
    }
}
