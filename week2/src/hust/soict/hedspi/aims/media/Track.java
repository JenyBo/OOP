package hust.soict.hedspi.aims.media;

public class Track implements Playable {
	
	private String title;
	private int length;
	

	public String getTitle() {
		return title;
	}


	public int getLength() {
		return length;
	}


	public Track(String title, int length) {
		this.length = length;
		this.title = title;
	}
	

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());	
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Track) {
			Track track = (Track) obj;
			return this.getTitle().equals(track.getTitle()) && this.getLength() == track.getLength();
		}
		return false;
	}

}
