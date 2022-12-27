package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		
		Store store = new Store();
		
		// Khai báo 3 dvd
		DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		store.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", "Animation", "Geogre Lucas", 87, 18.99f);
		store.addMedia(dvd3);
		
		// In ra tổng số dvd
		System.out.print("total number of DVD is: ");
		System.out.println(store.getQtyInStore());
		
		System.out.print("total number of DVD after remove dvd3 is: ");
		store.removeMedia(dvd3); // Bỏ dvd số 3
		System.out.println(store.getQtyInStore()); // In tổng số dvd sau khi bỏ dvd số 3
	}
}
