

import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		LinkedList<Cliente> lista= new LinkedList<Cliente>();
		for (int i = 0; i < 5; i++) {
			Cliente tmp = new Cliente(); // instanciacao
			tmp.nome = "Nome da pessoa " + i;
			tmp.cpf = "CPF da pessoa " + i;
			tmp.saldo = 1000+50*i;
			lista.add(tmp);
		}
		
		System.out.println("---------------------");
		System.out.println(lista);
		
		Cliente turing = lista.get(1);
		turing.nome = "Turing";
		turing.maiuscula();
		
		Cliente juca = lista.get(3);
		juca.nome = "Juca";
		
		System.out.println("---------------------");
		System.out.println(lista);
		
		Funcionario juquinha = new Funcionario();
		juquinha.cpf="11111";
		juquinha.nome = "juquinha";
		juquinha.salario = 2000;
		// TIPO ESTATICO X TIPO DINAMICO
		TelaLogin.login(juquinha);
		
		TelaLogin.login(juca);
		System.gc();
		
		
	}
}
