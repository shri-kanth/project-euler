public class PE031 {

	private static int[] coinValue = { 200, 100, 50, 20, 10, 5, 2 };
	private static int[] coinAmount = { 0, 0, 0, 0, 0, 0, 0 };

	public static void main(String args[]) {

		int coinTotal = 200;
		int selectedCoin = 6;
		int solutions = 1;

		while (coinAmount[0] != 1) {

			coinAmount[selectedCoin]++;

			while (getTotal() > coinTotal) {

				coinAmount[selectedCoin] = 0;
				coinAmount[--selectedCoin]++;

			}

			solutions++;
			selectedCoin = 6;

		}

		System.out.println("Answer: " + solutions);

	}

	private static int getTotal() {

		int total = 0;

		for (int i = 0; i < coinAmount.length; i++)
			total += coinValue[i] * coinAmount[i];

		return total;

	}

}
