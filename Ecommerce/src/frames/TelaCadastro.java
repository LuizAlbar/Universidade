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

import objetos.Usuario;
import operacoes.OperacoesProdutos;
import operacoes.RegistroUsuarios;


public class TelaCadastro implements ActionListener {

	Usuario newUser;

	JFrame frame = new JFrame("www.grocerystore.com.br//sign-up");

	ImageIcon image = new ImageIcon("2cadastro.png");
	JLabel labelImage = new JLabel();

	JTextField nameField = new JTextField();
	JTextField userField = new JTextField();
	JPasswordField passwordField = new JPasswordField();

	JButton signupButton = new JButton();
	JButton backButton = new JButton();

	RegistroUsuarios registros;

	OperacoesProdutos cart;

	TelaCadastro(RegistroUsuarios novosRegistros, OperacoesProdutos cart) {

		this.cart = cart;

		registros = novosRegistros;

		labelImage.setIcon(image);
		labelImage.setSize(1200, 800);
		labelImage.setVerticalAlignment(JLabel.TOP);

		signupButton.setBounds(240, 420, 179, 70);
		signupButton.addActionListener(this);
		signupButton.setOpaque(false);
		signupButton.setContentAreaFilled(false);
		signupButton.setBorderPainted(false);

		backButton.setBounds(475, 420, 179, 70);
		backButton.addActionListener(this);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);

		nameField.setBounds(450, 259, 250, 36);
		nameField.setFont(new Font("Serif", Font.BOLD, 40));
		nameField.setOpaque(false);
		nameField.setBorder(null);
		nameField.setForeground(new Color(0, 0, 150));

		userField.setBounds(450, 309, 250, 36);
		userField.setFont(new Font("Serif", Font.BOLD, 40));
		userField.setForeground(new Color(0, 0, 150));
		userField.setOpaque(false);
		userField.setBorder(null);

		passwordField.setBounds(450, 359, 250, 36);
		passwordField.setFont(new Font("Serif", Font.BOLD, 30));
		passwordField.setOpaque(false);
		passwordField.setBorder(null);

		frame.add(nameField);
		frame.add(passwordField);
		frame.add(userField);
		frame.add(backButton);
		frame.add(signupButton);
		frame.add(labelImage);
		frame.setSize(1079, 590);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == signupButton) {

			String nome = nameField.getText();
			String user = userField.getText();
			String password = String.valueOf(passwordField.getPassword());
			
			boolean valid = registros.validUser(user);

			if (nome.length() > 0 && user.length() > 0 && password.length() > 0) {
				
				if(valid == true) {
					
					
					nameField.setForeground(Color.red);
					userField.setForeground(Color.red);
					
					
				}
				else {
					
					newUser = new Usuario(nome, user, password);
					
					nameField.setForeground(Color.green);
					userField.setForeground(Color.green);
				}

				

			} else {

				frame.dispose();
				TelaCadastro tryAgain = new TelaCadastro(registros, cart);

			}
			registros.criarConta(newUser);

		}

		if (e.getSource() == backButton) {
			frame.dispose();
			TelaRecepcao back = new TelaRecepcao(registros, cart);

		}

	}

}
