package operacoes;
import java.text.DecimalFormat;
import java.util.ArrayList;



import objetos.*;
public class OperacoesProdutos {

	private ArrayList<Produto> cart = new ArrayList<Produto>();

	public ArrayList<Produto> stock = new ArrayList<Produto>();
	// 7 8 11 3 13
	Produto soda = new Produto("Soda", 15);
	Produto watermelon = new Produto("Watermelon", 7);
	Produto wafer = new Produto("Wafer", 8);
	Produto chips = new Produto("Chips", 11);
	Produto coffee = new Produto("Coffee", 3);
	Produto chocolate = new Produto("Chocolate", 13);

	OperacoesProdutos operacoes;

	DecimalFormat round = new DecimalFormat("#.##");

	public OperacoesProdutos() {

		stock.add(soda);
		stock.add(watermelon);
		stock.add(wafer);
		stock.add(chips);
		stock.add(coffee);
		stock.add(chocolate);

	}

	public void addToCart(Produto novoProduto) {

		if (novoProduto != null) {
			cart.add(novoProduto);

		}
	}

	public int removeStock(String produto) {
		Integer n = null;

		for (Produto item : stock) {
			if (item.getName().equals(produto)) {

				n = item.getStorage();
				--n;

				item.setStorage(n);

			}

		}
		return n;

	}
	
	public int addStock(String produto) {
		Integer n = null;

		for (Produto item : stock) {
			if (item.getName().equals(produto)) {

				n = item.getStorage();
				++n;

				item.setStorage(n);

			}

		}
		return n;

	}
	
	public int getStock(String produto) {
		int storage = 0;
		for(Produto item: stock) {
			if(item.getName().equals(produto)) {
				
				storage = item.getStorage();
				
			}
		}
		
		return storage;
	}
	
	public String getNameProductStock(String produto) {
		String name = "";
		for(Produto item: stock) {
			if(item.getName().equals(produto)) {
				name += item.getName();
				
			}
		}
		return name;
	}


	public void removeProduct(String produto) {
		int menorCodigo = Integer.MAX_VALUE;
		Produto produtoRemover = null;

		for (Produto item : cart) {
			if (item.getName().equals(produto) && item.getCode() < menorCodigo) {
				menorCodigo = item.getCode();
				produtoRemover = item;
			}
		}

		if (produtoRemover != null) {
			cart.remove(produtoRemover);
		}
	}

	public int newQuanti(String produto) {
		int quantidade = 0;

		if (cart == null) {
			quantidade = 0;

		} else if (cart != null) {
			for (Produto item : cart) {
				if (item.getName().equals(produto)) {
					quantidade++;
					String produtoQuants = String.valueOf(quantidade);
				}
			}
		}
		return quantidade;
	}

	public int allQuanti() {

		int sizeArray = cart.size();
		return sizeArray;
	}

	

	

	public double newPrice(String produto) {
		double price = 0.0;
		if (cart == null) {
			price = 0.0;
		} else if (cart != null) {
			for (Produto item : cart) {
				if (item.getName().equals(produto)) {
					price += item.getPrice();

				}
			}
		}

		return price;
	}

	public double allPrice() {
		double price = 0.0;
		if (cart == null) {
			price = 0.0;
		} else {
			for (Produto item : cart) {
				price += item.getPrice();

			}
		}
		return price;

	}

	public boolean verify() {
		boolean valid = false;
		if (cart.size() > 0) {
			valid = true;

		}
		return valid;
	}
}
