package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.Media;

public class DigitalVideoDisc extends Media {
//    private static int nbDigitalVideoDisc = 0;
//    private int id;
//    private String title;
//
//    private String category;

    private String director;

    private int length;

//    private float cost;

//    public DigitalVideoDisc() {
//    	nbDigitalVideoDisc++;
//    	this.id = nbDigitalVideoDisc;
//    }
    
//    public DigitalVideoDisc(String title){
//    	this();
//        this.title = title;
//    }
//
    public DigitalVideoDisc(int id , String title, String category, float cost) {
        super(id , title , category , cost);
    }

    public DigitalVideoDisc(int id , String title, String category, String director, float cost) {
        super(id , title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(int id , String title, String category, String director, int length, float cost) {
        this(id , title, category, director, cost);
        this.length = length;
    }

//    public int getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public float getCost() {
//        return cost;
//    }
//
//    public String getCategory() {
//        return category;
//    }

    public String getDirector() {
        return director;
    }

    public String toString() {
        return this.id + ". DVD - "
                + this.title + " - "
                + this.category + " - "
                + this.director + " - "
                + this.length + ": "
                + this.cost + " $";
    }

    public boolean isMatch(String title) {
        return this.title.equals(title);
    }

    @Override
    public boolean equals(Object obj){
        DigitalVideoDisc disc = (DigitalVideoDisc)obj;
        return this.title.equals(disc.title) && this.category.equals(disc.category)
                && this.director.equals(disc.director) && this.length == disc.length
                && this.cost == disc.cost;
    }
}
