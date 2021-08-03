package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Review{

     private int stars;
     private String body;
     private String author;
     private String movie;
     private Boolean flag=false;
     public Review( int stars, String body, String author , String movie){
          if(stars>5){
               this.stars=5;
          }else {
               this.stars=stars;
          }
          this.body = body;
          this.author = author;
          this.movie= movie;
          this.flag=true;
     }

     public Review( int stars, String body, String author) {
          if(stars>5){
               this.stars=5;
          }else {
               this.stars=stars;
          }
          this.body = body;
          this.author = author;
     }



     public int getStars(){ return stars; }

     public String getBody(){
          return body;
     }

     public String getAuthor(){
          return author;
     }


     @Override
     public String toString() {
          String results = "Review{" +
                  "stars=" + stars +
                  ", body='" + body + '\'' +
                  ", author='" + author + '\'' +
                  '}';
          if (flag){
             results= "Review{" +
                      "stars=" + stars +
                      ", body='" + body + '\'' +
                      ", author='" + author + '\'' +
                      ", movie='" + movie + '\'' +
                      '}';
             flag=false;
          }
          return results;
     }


}
