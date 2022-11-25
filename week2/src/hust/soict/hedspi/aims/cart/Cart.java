package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private int qtyOrdered = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBER_ORDERED)
		{
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
        }
        else{
            System.out.println("The cart is almost full");
        }
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int index = 0 ;
		for ( int i = 0 ; i < qtyOrdered ; i++ )
		{
			if(itemsOrdered[i].equals(disc))
			{
				break;
			}
			else {
				index++;
			}
		}
		for(int i=index; i<qtyOrdered-1; i++){
            itemsOrdered[i] = itemsOrdered[i+1];
        }
		qtyOrdered--;
	}
	public float totalCost() {
		float SUM = 0 ;
		for ( int i = 0 ; i < qtyOrdered ; i++ ) {
				SUM += itemsOrdered[i].getCost();
		}
		return SUM;
	}
	public void print() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i].toString());
        }
        System.out.println("**************************************************");
    }

    public DigitalVideoDisc searchByID(int number) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == number) {
                System.out.println("Found: " + itemsOrdered[i].toString());
                return itemsOrdered[i];
            }
        }
        System.out.println("Item not found.");
        return null;
    }

    public DigitalVideoDisc searchByTitle(String keyword) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(keyword)) {
                System.out.println("Found: " + itemsOrdered[i].toString());
                return itemsOrdered[i];
            }
        }
        System.out.println("Item not found.");
        return null;
    }
}