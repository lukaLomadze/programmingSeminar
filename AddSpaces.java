
import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class AddSpaces extends ConsoleProgram{
public void run(){
	
	String a = "ilovecoding";
	String c = "";
	int[] b = {1,5};
	for(int i : b){

		for(int k = 0; k < a.length() +i; k++){
			if(i == k){
				String l =  a.substring(k, k+1) + " " + a.substring(k+1);
				a=k;
			}
			
		}
		
	}
	
	println(c);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
