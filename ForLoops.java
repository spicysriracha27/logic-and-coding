//Java class ForLoops.java

/**
 * Skeleton code for the for loops practice day.
 * 
 * @author Roy Chancellor
 * @version 2/26/2019
 */
public class ForLoops
{
public static void main (String args [] ) {
    //variable declarations
    int i, cube;
    System.out.println();
    System.out.println("i\tcube i");
    cube = 1;
    
    for(i=1; i<= 10; i= i+1) {
        cube= i * i * i;
        System.out.println(i + "\t" + cube + "\t");
    }
    //for loop to perform task
    for(i=99; i>=1; i= i-2) {
        cube= i * i * i;
        System.out.println(i + "\t" + cube + "\t");
    }
  String a= "The quick brown fox jumped over the lazy dog";
  int n;
  for (n=0;n<a.length();n++){
      System.out.println(a.charAt(n));
    }
  
 //end mail
//end ForLoops class
 }
}