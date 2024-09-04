import frames.TelaRecepcao;
import operacoes.OperacoesProdutos;
import operacoes.RegistroUsuarios;




public class Main {

	public static void main(String[] args) {

		RegistroUsuarios users = new RegistroUsuarios();
		OperacoesProdutos cart = new OperacoesProdutos();
		
	TelaRecepcao tela = new TelaRecepcao(users,cart);
		

	}
}
