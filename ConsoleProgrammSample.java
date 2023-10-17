/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	private static final int SENTINEL = 0; 
	public void run() {
		
//		int n = readInt("enter number : ");
//		for(int i =0; i<n; i++){
//			println("hello" + i);
			int k =0;
			
			
			int a = readInt("enter number : ");
			if(a != SENTINEL){
				k = a;
			}
				
				
				
			while(true){
				int b = readInt("enter number : ");
				
				if(a == SENTINEL) break ;
				if (a > k){
					k = a;
					
				}
			}
			println(k);
			
		}
		
		
		
	}


