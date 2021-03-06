/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyFirstProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

        public static void main(String[] args) {
            int dogCount = 1;
            System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

            int catCount = 2;
            System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

            int turtleCount = 0;
            System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

            flipNHeads (2);
            clock();
        }
        //***********************************************
        public static String pluralize(String animal,int turtleCount){
            if(turtleCount==0 || turtleCount>1){
                return animal+"s";
            }
            return animal;
        }

        //******************************************************
        public static void flipNHeads(int n){

            int x =0;
            int numberOfAttempts=0;
            while(x!=n){
                numberOfAttempts= numberOfAttempts+1;
                double randomNum = Math.random();
                if( randomNum >= 0.5 ) {
                    System.out.println("Heads");
                    x=x+1;
                    if(x==n){
                        System.out.println("It took "+ numberOfAttempts+" flips to flip "+n +" head in a row.");
                    }
                }else{
                    System.out.println("tails");
                    x= 0 ;
                }
            }
        }
        //**************************************************************
        public static void clock(){
            int currentSecond = 0;
            while(true) {
                LocalDateTime now = LocalDateTime.now();
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                int second = now.getSecond();

                if(currentSecond!=second){
                    System.out.println(time);
                }
                currentSecond=second;
            }
        }

    }



