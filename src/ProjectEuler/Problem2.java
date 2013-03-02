package ProjectEuler;

public class Problem2 {
	public static void main(String[] args) {
		long[] f = new long[34];
		long total = 0;
		f[1] = f[2] = 1;
		for (int i = 3; i <= 33; i++) {
			f[i] = f[i - 1] + f[i - 2];
			if (f[i] % 2 == 0)
				total += f[i];
		}
		System.out.println(total);
	}
}