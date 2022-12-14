package GST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DescendingFrequency {

	public static void main(String[] args) {
		DescendingFrequency task = new DescendingFrequency();
		task.process();
	}

	private void process() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int length = scan.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the elements");
		for (int i = 0; i < length; i++)
			arr[i] = scan.nextInt();
		scan.close();
		getArranged(arr);

	}

	private void getArranged(int[] arr) {
		int temp;
		List<Integer> frequency = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i : arr) {
			if (numbers.contains(i)) {
				frequency.set(numbers.indexOf(i), frequency.get(numbers.indexOf(i)) + 1);
			} else {
				numbers.add(i);
				frequency.add(numbers.indexOf(i), 1);
			}
		}
		for (int i = 0; i < frequency.size(); i++) {
			for (int j = i + 1; j < frequency.size(); j++) {
				if (frequency.get(i) < frequency.get(j)) {
					temp = frequency.get(i);
					frequency.set(i, frequency.get(j));
					frequency.set(j, temp);
					temp = numbers.get(i);
					numbers.set(i, numbers.get(j));
					numbers.set(j, temp);
				}
			}
		}
		for (int i = 0; i < frequency.size(); i++) {
			for (int j = 0; j < frequency.get(i); j++) {
				System.out.print(numbers.get(i));
			}
		}

	}

}
