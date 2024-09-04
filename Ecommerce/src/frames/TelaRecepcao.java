package frames;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import operacoes.OperacoesProdutos;
import operacoes.RegistroUsuarios;

public class TelaRecepcao implements ActionListener {

	JFrame frame = new JFrame("www.grocerystore.com.br//welcome-page");
	ImageIcon image = new ImageIcon("1recepcao.png");
	JLabel labelImage = new JLabel();

	JButton createAccount = new JButton();
	JButton loginAccount = new JButton();

	RegistroUsuarios registros;
	OperacoesProdutos cart;

	public TelaRecepcao(RegistroUsuarios novosRegistros, OperacoesProdutos cart) {

		this.cart = cart;

		registros = novosRegistros;

		labelImage.setIcon(image);
		labelImage.setSize(1200, 800);
		labelImage.setVerticalAlignment(JLabel.TOP);

		createAccount.setBounds(188, 332, 305, 119);
		createAccount.setFocusable(false);
		createAccount.addActionListener(this);
		createAccount.setOpaque(false);
		createAccount.setContentAreaFilled(false);
		createAccount.setBorderPainted(false);

		loginAccount.setBounds(597, 332, 305, 119);
		loginAccount.setFocusable(false);
		loginAccount.addActionListener(this);

		loginAccount.setOpaque(false);
		loginAccount.setContentAreaFilled(false);
		loginAccount.setBorderPainted(false);

		frame.add(createAccount);
		frame.add(loginAccount);
		frame.add(labelImage);
		frame.setSize(1079, 590);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == createAccount) {
			frame.dispose();
			TelaCadastro cadastro = new TelaCadastro(registros, cart);

		}
		if (e.getSource() == loginAccount) {
			frame.dispose();
			TelaLogin login = new TelaLogin(registros, cart);
		}

	}

}
