public class Produto implements Comparable<Produto> {
    private static int contador; // atributo classe
    private static String tipo = "nome";
    private int codigo;
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        contador++;
        setCodigo(contador);
        setNome(nome);
        setPreco(preco);

    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Produto.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
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

    @Override
    public String toString() {
        return "{codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "}";
    }

    @Override
    public int compareTo(Produto o) {
        if (getTipo().equals("nome")){
            return compareNome(o);
        }else{
            return comparePreco(o);
        }
        //return this.nome.compareTo(o.getNome());
        //return (int)(this.getPreco() - o.getPreco());
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
