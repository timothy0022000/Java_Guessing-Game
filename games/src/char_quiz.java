public class char_quiz {

	public static void main(String[] agrs) {

		char[][] answers = { { 'A', 'A', 'C', 'D', 'B' },
				{ 'D', 'A', 'B', 'A', 'C' } };

		char[] key = { 'D', 'A', 'C', 'A', 'B' };

		for (int i = 0; i < answers.length; i++) {

			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (key[j] == answers[i][j])
					correctCount++;
				
				
			}
			System.out.println("Student" + i + " correct count is "
					+ correctCount);
		}

	}
}
