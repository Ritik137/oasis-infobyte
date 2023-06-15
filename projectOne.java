import java.util.*;
public class projectOne{

    // Function which implement the number guessing game.

    public static void numberGuessingGame(){
        //Creating Scanner Class
        Scanner sc = new Scanner(System.in);

        // Here generate the numbers
        int number = 1 + (int)(100 * Math.random());

        //Here Given K trials
        int k = 7;
        int i;
        int guess;

        System.out.println("A number is choosen between 1 to 100. Guess the number within 7 trials.");

        //Here iterate over K trials
        for(i=0;i<k;i++){
            System.out.println("Guess the number: ");

            //Here take input from guessing
            guess = sc.nextInt();

            //If the number is guessed
            if(number == guess){
                System.out.println("Congratulation ! you guessed the number.");
                break;
            }
            else if (number > guess && i != k-1){
                System.out.println("The number is greater than "+ guess);
            }
            else if (number < guess && i != k-1){
                System.out.println("The number is less than "+ guess);
            }
        }
        if (i==k){
            System.out.println("You have exhusted 7 trials.");

            System.out.println("The number was "+ number);
        }

    }

    // Here is driver code
public static void main(String[] args) {
    
    //Here function is calling
    numberGuessingGame();
}
}