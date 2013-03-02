package Chapter4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CookieMonster {

	private int[][] board;

	public static void main(String[] args) {
		new CookieMonster();
	}

	public CookieMonster() {
		board = new int[12][12];
		loadArray("cookies.txt", board);
		printArray(board);
	}

	private void loadArray(String fileName, int[][] array) {
		int i = 0, j = 0;

		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file " + fileName);
		}
		Scanner scanner = new Scanner(inputStream);

		while (scanner.hasNextInt()) {
			array[i][j % array[0].length] = scanner.nextInt();

			j++;
			if (j % array[0].length == 0)
				i++;
		}
		scanner.close();
	}

	public void printArray(int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == -1)
					System.out.print(" " + board[i][j]);
				else
					System.out.print("  " + board[i][j]);

			}
			System.out.println();
		}
		System.out.println();
	}

}
