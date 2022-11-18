package store.application;

import store.model.Cashier;
import store.model.Purchase;
import store.model.Shirts;
import store.model.Shoes;
import store.model.SuitJackets;
import store.model.Trousers;
import store.util.ShirtSize;

public class ClothingStore {
	
	public static final int storeThreeOrMoreDiscount = 20;

	public static void main(String[] args) {
		
		Shirts shirt1 = new Shirts(ShirtSize.M, "Blue Cotton Shirt", "BrandS", 14.99, "Blue");
		Shirts shirt2 = new Shirts(ShirtSize.M, "White Cotton Shirt", "BrandS", 15.99, "White");
		Trousers trousers1 = new Trousers("Black Cotton Trousers", "BrandT", 29.99, "Black", 50);
		Shoes shoe1 = new Shoes("Black Leather Shoes", "BrandS", 59.99, "Black", 43);
		SuitJackets suitJacket1 = new SuitJackets("Black Cotton Suit Jacket", "BrandJ", 99.99, "Black", 50);

		Purchase purchase1 = new Purchase();
		
		purchase1.addProduct(shirt1);
		purchase1.addProduct(shirt2);
		purchase1.addProduct(trousers1);
		purchase1.addProduct(shoe1);
		purchase1.addProduct(suitJacket1);
		
		Cashier cashier = new Cashier();
		cashier.printReceipt(purchase1);
	}
}
