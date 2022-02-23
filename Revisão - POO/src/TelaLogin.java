

public class TelaLogin {
	
	// user - TIPO ESTATICO -> Usuario
	static void login(Usuario user) {
		/// user -> FUNCIONARIO -- juquinha
		/// user -> CLIENTE -- juca
		if (user.autenticar()) {
			System.out.println("Acesso liberado");
		}else {
			System.out.println("Acesso negado");
		}
	}
}
