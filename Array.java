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
		
	for (int i = nums.size(); i > 0  ; i--) {
		print(nums.get(i - 1)  + " ");
	}
		
		
		
		
	}

	private void reset(ArrayList<Integer> nums) {
		for(int i =1; i<= nums.size(); i++){
			int a = nums.get(nums.size() - i);
			nums.remove(nums.indexOf(a));
			nums.set(i, a);
			
		}
		
	}
}
