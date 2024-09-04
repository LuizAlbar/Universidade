package operacoes;

import java.util.ArrayList;

import objetos.*;

public class RegistroUsuarios {

	Usuario acharConta;

	private ArrayList<Usuario> users = new ArrayList<Usuario>();

	Usuario user1 = new Usuario("a", "a", "a");
	Usuario user2 = new Usuario("b", "b", "b");
	Usuario user3 = new Usuario("c", "c", "c");
	Usuario user4 = new Usuario("d", "d", "d");
	Usuario user5 = new Usuario("e", "e", "e");

	public RegistroUsuarios() {
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
	}

	public void criarConta(Usuario novaConta) {
		if (novaConta != null) {
			users.add(novaConta);
		}
	}

	public boolean getUser(String user, String password) {
		boolean accountFound = false;
		for (Usuario item : users) {
			if (item.getUser().equals(user) && item.getSenha().equals(password)) {
				accountFound = true;

			}
		}

		return accountFound;
	}

	public boolean validUser(String user) {
		boolean account = false;

		for (Usuario item : users) {
			if (item.getUser().equals(user)) {
				account = true;

			}
		}

		return account;
	}

	public String getApelido(String user, String password) {

		String apelido = "";
		for (Usuario item : users) {
			if (item.getUser().equals(user) && item.getSenha().equals(password)) {
				apelido = item.getApelido();
			}
		}
		return apelido;

	}

}
