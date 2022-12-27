package hust.soict.hedspi.aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;

public class Aims {
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media's details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}


	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int menuChoice, storeChoice, inputUpdate, inputCart, inputSearch;
		boolean checkLoop = true;
		String inputTitle;
		Cart cart = new Cart();
		Store store = new Store();
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
		
		store.addMedia(dvd);
		store.addMedia(cd);
		store.addMedia(book);
		
		// Menu
		while(checkLoop) {
			showMenu();
			menuChoice = keyboard.nextInt();
			keyboard.nextLine();
			switch (menuChoice) {
				case 1: 
					store.displayItemsInStore();
					storeMenu();
					storeChoice = keyboard.nextInt();
					keyboard.nextLine();
					
					switch (storeChoice) {
						case 1:
							System.out.print("Enter title: ");
							inputTitle = keyboard.nextLine();
							
							store.searchTitle(inputTitle);
							mediaDetailsMenu();
							break;
						
						case 2:
							System.out.println("Enter title: ");
							inputTitle = keyboard.nextLine();
							
							Media mediaSelected = store.checkExistedMediaByTitle(inputTitle);
							if (mediaSelected != null) {
								cart.addMedia(mediaSelected);
								System.out.println("The number of media in current cart: " + cart.getQtyInCart());
							}
							else {
								System.out.println("No media found in the store!");
							}
							break;
						case 3:
							System.out.print("Enter title: ");
							inputTitle = keyboard.nextLine();
							
							mediaSelected = store.checkExistedMediaByTitle(inputTitle);
							if (mediaSelected != null) {
								if (mediaSelected instanceof CompactDisc) {
									CompactDisc cdPlay = (CompactDisc) mediaSelected;
									cdPlay.play();
								}
								if (mediaSelected instanceof DigitalVideoDisc) {
									DigitalVideoDisc dvdPlay = (DigitalVideoDisc) mediaSelected;
									dvdPlay.play();
								}
							}
							break;
						case 0:
							break;
					}
					break;
				
				case 2: // Update store
					System.out.print("1 to add a media, 2 to remove a media from the store");
					inputUpdate = keyboard.nextInt();
					keyboard.nextLine();
					
					switch (inputUpdate) {
						case 1:
							System.out.print("1 to add a book, 2 to add a dvd. 3 to add a cd: ");
							inputUpdate = keyboard.nextInt();
							keyboard.nextLine();
							
							System.out.print("Enter title: ");
							String newTitle = keyboard.nextLine();
							System.out.print("Enter category: ");
							String newCategory = keyboard.nextLine();
							System.out.print("Enter cost: ");
							Float newCost = keyboard.nextFloat();
							keyboard.nextLine();
							
							switch (inputUpdate) {
								case 1: 
									Book newBook = new Book();
									newBook.setTitle(newTitle);
									newBook.setCategory(newCategory);
									newBook.setCost(newCost);
									
									store.addMedia(newBook);
									break;
								case 2:
									DigitalVideoDisc newDVD = new DigitalVideoDisc();
									newDVD.setTitle(newTitle);
									newDVD.setCategory(newCategory);
									newDVD.setCost(newCost);
									
									store.addMedia(newDVD);
									break;
								case 3:
									CompactDisc newCD = new CompactDisc();
									newCD.setTitle(newTitle);
									newCD.setCategory(newCategory);
									newCD.setCost(newCost);
									
									store.addMedia(newCD);
									break;
								default:
									System.out.println("Khong hop le!");
									break;
							}
							break;
							
						case 2:
							System.out.print("Enter title: ");
							inputTitle = keyboard.nextLine();
							
							Media mediaSelected = store.checkExistedMediaByTitle(inputTitle);
							if (mediaSelected != null) {
								store.removeMedia(mediaSelected);
							}
							break;
							
						default:
							System.out.println("Khong hop le!");
							break;
							
					}
					break;
					
				case 3: // See current cart
					cart.print();
					cartMenu();
					inputCart = keyboard.nextInt();
					keyboard.nextLine();
					
					switch (inputCart) {
						case 1:
							System.out.print("1 to search by id, 2 to search by title: ");
							inputSearch = keyboard.nextInt();
							keyboard.nextLine();
							
							switch (inputSearch) {
								case 1:
									System.out.print("Enter id: ");
									int inputId = keyboard.nextInt();
									keyboard.nextLine();
									cart.searchId(inputId);
									break;
								case 2:
									System.out.print("Enter title: ");
									inputTitle = keyboard.nextLine();
									cart.searchTitle(inputTitle);
									break;
								default:
									System.out.println("Khong hop le!");
									break;
									
							}
							break;
						case 2:
							System.out.print("1 to sort by title, 2 to sort by cost: ");
							int inputSort = keyboard.nextInt();
							keyboard.nextLine();
							
							switch (inputSort) {
								case 1:
									cart.sortByTitle();
									cart.print();
									break;
								case 2:
									cart.sortByCost();
									cart.print();
									break;
								default:
									System.out.println("Khong hop le!");
									break;
									
							}
							break;
						case 3:
							System.out.print("Enter title: ");
							inputTitle = keyboard.nextLine();
							cart.removeMedia(inputTitle);
							break;
						case 4:
							System.out.print("Enter title: ");
							inputTitle = keyboard.nextLine();
							
							Media mediaSelected = store.checkExistedMediaByTitle(inputTitle);
							if (mediaSelected != null) {
								if (mediaSelected instanceof CompactDisc) {
									CompactDisc cdPlay = (CompactDisc) mediaSelected;
									cdPlay.play();
								}
								if (mediaSelected instanceof DigitalVideoDisc) {
									DigitalVideoDisc dvdPlay = (DigitalVideoDisc) mediaSelected;
									dvdPlay.play();
								}
							}
							break;
						case 5:
							System.out.println("An order is created");
							cart.emptyCart();
						case 0:
							break;
						default:
							System.out.println("Khong hop le!");
							break;
					}
					break;
				case 0: 
					checkLoop = false;
					break;
				default:
					System.out.println("Khong hop le!");
					break;			
			}
		}	
		keyboard.close();
	}
}
