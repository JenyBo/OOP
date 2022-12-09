package hust.soict.hedspi.test.store;
// import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args){
        Store StoreDemo = new Store();
        Media dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Media dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
        Media dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        Media dvd4 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        StoreDemo.addMedia(dvd1, dvd2, dvd3);
    }
}