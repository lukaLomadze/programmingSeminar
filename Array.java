import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Array extends ConsoleProgram {
	public void run() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while (true) {
			int n = readInt("@");
			if (n == -1) {
				break;
			}
			nums.add(0, n);
		}
		
//removeOnes(nums);
		println(nums);

	}

	private void removeOnes(ArrayList<Integer> nums) {
		while(nums.contains(1)){
			nums.remove((Integer)1);
	
		}
		
	}


}
