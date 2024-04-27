import java.util.Scanner;
import java.util.Random;
class Game
{
     public void playGame(Random random) {
  Scanner sc=new Scanner(System.in);
//random.nextInt(100) + 1 generates a random number between 1 and 100 
        int number = random.nextInt(100) + 1;
        int attempts = 0;
        final int maxAttempts = 5;

        while (attempts < maxAttempts) {
            System.out.print("Guess the number between 1 and 100: ");
            try {
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Congratulations! You've guessed the number " + number + " correctly in " + attempts + " attempts.");
                    break;
                } else if (guess < number) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                sc.next(); // Clear the input buffer
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + number + ".");
        }

        System.out.print("Do you want to play again? (yes/no): ");
        String playAgain = sc.next().toLowerCase();
        if (playAgain.equals("yes")) {
            playGame(random);
        } else {
            System.out.println("Thanks for playing!");
        }
}
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g=new Game();
        Random random = new Random();
        g.playGame(random);
        
    }
}
