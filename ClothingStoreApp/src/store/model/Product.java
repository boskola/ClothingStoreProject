package store.model;

public abstract class Product {
	
	protected String name;
	protected String brand;
	protected double price;
	protected String color;
	
	public Product() {
		this.name = "";
		this.brand = "";
		this.price = 0.0;
		this.color = "";
	}
	
	public Product(String name, String brand, double price, String color) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		String retVal = "";
		retVal+= name + " - " + brand + "\n$" +  price;
		
		return retVal;
	}

}
