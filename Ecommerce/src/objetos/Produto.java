package objetos;
public class Produto {

	private String name;
	private double price;
	private int storage;
	private int code;

	static int codeGenerator = 1;

	public Produto(String name, double price, int storage) {
		super();
		this.name = name;
		this.price = price;
		this.storage = storage;

		code = codeGenerator++;
	}

	public Produto(String name, int storage) {
		super();
		this.name = name;
		this.storage = storage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
