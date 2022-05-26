package exception;

public class TesteBanco {
    public static void main(String[] args) {
        Conta cc = new Conta();
        cc.saldo = 1000;
        try{
            cc.sacar(2000);
        }catch (IllegalArgumentException e){
            System.out.println("Saldo eh insuficiente");
        }
        
    }
}
