package store.model;

public class Trousers extends Product {
	
	private int size; //42-66 (only even)

	public Trousers(String name, String brand, double price, String color, int size) {
		super(name, brand, price, color);
		if(size>=42 && size<=66 && size%2==0)
			this.size = size;
		else
			throw new IllegalArgumentException();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size>=42 && size<=66 && size%2==0)
			this.size = size;
		else
			throw new IllegalArgumentException();
	}
}
