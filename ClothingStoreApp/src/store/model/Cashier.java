package store.model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import store.application.ClothingStore;

public class Cashier {
	
	public final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public void printReceipt(Purchase purchase) {
		
		boolean generalDiscount = purchase.getCart().size()>=3?true:false;
		DayOfWeek day = purchase.getDateTime().getDayOfWeek();
		boolean tuesday = day.toString().equals("TUESDAY");
		double totalSavings = 0.0;
		
		System.out.println("Date: " + purchase.getDateTime().format(formatter));
		System.out.println("---Products---");
		System.out.println();
		
		for(Product product: purchase.getCart()) {
			System.out.println(product);
			
			int productDiscount = 0;
			
			if (product instanceof Shoes && tuesday==true) {
				productDiscount = Shoes.tuesdayDiscount;
			}else if (generalDiscount==true) {
				productDiscount = ClothingStore.storeThreeOrMoreDiscount;
			}else if (product instanceof Shirts && tuesday==true) {
				productDiscount = Shirts.shirtsDiscount;
			}
			
			if (productDiscount!=0) {
				double calculatedSavings = product.getPrice()*(productDiscount/100.0);
				
				double roundedCalculatedSavings = Double.parseDouble(String.format("%.2f", calculatedSavings));
				
				System.out.print("#discount " + productDiscount+"% -$");
				System.out.println(String.format("%.2f", roundedCalculatedSavings));
				totalSavings+=roundedCalculatedSavings;
			}
			
			System.out.println();
			
		}
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("SUBTOTAL: $" + String.format("%.2f", purchase.subtotalSum()));
		System.out.println("DISCOUNT: -$" + String.format("%.2f", totalSavings));
				
		/*	
		 
		If we want to hide discount from customers that didn't get it
		 
		if (totalSavings!=0) {
			System.out.println("DISCOUNT: -$ " + totalSavings);
		} 
		*/
		
		System.out.println("TOTAL: $" + String.format("%.2f", (purchase.subtotalSum()-totalSavings)));
	}
	
	public void printReceipt(ArrayList<Product> cart, LocalDateTime dateTime) {
		printReceipt(new Purchase(cart, dateTime));
	}

}
