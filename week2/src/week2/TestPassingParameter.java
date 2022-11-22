package week2;

public class TestPassingParameter {
	    public static void main(String[] args){
	        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
	        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
	        System.out.println("Before Swap");
	        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
	        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());
	        
	        swap(jungleDVD, cinderellaDVD);
	        
	        System.out.println("After Swap");
	        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
	        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());
	        
	        
	    }
	    public static void swap(Object o1, Object o2){
	        Object tmp = o1;
	        o1 = o2 ;
	        o2 = tmp;
	    }
	    public static void changeTitle(DigitalVideoDisc dvd, String title){
	        String oldTitle = dvd.getTitle();
	        dvd.setTitle(title);
	        dvd = new DigitalVideoDisc(oldTitle);
	    }
}