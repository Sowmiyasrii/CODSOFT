import java.util.Scanner;
public class NumberGame {
 public static void guessingnumber()
 {
  Scanner scanner = new Scanner(System.in);
  int n = 1 + (int)(100 * Math.random());
  int a = 5;
  int x, pick;

  System.out.println( "A number to be found is chosen between 1 to 100. You have only 5  picks to play!");

  for (x = 0; x < a; x++) {
  System.out.println("pick the number:");
  pick =  scanner.nextInt();
  if (n== pick) {
   System.out.println( "Congratulations! You have choosed  the correct number.");
   break;
  }

   else if (n > pick ) {
        System.out.println("The number is greater than " + pick);
    }
    else if (n < pick) {
        System.out.println("The number is less than " + pick);
    }
 }
 if (x == a) {
  System.out.println("You have played more than a  given trials.");
  System.out.println("The number was " + n);
 }
}
 public static void main(String arg[])
 {
  guessingnumber();
 }
}