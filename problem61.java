import java.util.HashMap;

import acm.program.ConsoleProgram;

public class problem61 extends ConsoleProgram {
	public void run() {
int m = 10;
		HashMap<Integer,Integer> maxSum = new HashMap<Integer,Integer> ();
		
		
		
//		for(int i = 0; i< maxSum.size(); i++){
//			
//			maxSum.ge
//			
//			if()
//			
//		}
		int k = 0;
		
		while(true){
			int a = readInt("!!!");
			if(a == -1)break;
			maxSum.put(a, k);
			k++;
			boolean tf = false;
		int index = maxSum.getOrDefault(m- a, -1);
		if(index !=  -1){
			println(index + " and " + maxSum.get(a));
			tf = true;
			
		}
			if(!tf){
				println("not found");
			}
			
		}
		
		
		
		
		
		
		
	}


}
