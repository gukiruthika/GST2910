package GST;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		PrintPattern task = new PrintPattern();
		task.process();
	}

	private void process() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scan.nextLine();
		System.out.println("Enter number of rows");
		int row = scan.nextInt();
		printPattern(input, row);
		scan.close();
	}

	private void printPattern(String input, int row) {
		char[][] pattern = new char[row][input.length()];
		int index = 0, j = 0, i;
		while (index < input.length()) {
			for (i = 0; i < row & index < input.length(); i++) {
				pattern[i][j] = input.charAt(index++);
			}
			i--;
			j++;
			while (i > 1 & index < input.length()) {
				pattern[--i][j++] = input.charAt(index++);
			}
		}
		for (int rowIndex = 0; rowIndex < row; rowIndex++) {
			for (int columnIndex = 0; columnIndex < input.length(); columnIndex++) {
				System.out.print(pattern[rowIndex][columnIndex]);
			}
			System.out.println();
		}
	}
}
