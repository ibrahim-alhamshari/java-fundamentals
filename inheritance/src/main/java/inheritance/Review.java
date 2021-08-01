package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Review{

     private int stars;
     private String body;
     private String author;

     public Review( int stars, String body, String author) {
          if(stars>5){
               this.stars=5;
          }else {
               this.stars=stars;
          }
          this.body = body;
          this.author = author;
     }

     public Review(List<Review> listOfReview) {
          for (Review review : listOfReview) {
               this.body = review.body;
               this.author=review.author;
               if(review.stars>5){
                    this.stars=5;
               }else {
               this.stars=review.stars;
               }
          }
     }

     public int getStars(){
          return stars;
     }

     public String getBody(){
          return body;
     }

     public String getAuthor(){
          return author;
     }


     @Override
     public String toString() {
          return "Review{" +
                  "stars=" + stars +
                  ", body='" + body + '\'' +
                  ", author='" + author + '\'' +
                  '}';
     }
}
