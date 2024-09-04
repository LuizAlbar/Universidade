package frames;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import operacoes.*;

public class TelaStock implements ActionListener {

	JFrame frame = new JFrame("www.grocerystore.com.br//stock");

	ImageIcon image = new ImageIcon("5stock.png");
	JLabel labelImage = new JLabel();

	JButton backButton = new JButton();

	JTable estoque;
	JScrollPane scroll;

	RegistroUsuarios registros;

	OperacoesProdutos cart;

	TelaStock(RegistroUsuarios novosRegistros, OperacoesProdutos cart) {

		this.cart = cart;

		registros = novosRegistros;

		String soda = cart.getNameProductStock("Soda");
		int sodaS = cart.getStock("Soda");

		String wm = cart.getNameProductStock("Watermelon");
		int wmS = cart.getStock("Watermelon");

		String wafer = cart.getNameProductStock("Wafer");
		int waferS = cart.getStock("Wafer");

		String chips = cart.getNameProductStock("Chips");
		int chipsS = cart.getStock("Chips");

		String coffee = cart.getNameProductStock("Coffee");
		int coffeeS = cart.getStock("Coffee");

		String choco = cart.getNameProductStock("Chocolate");
		int chocoS = cart.getStock("Chocolate");

		Object[][] info = { { soda, sodaS }, { wm, wmS }, { wafer, waferS }, { chips, chipsS }, { coffee, coffeeS },
				{ choco, chocoS } };
		String[] colunas = { "Produto", "Estoque" };

		estoque = new JTable(info, colunas);

		estoque.setFont(new Font("Serif", Font.BOLD, 14));

		estoque.setTableHeader(null);

		estoque.setBackground(Color.WHITE);
		estoque.setEnabled(false);

		scroll = new JScrollPane(estoque);
		
		scroll.setEnabled(false);

		scroll.setBounds(150, 200, 400, 99);

		scroll.setForeground(Color.red);

		scroll.setColumnHeader(null);

		frame.getContentPane().add(scroll);

		backButton.setBounds(683, 388, 245, 90);
		backButton.addActionListener(this);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);

		labelImage.setIcon(image);
		labelImage.setSize(1200, 800);
		labelImage.setVerticalAlignment(JLabel.TOP);

		frame.add(backButton);
		frame.add(labelImage);
		frame.setSize(1079, 590);
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

	}

}
