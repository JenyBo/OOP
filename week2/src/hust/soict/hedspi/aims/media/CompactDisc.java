
package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media implements Playable {
	
	private static int nbCompactDiscs = 0;
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public CompactDisc() {
		super();
		nbCompactDiscs++;
		this.setId(nbCompactDiscs);
	}
	
	public void addTrack(Track track) {
		boolean checkTrack = false;
		for (Track t : tracks) {
			if (t.getTitle().equals(track.getTitle()) && t.getLength()==track.getLength()) {
				checkTrack = true;
				System.out.println("The input track is already in the list of tracks");
				break;
			}
		}
		if (!checkTrack) {
			tracks.add(track);
		}
	}
	
	public void removeTrack(Track track) {
		boolean checkTrack = false;
		for (int i = 0; i < tracks.size(); i++) {
			if (tracks.get(i).getTitle().equals(track.getTitle()) && tracks.get(i).getLength() == track.getLength()) {
				tracks.remove(i);
				checkTrack = true;
			}
		}
		if (checkTrack) {
			System.out.println("The input track existed in the list of tracks");
		}
	}

	public int getLength() {
		int lengthCD = 0;
		for (Track t : tracks) {
			lengthCD += t.getLength();
		}
		return lengthCD;
	}

	@Override
	public void play() {
		for (Track t : tracks) {
			t.play();
		}
	}
}
