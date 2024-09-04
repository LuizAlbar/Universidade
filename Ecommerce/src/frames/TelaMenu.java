package frames;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import operacoes.*;

public class TelaMenu implements ActionListener {

	JFrame frame = new JFrame("www.grocerystore.com.br//menu");

	ImageIcon image = new ImageIcon("4menu.png");
	JLabel labelImage = new JLabel();

	JButton stockButton = new JButton();
	JButton shoppingButton = new JButton();
	JButton cartButton = new JButton();
	JButton checkoutButton = new JButton();

	JTextField userField = new JTextField();

	RegistroUsuarios registros;

	TelaLogin login;

	OperacoesProdutos cart;

	TelaMenu(RegistroUsuarios novosRegistros, OperacoesProdutos cart) {

		this.cart = cart;
		registros = novosRegistros;

		userField.setBounds(400, 100, 350, 80);
		userField.setEditable(false);
		userField.setText(login.getApelido());
		userField.setOpaque(false);
		userField.setBorder(null);
		userField.setFont(new Font("Serif", Font.BOLD, 40));
		userField.setForeground(new Color(0, 0, 110));

		labelImage.setIcon(image);
		labelImage.setSize(1200, 800);
		labelImage.setVerticalAlignment(JLabel.TOP);

		stockButton.setBounds(138, 190, 300, 105);
		stockButton.addActionListener(this);
		stockButton.setOpaque(false);
		stockButton.setContentAreaFilled(false);
		stockButton.setBorderPainted(false);

		shoppingButton.setBounds(532, 190, 294, 105);
		shoppingButton.addActionListener(this);
		shoppingButton.setOpaque(false);
		shoppingButton.setContentAreaFilled(false);
		shoppingButton.setBorderPainted(false);

		cartButton.setBounds(138, 377, 300, 105);
		cartButton.addActionListener(this);
		cartButton.setOpaque(false);
		cartButton.setContentAreaFilled(false);
		cartButton.setBorderPainted(false);

		checkoutButton.setBounds(532, 377, 294, 105);
		checkoutButton.addActionListener(this);
		checkoutButton.setOpaque(false);
		checkoutButton.setContentAreaFilled(false);
		checkoutButton.setBorderPainted(false);

		frame.add(userField);
		frame.add(stockButton);
		frame.add(shoppingButton);
		frame.add(cartButton);
		frame.add(checkoutButton);
		frame.add(labelImage);
		frame.setSize(1079, 590);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == stockButton) {

			frame.dispose();
			TelaStock stock = new TelaStock(registros, cart);
		}

		if (e.getSource() == shoppingButton) {
			frame.dispose();
			TelaShopping shopping = new TelaShopping(registros, cart);

		}
		if (e.getSource() == cartButton) {
			frame.dispose();
			TelaCart car = new TelaCart(registros, cart);
		}
		if (e.getSource() == checkoutButton) {
			frame.dispose();
			TelaCheckout checkout = new TelaCheckout(registros, cart);
		}

	}

}
