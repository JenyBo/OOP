package week1;
import javax.swing.*;
import java.lang.String;
public class Ticket {
	public static void main (String[] args) {
		int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null,"You've chosen: " 
				+ (option==JOptionPane.YES_OPTION? "Hai":"Iie"));
	System.exit(0);
	}
}
