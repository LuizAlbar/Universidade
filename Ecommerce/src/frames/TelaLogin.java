package frames;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import operacoes.OperacoesProdutos;
import operacoes.RegistroUsuarios;

public class TelaLogin implements ActionListener {

	public static String apelidoPrimario = "";

	JFrame frame = new JFrame("www.grocerystore.com.br//login");

	ImageIcon image = new ImageIcon("3login.png");
	JLabel labelImage = new JLabel();

	JTextField userField = new JTextField();
	JPasswordField passwordField = new JPasswordField();

	JButton loginButton = new JButton();
	JButton cancelButton = new JButton();

	RegistroUsuarios registros;
	
	OperacoesProdutos cart;

	TelaLogin(RegistroUsuarios novosRegistros,OperacoesProdutos cart) {
		
		this.cart = cart;

		registros = novosRegistros;

		labelImage.setIcon(image);
		labelImage.setSize(1200, 800);
		labelImage.setVerticalAlignment(JLabel.TOP);

		loginButton.setBounds(242, 420, 177, 70);
		loginButton.addActionListener(this);
		loginButton.setOpaque(false);
		loginButton.setContentAreaFilled(false);
		loginButton.setBorderPainted(false);

		cancelButton.setBounds(476, 420, 178, 70);
		cancelButton.addActionListener(this);
		cancelButton.setOpaque(false);
		cancelButton.setContentAreaFilled(false);
		cancelButton.setBorderPainted(false);

		userField.setBounds(450, 259, 250, 36);
		userField.setFont(new Font("Serif", Font.BOLD, 40));
		userField.setForeground(new Color(0, 0, 150));
		userField.setOpaque(false);
		userField.setBorder(null);

		passwordField.setBounds(450, 309, 250, 36);
		passwordField.setFont(new Font("Serif", Font.BOLD, 30));
		passwordField.setOpaque(false);
		passwordField.setBorder(null);

		frame.add(passwordField);
		frame.add(userField);
		frame.add(cancelButton);
		frame.add(loginButton);
		frame.add(labelImage);
		frame.setSize(1079, 590);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == loginButton) {
			String user = userField.getText();
			String password = String.valueOf(passwordField.getPassword());

			String apelido = registros.getApelido(user, password);

			apelidoPrimario = apelido;

			boolean validacao = registros.getUser(user, password);
			
			
			if (validacao == true) {
				frame.dispose();
				TelaMenu menu = new TelaMenu(registros,cart);

			} else {
				userField.setForeground(Color.red);

			}

		}

		if (e.getSource() == cancelButton) {
			 frame.dispose();
			TelaRecepcao back = new TelaRecepcao(registros,cart);

		}
	}

	public static String getApelido() {
		return apelidoPrimario;
	}

}
