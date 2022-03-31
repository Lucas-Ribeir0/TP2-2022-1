package entidades;

public class PessoaFisica {
    // Atributos
    public String cpf;
    public String nome;
    @Override // Serve para explicitar que este metodo existe na super classe de PessoaFisica
    public String toString() {
        // This -> Faz com que a variável seja buscada direta na classe, sem o this, primeiramente ebusca no metódo.
        return "CPF: " + this.cpf + ", Nome: " + this.nome;
    }
}
