package ProjectEuler;

import java.math.BigInteger;

public class Problem20 {
	public static void main(String[] args) {
		BigInteger num = BigInteger.ONE;
		
		for(int i = 1; i <= 100; i++){
			num = num.multiply(new BigInteger(Integer.toString(i)));
		}
		
		String n = num.toString();
		int total = 0;
		for( char c : n.toCharArray()){
			total += Character.getNumericValue(c);
		}
		System.out.println(total);
	}
}
