import java.util.Scanner;

public class math_quiz {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {

		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = " ";

		while (count < NUMBER_OF_QUESTIONS) {

			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);

			System.out.println("What is " + num1 + "*" + num2 + "?");
			int answer = input.nextInt();

			if (num1 * num2 == answer) {
				System.out.println("Correct!!!");
				correctCount++;

			} else
				System.out.println("Wrong!!!" + "\n " + num1 + "*" + num2 + "="
						+ num1 * num2);

			count++;

			output += "\n" + num1 + "*" + num2 + "=" + answer
					+ ((num1 * num2 == answer) ? "Correct" : "Wrong");

		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println(" Correct count is " + correctCount
				+ "\n Test time is " + testTime / 1000 + "seconds\n" + output);
	}
}
