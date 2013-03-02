package ProjectEuler;

public class Problem6 {
	public static void main(String[] args) {
		long sumOfSquares = 0;
		for (int i = 1; i <= 100; i++) {
			sumOfSquares += (i * i);
		}
		long squareOfSum = 0;
		for (int i = 1; i <= 100; i++) {
			squareOfSum += i;
		}
		System.out.println(sumOfSquares);
		System.out.println(squareOfSum);
		System.out.println((squareOfSum * squareOfSum) - sumOfSquares);
	}
}
