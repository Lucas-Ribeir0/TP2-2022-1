package modelos;

public class Livro extends Produto{
    // como livro eh uma extensao de Produto, vamos adicionar os atributos e metodos especificos de Livro
    private String autor;
    private int paginas;
    public Livro(){

    }
    public Livro(String nome, double preco, String autor){
        super(nome,preco);
        this.setAutor(autor);
        //this.setPaginas(paginas);
        System.out.println("Livro usou construtor parametrico de produto");
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public boolean ehGrande(){
        return this.getPaginas()>200;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Autor " + getAutor());
        System.out.println("Paginas " + getPaginas());
    }

}
