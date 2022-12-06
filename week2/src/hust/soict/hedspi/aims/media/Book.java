package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

//	private static int count = 0;
	private List<String> authors = new ArrayList<String>();
	
//	public void Book() {
//		count++;
//		this.setId(count);
//	}
	
	public Book(int id , String title, String category, float cost) {
		super(id,title,category,cost);
	}
	
	public Book(int id , String title, String category, float cost , List<String> authors) {
		super(id,title,category,cost);
		this.authors = authors;
	}
	

	public List<String> getAuthors() {
		return authors;
	}



	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public String toString() {
		return this.id + " - " + this.title + " - " + this.category 
	    + " - " + this.cost + " - " + this.authors ;
	}
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
		}
		else {
			System.out.println("Tac gia nay da ton tai");
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
		}
		else {
			System.out.println("Tac gia nay khong ton tai");
		}
	}

	public void print(int id) {
		System.out.println(id);
	}
	public static void main(String[] args) {
		List<String> authors1 = new ArrayList<String>();
		authors1.add("Asan");
		Book book1 = new Book(1,"Doraemon","Comedy",10.5f,authors1);
		Book book2 = new Book(2,"Conan","Detective",12.5f,(List<String>) new ArrayList<String>(List.of("B","C")));
		book2.addAuthor("D");
		book2.removeAuthor("C");
		System.out.println(book1.getId());
		System.out.println(book2.toString());
	}
	
}
