package inheritance;

import java.util.ArrayList;

public class Theater extends ParentOfTheater {

    private String name = "Theater"; 
    private float starsRating= 0;
    private int stars;
    private String body;
    private String author;
    private String movie;

    private ArrayList<String> listOfMovies = new ArrayList<String>();
    ArrayList<Review> reviews =new ArrayList<Review>();
    private int i =0;


    public ArrayList<String> addMovie(String movie){
        this.listOfMovies.add(movie);
        return listOfMovies;
    }

    public ArrayList<String> removeMovie(int movie){
        this.listOfMovies.remove(movie);
        return listOfMovies;
    }

    public void changeTheRating(int stars){
        i++;
        starsRating=starsRating+ stars;
        this.starsRating= (starsRating/i);
    }

    @Override
    public String TheaterOnly(int stars, String body, String author){
        if(stars>5){
            this.stars=5;
        }else {
            this.stars=stars;
        }
        this.body = body;
        this.author = author;
        Review list = new Review(stars,body ,author);
        changeTheRating(stars);
        reviews.add(list);

        String results= "Review[stars: " + stars+ ", body: " + body+ ", author: "+ author+ "]";
        return results;
    }

    @Override
    public String TheaterWithMovie(int stars, String body, String author , String movie) {
        if(stars>5){
            this.stars=5;
        }else {
            this.stars=stars;
        }
        this.body = body;
        this.author = author;
        this.movie = movie;
        Review newLiast = new Review(stars,body ,author , movie);
        changeTheRating(stars);
        reviews.add(newLiast);

        String results= "Review[stars: " + stars+ ", body: " + body+ ", author: "+ author+", movie: "+movie +"]";
        return results;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", starsRating=" + starsRating +
                ", listOfMovies=" + listOfMovies +
                ", reviews=" + reviews +
                '}';
    }

}
