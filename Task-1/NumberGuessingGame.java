// This is first task of CodSoft . The name of this project is Number Guessing Game using java.

import java.util.Scanner;  //Scanner class is used to take the user input.
import java.util.Random;   // Random class is used genrate the random number between 1 - 100.
public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxAttempts = 10; // user can attempt only 10 times in 1 round. 
        int score  = 0;
        int round = 0;
        while(true){
            System.out.println("Wellcome to the Number Guessing Game!");
            System.out.println("Guess the number between 1 to 100.");
            System.out.println("You have maximum "+maxAttempts+" attempts to guess it.");
            int numberToGuess = rand.nextInt(100)+1; // genrating random number between 1 - 100.
            int numberOfTries = 0;
            while(numberOfTries < maxAttempts){ 
                System.out.println("Enter your guess number : ");
                int guess = sc.nextInt();
                numberOfTries++;
                if(guess == numberToGuess){  
                    System.out.println("Congratulations! You guessed it in "+numberOfTries+" tries");
                    score += maxAttempts - numberOfTries; 
                    round++;
                    break;
                }
                else if(guess < numberToGuess){
                    System.out.println("Your guess is too low.");
                }
                else if(guess > numberToGuess){
                    System.out.println("Your guess is too high.");
                }
            }
            if(numberOfTries == maxAttempts){
                System.out.println("Sorry, you didn't guess it. The number was "+numberToGuess+"." );
            }
            System.out.println("Your current score is "+score+" out of " +(round * maxAttempts)+".");
            System.out.println("Do you want to play again ? (yes/no)");
            String palyAgain = sc.next();
            if(!palyAgain.equalsIgnoreCase("yes")){
                break;
            }
        }
        System.out.println("Thanks for playing! Your final score is "+score+" out of "+(round*maxAttempts)+".");
        sc.close();
    }
}
