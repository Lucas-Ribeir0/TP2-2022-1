package LojaDeProduto;

public abstract class Produto implements Comparable<Produto> {
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
        return "O produto: " + getClass().getSimpleName() +  " | Cód. Barras: " + codBar + " | Nome: " + nome + " | Preço: " + preco + " | ";
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
        Produto that = (Produto)obj;
        return this.getCodBar() == that.getCodBar();
    }

    @Override
    public int compareTo(Produto o) {
        if (this.getNome().equals(getNome())){
            return compareNome(o);
        }else{
            return comparePreco(o);
        }
    }

    private int compareNome(Produto o){
        return this.getNome().compareTo(o.getNome());
    }

    private int comparePreco(Produto o){
        if (this.getPreco() < o.getPreco()){
            return -1;
        }else if (this.getPreco() == o.getPreco()) {
            return 0;
        }else{
            return 1;
        }
    }
    
    
    
}
