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

public class TelaCheckout implements ActionListener {

	JFrame frame = new JFrame("www.grocerystore.com.br//checkout");

	ImageIcon image = new ImageIcon("8checkout.png");
	JLabel labelImage = new JLabel();

	JButton backButton = new JButton();
	JButton checkoutButton = new JButton();

	JTextField sodaField;
	JTextField sodaPriceField;

	JTextField watermelonField;
	JTextField watermelonPriceField;

	JTextField waferField;
	JTextField waferPriceField;

	JTextField chipsField;
	JTextField chipsPriceField;

	JTextField coffeeField;
	JTextField coffeePriceField;

	JTextField chocolateField;
	JTextField chocolatePriceField;

	JTextField allQuantiField;
	JTextField allPricesField;

	DecimalFormat round = new DecimalFormat("#.##");

	RegistroUsuarios registros;

	OperacoesProdutos cart;

	TelaCheckout(RegistroUsuarios novosRegistros, OperacoesProdutos cart) {

		this.cart = cart;

		registros = novosRegistros;

		// ------------------------------------------------------------------------------------------------------------------------------
		String quantiSoda = String.valueOf(cart.newQuanti("Soda"));
		sodaField = new JTextField();
		sodaField.setText(quantiSoda);
		sodaField.setBounds(150, 133, 100, 100);
		sodaField.setHorizontalAlignment(JTextField.CENTER);
		sodaField.setOpaque(false);
		sodaField.setBorder(null);
		sodaField.setFont(new Font("Serif", Font.BOLD, 32));
		sodaField.setEditable(false);
		// ------------------------------------------------------------------------------------------------------------------------------
		double doublePriceSoda = cart.newPrice("Soda");
		String priceSoda = round.format(doublePriceSoda);

		sodaPriceField = new JTextField();
		sodaPriceField.setText(priceSoda);

		sodaPriceField.setBounds(260, 133, 100, 100);
		sodaPriceField.setHorizontalAlignment(JTextField.CENTER);
		sodaPriceField.setOpaque(false);
		sodaPriceField.setBorder(null);
		sodaPriceField.setFont(new Font("Serif", Font.BOLD, 32));
		sodaPriceField.setEditable(false);
		// ------------------------------------------------------------------------------------------------------------------------------
		String quantiWM = String.valueOf(cart.newQuanti("Watermelon"));
		watermelonField = new JTextField();
		watermelonField.setText(quantiWM);

		watermelonField.setBounds(150, 185, 100, 100);
		watermelonField.setHorizontalAlignment(JTextField.CENTER);
		watermelonField.setOpaque(false);
		watermelonField.setBorder(null);
		watermelonField.setFont(new Font("Serif", Font.BOLD, 32));
		watermelonField.setEditable(false);

		// ------------------------------------------------------------------------------------------------------------------------------

		double doublePriceWm = cart.newPrice("Watermelon");
		String priceWm = round.format(doublePriceWm);

		watermelonPriceField = new JTextField();
		watermelonPriceField.setText(priceWm);

		watermelonPriceField.setBounds(260, 185, 100, 100);
		watermelonPriceField.setHorizontalAlignment(JTextField.CENTER);
		watermelonPriceField.setOpaque(false);
		watermelonPriceField.setBorder(null);
		watermelonPriceField.setFont(new Font("Serif", Font.BOLD, 32));
		watermelonPriceField.setEditable(false);

		// ------------------------------------------------------------------------------------------------------------------------------

		String quantiWafer = String.valueOf(cart.newQuanti("Wafer"));
		waferField = new JTextField();
		waferField.setText(quantiWafer);

		waferField.setBounds(150, 235, 100, 100);
		waferField.setHorizontalAlignment(JTextField.CENTER);
		waferField.setOpaque(false);
		waferField.setBorder(null);
		waferField.setFont(new Font("Serif", Font.BOLD, 32));
		waferField.setEditable(false);

		// ------------------------------------------------------------------------------------------------------------------------------

		double doublePriceWafer = cart.newPrice("Wafer");
		String priceWafer = round.format(doublePriceWafer);

		waferPriceField = new JTextField();
		waferPriceField.setText(priceWafer);

		waferPriceField.setBounds(260, 235, 100, 100);
		waferPriceField.setHorizontalAlignment(JTextField.CENTER);
		waferPriceField.setOpaque(false);
		waferPriceField.setBorder(null);
		waferPriceField.setFont(new Font("Serif", Font.BOLD, 32));
		waferPriceField.setEditable(false);

		// ------------------------------------------------------------------------------------------------------------------------------

		String quantiChips = String.valueOf(cart.newQuanti("Chips"));
		chipsField = new JTextField();
		chipsField.setText(quantiChips);

		chipsField.setBounds(150, 288, 100, 100);
		chipsField.setHorizontalAlignment(JTextField.CENTER);
		chipsField.setOpaque(false);
		chipsField.setBorder(null);
		chipsField.setFont(new Font("Serif", Font.BOLD, 32));
		chipsField.setEditable(false);

		// ------------------------------------------------------------------------------------------------------------------------------

		double doublePriceChips = cart.newPrice("Wafer");
		String priceChips = round.format(doublePriceChips);

		chipsPriceField = new JTextField();
		chipsPriceField.setText(priceChips);

		chipsPriceField.setBounds(260, 288, 100, 100);
		chipsPriceField.setHorizontalAlignment(JTextField.CENTER);
		chipsPriceField.setOpaque(false);
		chipsPriceField.setBorder(null);
		chipsPriceField.setFont(new Font("Serif", Font.BOLD, 32));
		chipsPriceField.setEditable(false);

		// ------------------------------------------------------------------------------------------------------------------------------

		String quantiCoffee = String.valueOf(cart.newQuanti("Coffee"));
		coffeeField = new JTextField();
		coffeeField.setText(quantiCoffee);

		coffeeField.setBounds(150, 343, 100, 100);
		coffeeField.setOpaque(false);
		coffeeField.setHorizontalAlignment(JTextField.CENTER);
		coffeeField.setBorder(null);
		coffeeField.setEditable(false);
		coffeeField.setFont(new Font("Serif", Font.BOLD, 32));

		// ------------------------------------------------------------------------------------------------------------------------------

		double doublePriceCoffee = cart.newPrice("Coffee");
		String priceCoffee = round.format(doublePriceCoffee);

		coffeePriceField = new JTextField();
		coffeePriceField.setText(priceCoffee);

		coffeePriceField.setBounds(260, 343, 100, 100);
		coffeePriceField.setHorizontalAlignment(JTextField.CENTER);
		coffeePriceField.setOpaque(false);
		coffeePriceField.setBorder(null);
		coffeePriceField.setFont(new Font("Serif", Font.BOLD, 32));
		coffeePriceField.setEditable(false);

		// ------------------------------------------------------------------------------------------------------------------------------

		String quantiChoco = String.valueOf(cart.newQuanti("Chocolate"));
		chocolateField = new JTextField();
		chocolateField.setText(quantiChoco);

		chocolateField.setBounds(150, 395, 100, 100);
		chocolateField.setHorizontalAlignment(JTextField.CENTER);
		chocolateField.setOpaque(false);
		chocolateField.setBorder(null);
		chocolateField.setEditable(false);
		chocolateField.setFont(new Font("Serif", Font.BOLD, 32));

		// ------------------------------------------------------------------------------------------------------------------------------

		double doublePriceChoco = cart.newPrice("Chocolate");
		String priceChoco = round.format(doublePriceChoco);

		chocolatePriceField = new JTextField();
		chocolatePriceField.setText(priceChoco);

		chocolatePriceField.setBounds(260, 395, 100, 100);
		chocolatePriceField.setOpaque(false);
		chocolatePriceField.setHorizontalAlignment(JTextField.CENTER);
		chocolatePriceField.setBorder(null);
		chocolatePriceField.setFont(new Font("Serif", Font.BOLD, 32));

		// ------------------------------------------------------------------------------------------------------------------------------
		String allQuanti = String.valueOf(cart.allQuanti());
		allQuantiField = new JTextField();
		allQuantiField.setText(allQuanti);

		allQuantiField.setBounds(150, 448, 100, 100);
		allQuantiField.setOpaque(false);
		allQuantiField.setBorder(null);
		allQuantiField.setHorizontalAlignment(JTextField.CENTER);
		allQuantiField.setEditable(false);
		allQuantiField.setFont(new Font("Serif", Font.BOLD, 32));

		// ------------------------------------------------------------------------------------------------------------------------------

		double allPrices = cart.allPrice();
		String prices = round.format(allPrices);

		allPricesField = new JTextField();
		allPricesField.setText(prices);

		allPricesField.setBounds(260, 448, 100, 100);
		allPricesField.setOpaque(false);
		allPricesField.setBorder(null);
		allPricesField.setEditable(false);
		allPricesField.setHorizontalAlignment(JTextField.CENTER);
		allPricesField.setFont(new Font("Serif", Font.BOLD, 32));

		// ------------------------------------------------------------------------------------------------------------------------------

		labelImage.setIcon(image);
		labelImage.setSize(1200, 800);
		labelImage.setVerticalAlignment(JLabel.TOP);

		backButton.setBounds(684, 375, 245, 90);
		backButton.addActionListener(this);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);

		checkoutButton.setBounds(684, 268, 245, 90);
		checkoutButton.addActionListener(this);
		checkoutButton.setOpaque(false);
		checkoutButton.setBorderPainted(false);
		checkoutButton.setContentAreaFilled(false);

		frame.add(sodaField);
		frame.add(sodaPriceField);

		frame.add(watermelonField);
		frame.add(watermelonPriceField);

		frame.add(waferField);
		frame.add(waferPriceField);

		frame.add(chipsField);
		frame.add(chipsPriceField);

		frame.add(coffeeField);
		frame.add(coffeePriceField);

		frame.add(chocolateField);
		frame.add(chocolatePriceField);

		frame.add(allQuantiField);
		frame.add(allPricesField);

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

		if (e.getSource() == backButton) {
			frame.dispose();
			TelaMenu back = new TelaMenu(registros, cart);
		}
		if (e.getSource() == checkoutButton) {
			frame.dispose();

			TelaFinal exit = new TelaFinal(registros);

		}
	}

}
