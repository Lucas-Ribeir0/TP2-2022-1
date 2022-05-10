package modelos;

public class Produto {
    private String nome;
    private double preco;
    // construtor padrao
    public Produto(){
        System.out.println("Produto - construtor padrao");
    }
    // construtor parametrico
    public Produto(String nome, double preco){
        System.out.println("Produto - construtor parametrico");
        this.setNome(nome);
        this.setPreco(preco);
    }
    // sets-Metodos modificadores e gets-Metodos de acesso
    // adicionar sets e gets de forma automatica
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public boolean ehCaro(){
        // definir que preco acima de R$100 vamos considerar caro!
        return this.getPreco() > 100;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Preco: " + this.getPreco());
    }
}
