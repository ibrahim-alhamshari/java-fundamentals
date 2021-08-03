package inheritance;

import java.util.ArrayList;
import java.util.List;

import static inheritance.Restaurant.*;

public class App {

    public static void main(String[] args) {

        Restaurant restaurant =new Restaurant("Mcdonalds",1000, 50);
        Review R1= new Review(20,"Beautiful restaurant" , "Bashar Ahmad");
        Review R2 = new Review(2, "Very expensive", "Mohammad Salah");

        restaurant.addReview(R1);
        restaurant.addReview(R2);
        System.out.println(restaurant.toString());

//#######################################################################################################

        Shop shop = new Shop("AmmanMarket" , 6,20);
        shop.addReview(R1);
        shop.addReview(R2);
        System.out.println(shop.toString());

//#######################################################################################################

        Theater theater =new Theater();

        theater.addMovie("AMERICA");
        theater.addMovie("ITALIA");
        theater.addMovie("RUSIA");
        theater.removeMovie(2);

        theater.TheaterWithMovie(6,"Very amazing" , "Yimou Zhang" ,"The Great Wall");
        theater.TheaterOnly(1,"good theater" , "NoorEdden" );
        System.out.println(theater.toString());
    }
        }
