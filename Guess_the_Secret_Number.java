import java.util.Scanner;
import java.util.Random;

public class Guess_the_Secret_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("\nWelcome to the Number Guessing Game!");
        int x , guess , random, attempt;
        do {
            attempt=0;
            System.out.println("\nI have chosen a number between 1 and 100. Try to guess it!");
           random = rand.nextInt(100)+1;
            do{
                attempt++;
              System.out.print("\nEnter your guess : ");
              guess = scan.nextInt();
              if( guess <1 || guess>100){
                System.out.print("\nInvalid Choice ! ");
              }
             else if(random == guess){
                System.out.println("\nCorrect! You guessed it in " + attempt +" attempts.");
              }
              else if(random > guess){
                System.out.println("\nToo low! try again.");
              }
              else if(random < guess){
                System.out.println("\nToo high! try again.");
              }
            }while(random != guess);
           
            while(true){
                System.out.print("\nDo you want to play again? (yes/no): ");
                String Choice = scan.next();
                if (Choice.equalsIgnoreCase("yes")) {
                    x = 1;
                    break;
                } else if (Choice.equalsIgnoreCase("no")) {
                    x = 0;
                    break;
                } else {
                    System.out.println("\nInvalid Choice! Please enter (yes/no) ");
                }
            }
        } while (x != 0);

     end();
        scan.close();
    }

    static  void  end(){
     System.out.println("\n\nThanks a lot for Playing this game.\nMake by Amit Sharma\n\n");
    }
}