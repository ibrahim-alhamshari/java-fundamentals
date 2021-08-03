package inheritance;

import java.util.ArrayList;

public class Shop{

    private String name;
    private String price;
    private float stars;
    ArrayList<Review> reviews = new ArrayList<>();
    private float starsRating= 0;
    private int i =0;

    public Shop(String name, int stars, int price) {
        this.name=name;

        if(stars>5){
            this.stars=5;
        }else {
            this.stars=stars;
        }

        if (price>1 && price<=10){
            this.price="$";
        }else if(price>10 && price<=20){
            this.price="$$";
        }else if(price>20 && price<=30){
            this.price="$$$";
        }else {
            this.price="$$$$";
        }
    }

   public void addReview(Review review){
        this.reviews.add(review);
        i++;
        starsRating=starsRating+ review.getStars();
        this.stars= (starsRating/i);
    }

   public float getStars(){ // for the test
        return stars;
    }
    public String getPrice(){ // for the test
        return price;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", stars=" + stars +
                ", reviews=" + reviews +
                '}';
    }

}
