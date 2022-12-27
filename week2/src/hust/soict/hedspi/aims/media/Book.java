
package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private static int nbBooks = 0;
	private List<String> authors = new ArrayList<String>();
	
	// Add author
	public void addAuthor(String authorName) {
		boolean checkAuthor = false;
		for (String a : authors) {
			if (a.equals(authorName)) { // Kiểm tra nếu trùng tác giả
				checkAuthor = true;
				break;
			}
		}
		if (!checkAuthor) {
			authors.add(authorName); // Thêm tác giả nếu không trùng
		}
	}
	
	// Remove author
	public void removeAuthor(String authorName) {
		for (int i = 0; i < authors.size(); i++) {
			if (authors.get(i).equals(authorName)) { // Nếu tồn tại tác giả thì remove
				authors.remove(i);
			}
		}
	}
	
	// Constructor
	public Book() {
		super();
		nbBooks++;
		this.setId(nbBooks);
	}
	

}
