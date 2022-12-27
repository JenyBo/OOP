
package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	// class attribute
	private static int nbDigitalVideoDiscs = 0;
	
	
	// Phương thức khởi tạo với 5 thuộc tính
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(director, length);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	
	public DigitalVideoDisc() {
		
	}
	
	
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
}
