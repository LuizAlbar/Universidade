package frames;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import operacoes.*;
import objetos.*;

public class TelaShopping implements ActionListener {

	JFrame frame = new JFrame("www.grocerystore.com.br//shopping");

	ImageIcon image = new ImageIcon("6shopping.png");
	JLabel labelImage = new JLabel();

	JButton backButton = new JButton();
	JButton checkoutButton = new JButton();

	// PRODUCTS BUTTONS
	JButton addSodaButton = new JButton();
	JButton removeSodaButton = new JButton();
	JButton addWatermelonButton = new JButton();
	JButton removeWatermelonButton = new JButton();
	JButton addWaferButton = new JButton();
	JButton removeWaferButton = new JButton();
	JButton addChipsButton = new JButton();
	JButton removeChipsButton = new JButton();
	JButton addCoffeeButton = new JButton();
	JButton removeCoffeeButton = new JButton();
	JButton addChocolateButton = new JButton();
	JButton removeChocolateButton = new JButton();
	// PRODUCTS BUTTONS

	RegistroUsuarios registros;

	Produto novoProduto;
	OperacoesProdutos cart;

	JTextField sodaField;
	JTextField watermelonField;
	JTextField waferField;
	JTextField chipsField;
	JTextField coffeeField;
	JTextField chocolateField;

	DecimalFormat round = new DecimalFormat("#.##");

	TelaShopping(RegistroUsuarios novosRegistros, OperacoesProdutos cart) {

		this.cart = cart;

		registros = novosRegistros;

		labelImage.setIcon(image);
		labelImage.setSize(1200, 800);
		labelImage.setVerticalAlignment(JLabel.TOP);

		// SODA

		String quantSoda = String.valueOf(cart.newQuanti("Soda"));
		sodaField = new JTextField();
		sodaField.setText(quantSoda);

		removeSodaButton.setBounds(172, 346, 23, 23);
		removeSodaButton.addActionListener(this);
		removeSodaButton.setOpaque(false);
		removeSodaButton.setContentAreaFilled(false);
		removeSodaButton.setBorderPainted(false);

		addSodaButton.setBounds(249, 346, 23, 23);
		addSodaButton.addActionListener(this);
		addSodaButton.setOpaque(false);
		addSodaButton.setContentAreaFilled(false);
		addSodaButton.setBorderPainted(false);

		sodaField.setBounds(210, 346, 30, 25);
		sodaField.setHorizontalAlignment(JTextField.CENTER);
		sodaField.setOpaque(false);
		sodaField.setBorder(null);
		sodaField.setFont(new Font("Serif", Font.BOLD, 25));
		sodaField.setEditable(false);

		// SODA

		// WATERMELON
		removeWatermelonButton.setBounds(299, 346, 23, 23);
		removeWatermelonButton.addActionListener(this);
		removeWatermelonButton.setOpaque(false);
		removeWatermelonButton.setContentAreaFilled(false);
		removeWatermelonButton.setBorderPainted(false);

		addWatermelonButton.setBounds(378, 346, 23, 23);
		addWatermelonButton.addActionListener(this);
		addWatermelonButton.setOpaque(false);
		addWatermelonButton.setContentAreaFilled(false);
		addWatermelonButton.setBorderPainted(false);

		String quantWatermelon = String.valueOf(cart.newQuanti("Watermelon"));
		watermelonField = new JTextField();
		watermelonField.setText(quantWatermelon);

		watermelonField.setBounds(338, 346, 30, 25);
		watermelonField.setHorizontalAlignment(JTextField.CENTER);
		watermelonField.setOpaque(false);
		watermelonField.setBorder(null);
		watermelonField.setFont(new Font("Serif", Font.BOLD, 25));
		watermelonField.setEditable(false);

		// WATERMELON

		// WAFER

		removeWaferButton.setBounds(428, 346, 23, 23);
		removeWaferButton.addActionListener(this);
		removeWaferButton.setOpaque(false);
		removeWaferButton.setContentAreaFilled(false);
		removeWaferButton.setBorderPainted(false);

		addWaferButton.setBounds(502, 346, 23, 23);
		addWaferButton.addActionListener(this);
		addWaferButton.setOpaque(false);
		addWaferButton.setContentAreaFilled(false);
		addWaferButton.setBorderPainted(false);

		String quantWafer = String.valueOf(cart.newQuanti("Wafer"));
		waferField = new JTextField();
		waferField.setText(quantWafer);

		waferField.setBounds(462, 346, 30, 25);
		waferField.setHorizontalAlignment(JTextField.CENTER);
		waferField.setOpaque(false);
		waferField.setBorder(null);
		waferField.setFont(new Font("Serif", Font.BOLD, 25));
		waferField.setEditable(false);

		// WAFER

		// CHIPS
		removeChipsButton.setBounds(553, 346, 23, 23);
		removeChipsButton.addActionListener(this);
		removeChipsButton.setOpaque(false);
		removeChipsButton.setContentAreaFilled(false);
		removeChipsButton.setBorderPainted(false);

		addChipsButton.setBounds(629, 346, 23, 23);
		addChipsButton.addActionListener(this);
		addChipsButton.setOpaque(false);
		addChipsButton.setContentAreaFilled(false);
		addChipsButton.setBorderPainted(false);

		String quantChips = String.valueOf(cart.newQuanti("Chips"));
		chipsField = new JTextField();
		chipsField.setText(quantChips);

		chipsField.setBounds(588, 346, 30, 25);
		chipsField.setHorizontalAlignment(JTextField.CENTER);
		chipsField.setOpaque(false);
		chipsField.setBorder(null);
		chipsField.setFont(new Font("Serif", Font.BOLD, 25));

		// CHIPS

		// COFFEE
		removeCoffeeButton.setBounds(678, 346, 23, 23);
		removeCoffeeButton.addActionListener(this);
		removeCoffeeButton.setOpaque(false);
		removeCoffeeButton.setContentAreaFilled(false);
		removeCoffeeButton.setBorderPainted(false);

		addCoffeeButton.setBounds(758, 346, 23, 23);
		addCoffeeButton.addActionListener(this);
		addCoffeeButton.setOpaque(false);
		addCoffeeButton.setContentAreaFilled(false);
		addCoffeeButton.setBorderPainted(false);

		String quantCoffee = String.valueOf(cart.newQuanti("Coffee"));
		coffeeField = new JTextField();
		coffeeField.setText(quantCoffee);

		coffeeField.setBounds(715, 346, 30, 25);
		coffeeField.setHorizontalAlignment(JTextField.CENTER);
		coffeeField.setOpaque(false);
		coffeeField.setBorder(null);
		coffeeField.setFont(new Font("Serif", Font.BOLD, 25));

		// COFFEE

		// CHOCOLATE

		removeChocolateButton.setBounds(806, 346, 23, 23);
		removeChocolateButton.addActionListener(this);
		removeChocolateButton.setOpaque(false);
		removeChocolateButton.setContentAreaFilled(false);
		removeChocolateButton.setBorderPainted(false);

		addChocolateButton.setBounds(885, 346, 23, 23);
		addChocolateButton.addActionListener(this);
		addChocolateButton.setOpaque(false);
		addChocolateButton.setContentAreaFilled(false);
		addChocolateButton.setBorderPainted(false);

		String quantChoco = String.valueOf(cart.newQuanti("Chocolate"));
		chocolateField = new JTextField();
		chocolateField.setText(quantChoco);

		chocolateField.setBounds(845, 346, 30, 25);
		chocolateField.setHorizontalAlignment(JTextField.CENTER);
		chocolateField.setOpaque(false);
		chocolateField.setBorder(null);
		chocolateField.setFont(new Font("Serif", Font.BOLD, 25));

		// CHOCOLATE

		backButton.setBounds(172, 395, 248, 92);
		backButton.addActionListener(this);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);

