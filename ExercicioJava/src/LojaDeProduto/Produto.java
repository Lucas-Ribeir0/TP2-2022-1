package LojaDeProduto;

public abstract class Produto {
    private String nome;
    private double preco;
    private Integer codBar;


    public Produto(String nome, double preco, Integer codBar) {
        setNome(nome);
        setPreco(preco);
        setCodBar(codBar);
    }

    @Override
    public String toString() {
        return "O produto: " + getClass().getSimpleName() +  " | Nome: " + nome + " | Preço: " + preco + " | ";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getCodBar() {
        return codBar;
    }

    public void setCodBar(Integer codBar) {
        this.codBar = codBar;
    }

    @Override
    public boolean equals(Object obj) {
        Produto outro = (Produto)obj;
        return this.getCodBar()==outro.getCodBar() ;
    }

    

    
    
    
}
