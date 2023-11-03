import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, guess, tries = 0;

        number = (int) (Math.random() * 10) + 1;

        System.out.println("Guess my Number Game. ");
        System.out.println();

        do {
            System.out.println("Enter a guess between 1 and 10 : ");
            guess = sc.nextInt();
            tries++;

            if (guess > number) {
                System.out.println("To high! try Again ");
            } else if (guess < number) {
                System.out.println("To low! try Again ");
            } else {
                System.out.println("Correct! You got it in " + tries + " guesses!");
            }

        } while (guess != number);
    }
}