		checkoutButton.setBounds(657, 395, 248, 92);
		checkoutButton.addActionListener(this);
		checkoutButton.setOpaque(false);
		checkoutButton.setContentAreaFilled(false);
		checkoutButton.setBorderPainted(false);

		frame.add(addSodaButton);
		frame.add(removeSodaButton);
		frame.add(sodaField);

		frame.add(addWatermelonButton);
		frame.add(removeWatermelonButton);
		frame.add(watermelonField);

		frame.add(addWaferButton);
		frame.add(removeWaferButton);
		frame.add(waferField);

		frame.add(addChipsButton);
		frame.add(removeChipsButton);
		frame.add(chipsField);

		frame.add(addCoffeeButton);
		frame.add(removeCoffeeButton);
		frame.add(coffeeField);

		frame.add(addChocolateButton);
		frame.add(removeChocolateButton);
		frame.add(chocolateField);

		frame.add(checkoutButton);
		frame.add(backButton);
		frame.add(labelImage);
		frame.setSize(1079, 610);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addSodaButton) {

			novoProduto = new Produto("Soda", 5.35, 15);

			if (cart.getStock("Soda") > 0) {
				cart.addToCart(novoProduto);
				cart.removeStock("Soda");

			}

			int sodaQ = cart.newQuanti("Soda");

			String sodaQQ = String.valueOf(sodaQ);

			sodaField.setText(sodaQQ);

		}

		if (e.getSource() == removeSodaButton) {

			if (cart.getStock("Soda") < 15) {
				cart.removeProduct("Soda");
				cart.addStock("Soda");
			}

			int sodaQ = cart.newQuanti("Soda");
			String sodaQQ = String.valueOf(sodaQ);

			sodaField.setText(sodaQQ);

		}

		if (e.getSource() == addWatermelonButton) {

			novoProduto = new Produto("Watermelon", 9.70, 7);
			if (cart.getStock("Watermelon") > 0) {

				cart.addToCart(novoProduto);
				cart.removeStock("Watermelon");
			}

			int watermelonQ = cart.newQuanti("Watermelon");
			String watermelonQQ = String.valueOf(watermelonQ);
			watermelonField.setText(watermelonQQ);

		}

		if (e.getSource() == removeWatermelonButton) {

			if (cart.getStock("Watermelon") < 7) {

				cart.removeProduct("Watermelon");
				cart.addStock("Watermelon");
			}

			int watermerlonQ = cart.newQuanti("Watermelon");
			String watermelonQQ = String.valueOf(watermerlonQ);

			watermelonField.setText(watermelonQQ);
		}

		if (e.getSource() == addWaferButton) {

			novoProduto = new Produto("Wafer", 4.10, 8);

			if (cart.getStock("Wafer") > 0) {
				cart.addToCart(novoProduto);
				cart.removeStock("Wafer");

			}

			int waferQ = cart.newQuanti("Wafer");
			String waferQQ = String.valueOf(waferQ);
			waferField.setText(waferQQ);

		}
		if (e.getSource() == removeWaferButton) {

			if (cart.getStock("Wafer") < 8) {
				cart.removeProduct("Wafer");
				cart.addStock("Wafer");
			}

			int waferQ = cart.newQuanti("Wafer");
			String waferQQ = String.valueOf(waferQ);

			waferField.setText(waferQQ);

			System.out.println(cart.getStock("Wafer"));

		}

		if (e.getSource() == addChipsButton) {

			novoProduto = new Produto("Chips", 6.40, 11);

			if (cart.getStock("Chips") > 0) {

				cart.addToCart(novoProduto);

				cart.removeStock("Chips");

			}

			int chipsQ = cart.newQuanti("Chips");
			String chipsQQ = String.valueOf(chipsQ);
			chipsField.setText(chipsQQ);

		}

		if (e.getSource() == removeChipsButton) {

			if (cart.getStock("Chips") < 11) {
				cart.removeProduct("Chips");
				cart.addStock("Chips");

			}

			int chipsQ = cart.newQuanti("Chips");
			String chipsQQ = String.valueOf(chipsQ);

			chipsField.setText(chipsQQ);
		}
		if (e.getSource() == addCoffeeButton) {

			novoProduto = new Produto("Coffee", 2.90, 3);

			if (cart.getStock("Coffee") > 0) {
				cart.addToCart(novoProduto);
				cart.removeStock("Coffee");
			}

			int coffeeQ = cart.newQuanti("Coffee");
			String coffeeQQ = String.valueOf(coffeeQ);
			coffeeField.setText(coffeeQQ);
		}

		if (e.getSource() == removeCoffeeButton) {

			if (cart.getStock("Coffee") < 3) {
				cart.removeProduct("Coffee");
				cart.addStock("Coffee");
			}

			int coffeeQ = cart.newQuanti("Coffee");
			String coffeeQQ = String.valueOf(coffeeQ);

			coffeeField.setText(coffeeQQ);
		}

		if (e.getSource() == addChocolateButton) {
			novoProduto = new Produto("Chocolate", 7.80, 13);

			if (cart.getStock("Chocolate") > 0) {
				cart.addToCart(novoProduto);
				cart.removeStock("Chocolate");

			}

			int chocoQ = cart.newQuanti("Chocolate");
			String chocoQQ = String.valueOf(chocoQ);
			chocolateField.setText(chocoQQ);
		}

		if (e.getSource() == removeChocolateButton) {

			if (cart.getStock("Chocolate") < 13) {
				cart.removeProduct("Chocolate");
				cart.addStock("Chocolate");

			}

			int chocoQ = cart.newQuanti("Chocolate");
			String chocoQQ = String.valueOf(chocoQ);

			chocolateField.setText(chocoQQ);
		}

		if (e.getSource() == backButton) {
			frame.dispose();
			TelaMenu back = new TelaMenu(registros, cart);
		}
		if (e.getSource() == checkoutButton) {
			frame.dispose();
			TelaCheckout checkout = new TelaCheckout(registros, cart);


		}
	}

}
