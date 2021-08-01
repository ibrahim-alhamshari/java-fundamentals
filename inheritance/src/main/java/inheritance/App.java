package inheritance;

import java.util.ArrayList;
import java.util.List;

import static inheritance.Restaurant.*;

public class App {

    public static void main(String[] args) {

        Restaurant restaurant =new Restaurant("Mcdonalds",1000, 50);

        Review R1= new Review(20,"Beautiful restaurant" , "Bashar Ahmad");
        Review R2 = new Review(2, "Very expensive", "Mohammad Salah");

        List<Review> listOfReview = new ArrayList<Review>();
        listOfReview.add(R1);
        listOfReview.add(R2);

//        Restaurant restaurant1 = new Restaurant((ArrayList<Review>) listOfReview);

        restaurant.addReview(R1);
        restaurant.addReview(R2);
        System.out.println(restaurant.toString());
//        System.out.println(listOfReview);

    }

}
