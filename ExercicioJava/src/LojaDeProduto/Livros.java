package LojaDeProduto;

public class Livros extends Produto{
    private String autor;

    public Livros(String nome, double preco, String autor, Integer codBar) {
        super(nome, preco, codBar);
        setAutor(autor);
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public String toString() {
        return super.toString() + "Autor: " + autor;
    }
    
}