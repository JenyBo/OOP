package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class MediaTest {

	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		
		// Create some media
		DigitalVideoDisc dvd = new DigitalVideoDisc("Jungle", "Animation", "Roger Allers", 87, 19.95f);
		
		CompactDisc cd = new CompactDisc();
		cd.setTitle("World");
		cd.setCategory("Action");
		cd.setCost(100.5f);
		cd.setArtist("Harry");
		
		Book book = new Book();
		book.setTitle("Mimikara");
		book.setCategory("Reference");
		book.setCost(120f);
		
		
		// Add to mediae
		mediae.add(dvd);
		mediae.add(cd);
		mediae.add(book);
		
		for (Media m : mediae) {
			System.out.println(m.toString());
		}
		
	}

}
