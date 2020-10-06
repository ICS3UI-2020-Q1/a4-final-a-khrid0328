import java.util.Scanner;
/**
 * The program will print out all of the factors of the number the user inputs
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Create a scanner for user inputs
    Scanner input = new Scanner(System.in);

    // ask the user to input a positive integer to determine its factora
    System.out.println("Please enter a positive integer to determine its factors:");

    // creatr a variable for user input
    int integer = input.nextInt();

    //  determine wether the user input a positive or negative intiger 
    if (integer > 0){

      // print the factors to the screen
      System.out.println("The factors of " + integer + " are:");

    } else if( integer <= 0){
      // tell the user to put a positive integer again
      System.out.println("Please enter a positive integer to determine its factors:");

      // define the user's input again so the program could run properly
      integer = input.nextInt();
    }
    
    // create a variable to keep track of what number we are on
    int count = 1;

    // creating a loop to determine the factors of the number chosen by user
    while (count <= integer){

      // find the quotient of the integer when dividing by the count number
      if(integer % count == 0){
        
        // print the count number to the screnn
        System.out.println(count);
       
      }
      // add 1 to count to increase it
      count = count + 1;
    }
  }
}
