package ProjectEuler;

public class Problem7 {
	public static void main(String[] args){
		int total = 0;
		int i = 2;
		while(true){
			if(isPrime(i)){
				total++;
				if(total == 10001){
					System.out.println(i);
					return;
				}
			}
			i++;
		}
	}
	
	public static boolean isPrime(long num){
		for( long i = num/2; i > 1; i--){
			if(num%i == 0)
				return false;
		}
		return true;
	}
}