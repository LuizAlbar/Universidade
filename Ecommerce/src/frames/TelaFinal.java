package frames;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import operacoes.*;
public class TelaFinal implements ActionListener {

	JFrame frame = new JFrame("www.grocerystore.com.br//exit");

	ImageIcon image = new ImageIcon("9exit.png");
	JLabel labelImage = new JLabel(image);

	JButton exitButton = new JButton();
	JButton backButton = new JButton();
	
	RegistroUsuarios registros;
	
	OperacoesProdutos cart;

	TelaFinal(RegistroUsuarios novosRegistros) {
		
		registros = novosRegistros;
		
		cart = new OperacoesProdutos();

		labelImage.setSize(1200, 800);
		labelImage.setVerticalAlignment(JLabel.TOP);
		labelImage.setHorizontalAlignment(JLabel.LEFT);

		exitButton.setBounds(617, 417, 247, 92);
		exitButton.setOpaque(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false);
		exitButton.addActionListener(this);

		backButton.setBounds(215, 417, 247, 92);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);
		backButton.addActionListener(this);

		frame.add(backButton);
		frame.add(exitButton);
		frame.add(labelImage);
		frame.setSize(1079, 590);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == exitButton) {
			frame.dispose();
		}
		
		if(e.getSource() == backButton) {
			frame.dispose();
			
			TelaRecepcao recepcao = new TelaRecepcao(registros, cart);
					
		}

	}

}
