package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {	
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", "Animation", "Unknown", 100,  18.99f);
		cart.addMedia(dvd3);

	}

}
