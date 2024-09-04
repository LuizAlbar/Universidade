package objetos; 
public class Usuario {

	private String apelido;
	private String user;
	private String senha;

	public Usuario(String apelido, String user, String senha) {
		super();
		this.user = user;
		this.senha = senha;
		this.apelido = apelido;
	}

	

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
