

public class Cliente extends PessoaFisica implements Usuario {
//	String cpf;
//	String nome;
	float saldo;
	
	// sobrescrita
	@Override
	public String toString() {
		maiuscula();
		return "[cpf=" + super.cpf + 
				", nome=" + super.nome + 
				", saldo=" + saldo + "]";
	}
	
	@Override
	public void maiuscula() {
		super.nome = super.nome.toUpperCase();
	}
	
	// sobrecarga
	public void maiuscula(String teste) {
		
	}

	@Override
	public boolean autenticar() {
		System.out.println("autenticacao via reconhecimento facial");
		return true;
	}
	
}
