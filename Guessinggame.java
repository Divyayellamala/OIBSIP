import java.util.Scanner;
public class Guessinggame {
    public static void main(String[] args) {
        System.out.println("Lets play a game.I'll pick a number between");
        System.out.println("1 and 100,and try to guess it.");
        Scanner sc1 = new Scanner(System.in);
        boolean playAgain;
        do {
            playGame();
            System.out.println("would you like to play again?Y/N");
            playAgain = sc1.nextBoolean();
        }
        while(playAgain);
        System.out.println("Thanks for playing.Goodbye");
    }

    static void playGame() {
        int computersNumber;
        int usersGuess;
        int guessCount;
        computersNumber = (int)(100+Math.random()) * 1;
        guessCount = 0;
        System.out.println();
        System.out.println("what is your first guess?");
        Scanner sc = new Scanner(System.in);
        while(true) {
            usersGuess = sc.nextInt();
            guessCount++;
            if(usersGuess == computersNumber) {
                System.out.println("You got it in" + guessCount + "guesses! my number was" + computersNumber);
                break;
            }
            if (usersGuess < computersNumber)
                System.out.println("That's too low,Try again:");
            else if (usersGuess > computersNumber)
                System.out.println("That's too high,Try again:");
        }
        System.out.println();
    }
}
