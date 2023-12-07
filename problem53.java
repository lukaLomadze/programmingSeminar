import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class problem53 extends ConsoleProgram {
	public void run() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		// int n = readInt("enter number :");
		sortNumbers(nums);
		for (int i = 0; i < nums.size() ; i++) {
			println(nums.get(i));
		}
	}

	private void sortNumbers(ArrayList<Integer> nums) {
		

		
		nums.add(2);
		nums.add(1);
		nums.add(3);
		nums.add(4);
		nums.add(15);

		for (int i = 0; i < nums.size(); i++) {
			int a = findMin(nums, i);
			nums.remove(nums.indexOf(a));
			nums.add(a);

		}

	}

	private int findMin(ArrayList<Integer> nums, int i2) {
		int min = nums.get(0);
		for (int i = 1; i < nums.size() - i2; i++) {
			if (min < nums.get(i)) {
				min = nums.get(i);
			}
		}
		return min;
	}
}
