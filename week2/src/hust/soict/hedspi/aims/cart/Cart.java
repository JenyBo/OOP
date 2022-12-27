
package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hust.soict.hedspi.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;  // số lượng dvd tối đa trong giỏ hàng là 20
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	// Get the number of items in cart
	public int getQtyInCart() {
		return itemsOrdered.size();
	}
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
			itemsOrdered.add(media);
		}
	}
	
	// Empty the cart
	public void emptyCart() {
		itemsOrdered.clear();
	}
	
	// Remove media with a media as parameter
	public void removeMedia (Media media) {
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).equals(media)) {
				itemsOrdered.remove(i);
			}
		}
	}
	
	// Remove media with only title
	public void removeMedia (String inputTitle) {
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getTitle() == inputTitle) {
				itemsOrdered.remove(i);
			}
		}
	}
	
	
	// Tính tổng giá của dvd trong giỏ hàng
	public float totalCost() {
		float SUM = 0 ;
		for (Media m : itemsOrdered) {
				SUM += m.getCost();
		}
		return SUM;
	}
	
	// search media in cart and print based on id
	public void searchId(int input_id) {
		int found = 0;
		for (Media m : itemsOrdered) {
			if (m.getId() == input_id) {
				System.out.printf("%d. %s - %s - %.2f \n", 									
									m.getId(),
									m.getTitle(),
									m.getCategory(),
									m.getCost());
				found = 1;
			}	
		}
		if (found == 0) {
			System.out.println("Khong tim thay!");
		}
	}
	
	// Search by title 
	public void searchTitle(String input_title) {
		int found = 0;
		for (Media m : itemsOrdered) {
			if (m.getTitle().equals(input_title)) {
				System.out.printf("%d. %s - %s - %.2f \n", 
									m.getId(),
									m.getTitle(),
									m.getCategory(),
									m.getCost());
				found = 1;
			}			
		}
		if (found == 0) {
			System.out.println("Khong tim thay!");
		}
	}
	
	// Print cart 
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (Media m : itemsOrdered) {
			System.out.printf("%d. %s - %s - %.2f \n", 
								m.getId(),
								m.getTitle(),
								m.getCategory(),
								m.getCost());
		}
		System.out.println("***************************************************");
	}
	
	// Sort by title
	public void sortByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	
	// Sort by cost
	public void sortByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
}
