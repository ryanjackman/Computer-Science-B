package OtherStuff;

public class MaxSubvector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = { 1, 4, 3, -4, 8 };
		int max = 0;
		int i, j;
		 
		for( i = 0; i < array.length - 1; i++){
		        int sum = 0;
		        for ( j = i; j < array.length; j++ ) {
		                sum += array[j];
		                if( sum > max )
		                        max = sum;
		        }
		}
	
		System.out.println(max);

	}

}
