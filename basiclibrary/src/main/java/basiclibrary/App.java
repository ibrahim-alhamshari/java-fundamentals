 /*
  * This Groovy source file was generated by the Gradle 'init' task.
  */

 package basiclibrary;

 import java.util.Arrays;

 public class App {
     static String getGreeting() {
         return "Hello world.";
     }

     public static void main(String[] args) {
         System.out.println(getGreeting());
         System.out.println("");
         int n = 3;
         int[] newArray2 ={1,3,7};

         // Daily average temperatures for Seattle, October 1-28 2017
         int[][] weeklyMonthTemperatures = {
                 {66, 64, 58, 65, 71, 57, 60},
                 {57, 65, 65, 70, 72, 65, 51},
                 {55, 54, 60, 53, 59, 57, 61},
                 {65, 56, 55, 52, 55, 62, 57}
         };

         System.out.println("roll: "+Arrays.toString(roll(n)));
         System.out.println("true or false?  " + containsDuplicates(newArray2));
         System.out.println("average:  "+averages(newArray2));
         System.out.println("arrayOfArrays: " +Arrays.toString(arrayOfArrays(weeklyMonthTemperatures)));
     }

     // **************************************************

     public static int[] roll(int n) {
         int max = 6;
         int min = 1;
         int range = max - min + 1;
         int[] arrayOfNumbers = new int[n];

         for (int i = 0; i < n; i++) {
             int rand = (int) (Math.random() * range) + min;
             arrayOfNumbers[i] = rand;
         }
         return arrayOfNumbers;
     }

     public static boolean containsDuplicates(int[] arr) {

         for (int i = 0; i < arr.length; i++) {
             for (int x = i+1; x < arr.length; x++) {
                 if(arr[x] == arr[i]){
                     System.out.println(arr[x]);
                     return true;
                 }
             }

         }
         return false;
     }

     public  static  float averages(int[] arr){
         int total=0;
         for (int i=0;i< arr.length;i++){
             total = total+arr[i];
         }
         return (float) total/ arr.length;
     }

     public static int[] arrayOfArrays(int[][] arr){
         float[] total= new float[arr.length];
         for (int i=0 ;i< arr.length;i++){
             for (int x=0;x< arr[i].length;x++){
            total[i]=total[i]+arr[i][x];
             }
             total[i]=total[i]/arr[i].length;
         }
        int c=0;
         float k=total[0];

       for (int i=0;i< total.length;i++){
     if(k>total[i]){
         k=total[i];
      c = i;
     }
       }
         return arr[c];
     }
 }



