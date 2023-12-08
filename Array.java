import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Array extends ConsoleProgram {
	public void run() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
while(true){
	int n = readInt("@");
	if(n == -1){
		break;
	}
	nums.add(n);
}
	reset(nums);	
		
		
		
		
		
		
	}

	private void reset(ArrayList<Integer> nums) {
		for(int i =0; i< nums.size(); i++){
			int a = nums.get(nums.size() - i);
			//nums.remove(nums.indexOf(a));
			nums.set(i, a);
			
		}
		
	}
}
