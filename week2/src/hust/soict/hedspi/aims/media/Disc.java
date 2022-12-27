
package hust.soict.hedspi.aims.media;

public class Disc extends Media {
	
	private String director;
	private int length;
		

	public String getDirector() {
		return director;
	}


	public int getLength() {
		return length;
	}


	public Disc(String director, int length) {
		this.director = director;
		this.length = length;
	}
	
	public Disc() {
		
	}

}
