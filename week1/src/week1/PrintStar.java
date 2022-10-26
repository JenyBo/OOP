package week1;
import java.util.*;
public class PrintStar {
		    public static void main(String[] args)
		    {
				Scanner s = new Scanner(System.in);
		        System.out.println("Enter the number of rows to be printed");
		        int rows = s.nextInt();
		 
		        // loop to iterate for the given number of rows
		        for (int i = 1; i <= rows; i++) {
		            // loop to print the number of spaces before the star
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print(" ");
		            }
		 
		            // loop to print the number of stars in each row
		            for (int j = rows-i+1; j <= rows + i - 1; j++) {
		                System.out.print("*");		                
		            }
		 
		            // for new line after printing each row
		            System.out.println();
		        }
		    }
		
	}

