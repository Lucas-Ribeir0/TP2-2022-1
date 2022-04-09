

public class Funcionario extends PessoaFisica implements Usuario {
//	String cpf;
//	String nome;

	float salario;

	@Override
	public boolean autenticar() {
		System.out.println("autenticacao via biometria");
		return true;
	}
}
