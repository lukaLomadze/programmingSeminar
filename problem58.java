import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class problem58 extends ConsoleProgram {
	public void run(){
		int [][] arr = new int [5][5];
		int a = 1;
		for(int i = 0; i<arr.length ; i++){
			for(int k = arr[0].length; k>= 0; k--){
			arr[k][i]= a;
					a++;
				}
		
		}
		
		
		
		println(isMagic(arr));
		
		
		
		
	}

	private boolean isMagic(int[][] arr) {

		
		if(arr.length != arr[0].length) {
			return false;	
		}
		ArrayList<Integer> nums = new ArrayList<Integer>() ; 
		for(int i = 1; i<=25 ; i++){
			nums.add(i);
			
			
		}
		for(int i = 0; i<arr.length ; i++){
			for(int k = 0; k<arr[0].length ; k++){
				if(nums.contains(arr[i][k])){
					nums.remove((Integer)arr[i][k]);
					
				}
				
				
				
				
			}
			
			
		}
		
		if(nums.isEmpty()){
			return true;	
			
		}
	return false;	
	}

}
