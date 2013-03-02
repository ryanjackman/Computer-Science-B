package ProjectEuler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) {
		
		FileInputStream fis;
		Scanner scanner = null;
		try {
			fis = new FileInputStream("src/ProjectEuler/Data/Problem13data.txt");
			scanner = new Scanner(fis, "UTF-8");
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		
		BigInteger total = BigInteger.ZERO;
		for(int i = 0; i < 100; i++){
			total = total.add( new BigInteger(scanner.nextLine()) );
		}
		
		System.out.println(total);
		
	}
}
