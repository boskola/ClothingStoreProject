package store.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Purchase {
	
	private ArrayList<Product> cart;
	private LocalDateTime dateTime;
	
	public Purchase() {
		super();
		this.cart = new ArrayList<>();
		this.dateTime = LocalDateTime.now();
	}
	
	public Purchase(ArrayList<Product> cart, LocalDateTime dateTime) {
		super();
		this.cart = cart;
		this.dateTime = dateTime;
	}

	public ArrayList<Product> getCart() {
		return cart;
	}

	public void setCart(ArrayList<Product> cart) {
		this.cart = cart;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Purchase [cart=" + cart + ", dateTime=" + dateTime + "]";
	}
	
	public double subtotalSum() {
		double subtotalSum=0;
		
		for(Product product: cart) {
			subtotalSum+=product.getPrice();
		}
		
		return subtotalSum;
	}
	
	public void addProduct(Product product) {
		cart.add(product);
	}
	
	public void removeProduct(Product product) {
		cart.remove(product);
	}

}
