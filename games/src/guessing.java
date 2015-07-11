import java.util.*;//import * library 

public class guessing {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {

		System.out.println(" LETS PLAY A GUESSING GAME ! ");
		do {

			playAgain();

		} while (askForAnotherRound());

		System.exit(0);// exit program
	}

	// Generate a random number between 1 and 10
	public static int getRandomNumber() {

		int num = (int) (Math.random() * 10) + 1;
		return num;
	}

	// game of guess
	public static void playAgain() {

		int num;
		int guess;
		String answer;
		boolean validInput;
		
		//try catch block 
		try {
			num = getRandomNumber();// invoke random method
			// prompt user
			System.out.print(" Enter a number between 1 and 10 ? ");
			guess = getGuess();
			// guess right good comment
			if (guess == num) {
				printGoodComment();
				System.out.println("The anwser is " + num);
			}

			// guess wrong bad comment
			else
				printBadComment();
			System.out.println(" The answer is " + num);

		} catch (InputMismatchException e) {

			input.next();
			System.out.println("Error, input must be a integer. Try agian :");
		}
	}

	// Handling 1 - 10
	public static int getGuess() {

		while (true) {

			int guess = input.nextInt();
			if ((guess < 1) || (guess > 10)) {

				System.out.println(" ERORR!!!: INNVAILD INPUT!!! ");
				System.out.println(" I said between 1 and 10 !!!");

			} else

				return guess;
		}
	}

	public static void printGoodComment() {

		// correct output to user
		int good = (int) (Math.random() * 4);// good generator

		// good out put options
		switch (good) {

		case 0:
			System.out.println(" NICE JOB !!!!! ");
			break;

		case 1:
			System.out.println(" EXCELLENT !!!! ");
			break;

		case 2:
			System.out.println(" TERRIFIC !!!! ");
			break;

		case 3:
			System.out.println(" NICE WORK !!!! ");
			break;
		}

	}

	public static void printBadComment() {

		// bad output to user
		int bad = (int) (Math.random() * 3);// bad generator

		// bad out put options
		switch (bad) {

		case 0:
			System.out.println(" SORRY, TRY NEXT TIME !!! ");
			break;

		case 1:
			System.out.println(" OOPS, YOU NEED MORE WORK !!! ");
			break;

		case 2:
			System.out.println(" HMM, IT IS NOT CORRECT !!! ");
			break;

		}

	}

	// repeat game
	public static boolean askForAnotherRound() {

		while (true) {

			String answer = "";
			System.out.println("\n Play again ? " + " Yes or No ");
			answer = input.next();

			if (answer.equalsIgnoreCase("yes")) {
				return true;
			} else if (answer.equalsIgnoreCase("no")) {
				return false;
			}

		}
	}

}
