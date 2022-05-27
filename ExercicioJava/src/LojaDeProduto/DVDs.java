package LojaDeProduto;

public class DVDs extends Produto{
    private String duracao;

    public DVDs(String nome, double preco, String duracao, Integer codBar) {
        super(nome, preco, codBar);
        setDuracao(duracao);
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + "Duração: " + duracao;
    }
}
