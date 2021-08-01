/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.ArrayList;

public class Restaurant {

    private String name;
    private String price;
    private float stars;
    private float starsRating= 0;
    private int i =0;
    ArrayList<Review> reviewLists = new ArrayList<>();

    public void addReview(Review review){
        this.reviewLists.add(review);
        System.out.println("bbbbbbbbbbb: "+reviewLists.size());
           i++;
          starsRating=starsRating+ review.getStars();
            System.out.println("starsRating: "+starsRating);

        System.out.println("rating: " + (float)(starsRating/i));
        this.stars= (float)(starsRating/i);
    }


    Restaurant(ArrayList<Review> reviewLists){
       this.reviewLists=reviewLists;
    }

    public ArrayList<Review> getReviewLists() {
//        System.out.println(reviewLists);
        return reviewLists;
    }

    public Restaurant(String name, int stars, int price) {
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
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", stars=" + stars +
                ", reviewLists=" + reviewLists +
                '}';
    }
}