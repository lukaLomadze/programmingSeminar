import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Check extends ConsoleProgram{

	public void run(){
		
		int[] nums = {1,1,3,3,3};
		Arrays.sort(nums);
		int n = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] == 0) {
				n++;
			}
		}
		
		println(n);
		
		
		
		
		
		
		
	}
	
	
}
