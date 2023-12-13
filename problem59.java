import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class problem59 extends ConsoleProgram{
	public void run(){
		//n*m
		int n = 5;
		int m = 6;
		//int[][]arr = {{}};
		ArrayList<Integer> row = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> matr = new ArrayList<ArrayList<Integer>>();
		for(int i = 0 ; i<n; i++){
			for(int i1 = n-1 ; i1<i; i1++){
				for(int i2 = 0 ; i2<m; i2++){
					
					for(int i3 = m-1 ; i3<i2; i3++){
						
						createMatrix(i,i1,i2,i3, matr);
						
						
						
						
						
						
					}	
				}	
				
			}	
	
		}
		
		
		
	}

	private void createMatrix(int i, int i1, int i2, int i3, ArrayList<ArrayList<Integer>> matr) {
		int[][] check = new int[i1-i][i3-i];
		
	}
}
