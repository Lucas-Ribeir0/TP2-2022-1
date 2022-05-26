package LojaDeProduto;

public class CDs extends Produto {
    private int numFaixas;

    public CDs(String nome, double preco, int numFaixas, int codBar) {
        super(nome, preco, codBar);
        setNumFaixas(numFaixas);
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + "Número de faixas: " + numFaixas;
    }
    
}
