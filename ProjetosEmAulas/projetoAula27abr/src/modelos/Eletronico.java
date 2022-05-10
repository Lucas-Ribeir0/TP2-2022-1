package modelos;

public class Eletronico extends Produto{
    private int voltagem;

    public Eletronico(String nome, double preco, int voltagem){
        super(nome,preco); // chamando construtor da superclasse
        this.setVoltagem(voltagem);
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override 
    public boolean ehCaro(){
        System.out.println("usou ehCaro() de eletronico ");
        return this.getPreco() > 1000;
    }

   
    
    
}
