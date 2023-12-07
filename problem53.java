import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class problem53 extends ConsoleProgram {
	public void run() {
		int n = readInt("enter number :");
		sortNumbers(n);

	}

	private void sortNumbers(int n) {
		ArrayList<Integer> nums = new ArrayList<Integer>();

//		for (int i = 0; i < n; i++) {
//			int a = readInt("??");
//			nums.add(a);
//
//		}
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		nums.add(15);
		
		
		for (int i = 0; i < 5; i++) {
		int a = findMin(nums , i);
nums.remove(a);
nums.add(a);
		
		
		
		}

	}

	private int findMin(ArrayList<Integer> nums, int i2) {
		int min = nums.get(0);
		for (int i = 1; i < nums.size() -i2 ; i++) {
			if(min <  nums.get(i)){
				min = nums.get(i);
			}
		}
		return min;
	}
}
