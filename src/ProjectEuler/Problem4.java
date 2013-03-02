package ProjectEuler;

public class Problem4 {
	public static void main(String[] args) {
		int largest = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				if (isPalindromic(i * j)) {
					if (i * j > largest)
						largest = i * j;
				}
			}
		}
		System.out.println(largest);
	}

	public static boolean isPalindromic(int i) {
		int len = (int) Math.ceil(Math.log10(i + 1));
		for (int n = 0; n < len / 2; n++)
			if ((i / (int) Math.pow(10, n)) % 10 != (i / (int) Math.pow(10, len	- n - 1)) % 10)
				return false;
		return true;
	}
}
