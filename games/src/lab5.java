public class lab5 {

	public static void main(String[] agrs) {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6 - i; j++) {

				System.out.print(j + 1 + " ");
			}

			System.out.println();
		}

	}
}