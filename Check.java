import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Check extends ConsoleProgram{

	public void run(){
		int[] dices = {4,2,1,1,1};
		
		
		HashMap<Integer, Integer> diceValues = new HashMap<Integer, Integer>();
		for (int i = 0; i < dices.length; i++) {
			diceValues.putIfAbsent(dices[i], 0);
			int value = diceValues.get(dices[i]);
			diceValues.put(dices[i], value+1);
		}
		Collection<Integer> values = diceValues.values();
		System.out.print(values);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[][] grid = new int[7][7];
//		HashMap<Integer,Integer> is  = new HashMap<Integer,Integer>();
//		int a = 2;
//		for (int i = 0; i< grid.length; i++){
//			for (int j = 0; j< grid.length; j++){
//				if(grid[i][j] == 1){
//					int l = grid[i][j];
//					int u = grid[i][j];		
//					
//					
//					
//					
//					
//				}
//				
//				
//			}
			
			
		//}
		
		
		
	}
	
	
}
