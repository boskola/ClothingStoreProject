package store.model;

public class Shoes extends Product {
	
	private int size; //39-46
	
	public static final int tuesdayDiscount = 25;
	
	public Shoes() {
		super();
		this.size = 0;
	}

	public Shoes(String name, String brand, double price, String color, int size) {
		super(name, brand, price, color);
		if(size>=39 && size<=46)
			this.size = size;
		else
			throw new IllegalArgumentException();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size>=39 && size<=46)
			this.size = size;
		else
			throw new IllegalArgumentException();
	}

}
