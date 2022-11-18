package store.model;

import store.util.ShirtSize;

public class Shirts extends Product {
	
	private ShirtSize size;
	public static final int shirtsDiscount = 10;

	public Shirts(ShirtSize size, String name, String brand, double price, String color) {
		super(name, brand, price, color);
		this.size = size;
	}

	public ShirtSize getSize() {
		return size;
	}

	public void setSize(ShirtSize size) {
		this.size = size;
	}

}
