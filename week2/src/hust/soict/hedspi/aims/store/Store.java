
package hust.soict.hedspi.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.Media;

public class Store {
	private List<Media> itemsInStore = new ArrayList<Media>();
	
	// Get the number of items in store
	public int getQtyInStore() {
		return itemsInStore.size();
	}
	
	public void displayItemsInStore() {
		System.out.println("***********************STORE***********************");
		for ( int i = 0 ; i < itemsInStore.size() ; i++ ) {
			System.out.printf("%d. %s - %s - %.2f \n", 								
								itemsInStore.get(i).getId(),
								itemsInStore.get(i).getTitle(),
								itemsInStore.get(i).getCategory(),
								itemsInStore.get(i).getCost());
		}
		System.out.println("***************************************************");
	}
	
	// Thêm media vào store
	public void addMedia(Media media) {
		itemsInStore.add(media);
	}
	
	// Xóa media khỏi store
	public void removeMedia(Media media) {
		for ( int i = 0 ; i < itemsInStore.size() ; i++ ) {
			if(itemsInStore.get(i).equals(media)) {
				itemsInStore.remove(i);
			}	
		}		
	}
	
	// Check by title if media existed in the store
	public Media checkExistedMediaByTitle(String input_title) {
		for (Media m : itemsInStore) {
			if (m.getTitle().equals(input_title)) return m;
		}
		return null;
		
	}
	
	// Search by title 
	public void searchTitle(String input_title) {
		int found = 0;
		for (Media m : itemsInStore) {
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
	
}
