import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Zero extends ConsoleProgram{
	public void run(){
	int[][] nums = {{1, 0, 3, 4},
	                {5, 6, 7, 8},
	                {9, 0, 1, 2}};
	String oo ="";
	
	int[][] nums2 = {{0, 0, 0, 0},
                     {5, 0, 7, 8},
                     {0, 0, 0, 0}};
	for(int i = 0; i < nums.length; i++){
		for(int k = 0; k < nums[0].length; k++){
		
			if(nums[i][k]==0){
				oo+= ""+ nums[0].length * i + k +" ";
			}
			
			
		}	
		
		
	}
	
	
	
	StringTokenizer tok = new StringTokenizer(oo);
	
	while(tok.hasMoreTokens()){
		StringTokenizer token = new StringTokenizer(tok.nextToken());
		int a = Integer.parseInt(token.nextToken()) / nums[0].length;
		int b = Integer.parseInt(token.nextToken()) % nums[0].length;
		
		zeroMatrix(a,b,nums);
		
		
		
		
	}
	
	
	
	
	println(nums == nums2);
	
	}

	private void zeroMatrix(int a, int b, int[][] nums) {
	for(int i = 0; i< nums[0].length; i++){
	nums[a][i]=0;
	}
		
	for(int i = 0; i< nums.length; i++){
		nums[i][b]=0;
		}
	
	
	
	}
}
