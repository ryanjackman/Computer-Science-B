package ProjectEuler;

public class Problem3 {
	public static void main(String[] args){
		long num = 600851475143L;
		for(int i = 2; i < num/2; i++){
			if(num%i == 0)
				if(isPrime(i))
					System.out.println(i);
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