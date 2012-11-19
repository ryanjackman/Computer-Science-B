package Chapter4;

public class KnapsackSum {

	public static void main(String[] args) {
		new KnapsackSum();
	}

	public KnapsackSum() {
		int[] array = { 1, 2, 3, 4, 6 };
		System.out.println(knapsackSum(array, 5, 5));
	}

	int knapsackSum(int w[], int n, int limit) {

		int temp = 0, j = 0, i;

		for (i = 0; i < n; i++)
			if (w[i] > temp) {
				temp = w[i];
				j = i;
			}

		if ((limit - temp) < 0)
			return 0;

		w[j] = 0;

		return knapsackSum(w, n, (limit - temp)) + temp;

	}
}
