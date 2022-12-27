package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	public MediaComparatorByCostTitle() {

	}

	@Override
	public int compare(Media o1, Media o2) {
		if ((int)(o1.getCost() - o2.getCost()) != 0) {
			return (int)(o1.getCost() - o2.getCost());
		}
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
