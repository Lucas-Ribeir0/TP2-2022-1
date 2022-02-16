package modelos;

public class Cliente {
    String cpf;
    String nome;
    float saldo;

    //Override
    public String toString() {
        return "cpf=" + cpf + ", nome= " + nome + ", saldo =" + saldo + "]";
    }
}