package ProjectEuler;

public class Problem10 {
	public static void main(String[] args) { 
		long beforeTime = System.currentTimeMillis();
        int n = 2000000;

        boolean[] numbers = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            numbers[i] = true;
        }

        for (int i = 2; i*i <= n; i++) {
            if (numbers[i]) {
                for (int j = i; i*j <= n; j++) {
                    numbers[i*j] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if (numbers[i]) {
            	sum+=i;
            	//System.out.println(i);
            }
        }
        System.out.println("The sum of primes <= " + n + " is " + sum);
        
        System.out.println("This calculation took " + (System.currentTimeMillis() - beforeTime) + " milliseconds.");
    }
}
