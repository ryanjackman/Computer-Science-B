package Chapter4;

public class KnapsackSum {

	public static void main(String[] args) {
		new KnapsackSum();
	}

	public KnapsackSum() {
		int[] array = { 1, 2, 2, 4, 4, 3, 3};
		System.out.println(knapsackSum(array, array.length, 10));
	}

	int knapsackSum(int w[], int n, int limit) {

		int temp = 0, j = 0, i;

		for (i = 0; i < n; i++) {

			if (w[i] > temp) {
				temp = w[i];
				j = i;
			}
			if (w[i] > limit)
				w[i] = 0;
		}
		if ((limit - temp) < 0)
			return 0;

		w[j] = 0;

		return knapsackSum(w, n, (limit - temp)) + temp;

	}
}































//Credit Clayton Smith
