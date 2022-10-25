package OOP;
import javax.swing.JOptionPane;
import java.lang.Math;
public class TheSecondDegree {
	public static void main(String[] args) {
		String strNum1, strNum2, strNum3;
	
		String NghiemKep ="Phương trình này có nghiệm kép là: ";
		String voNghiem = "Phương trình vô nghiệm.";
		String NghiemDon = "Phương trình có hai ngiệm đơn là: ";
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ", "Input a number: ",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ", "Input b number: ",
				JOptionPane.INFORMATION_MESSAGE);
		strNum3 = JOptionPane.showInputDialog(null,
				"Please input the third number: ", "Input c number: ",
				JOptionPane.INFORMATION_MESSAGE);
		double aNumber = Double.parseDouble(strNum1);
		double bNumber = Double.parseDouble(strNum2);
		double cNumber = Double.parseDouble(strNum3);
		double delta = bNumber*bNumber - 4*aNumber*cNumber;
		double Nghiem1, Nghiem2;
			if (delta == 0) {
				
				Nghiem1 = -bNumber/(2*aNumber);
				JOptionPane.showMessageDialog(null, NghiemKep + Nghiem1);
	            	            
	        } else if (delta < 0){
	            	JOptionPane.showMessageDialog(null, voNghiem);
	            
	        } else {
	            Nghiem1 = (-bNumber - Math.sqrt(delta))/(2*aNumber);
	            Nghiem2 = (-bNumber + Math.sqrt(delta))/(2*aNumber);
	           
	           JOptionPane.showMessageDialog(null, NghiemDon + Nghiem1 + " and "+ Nghiem2);
	        }	
	}
}
