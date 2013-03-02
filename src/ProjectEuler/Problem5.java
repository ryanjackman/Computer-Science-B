package ProjectEuler;

public class Problem5 {
	public static void main(String[] args) {
		long i = 20;
		while (true) {
			int n = 0;
			for (int j = 11; j <= 20; j++) {
				if (i % j == 0)
					n++;
			}
			if (n == 10) {
				System.out.println(i);
				return;
			}
			i+=20;
		}
	}
}