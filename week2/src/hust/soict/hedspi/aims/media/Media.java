package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.media.Media;

public abstract class Media {
	protected static int count = 0;
	protected int id;
	protected String title;
	protected String category;
	protected float cost;

//	public Media() {
//		count++;
//		this.setId(count);
//	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Media.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public Media(int id , String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
}
