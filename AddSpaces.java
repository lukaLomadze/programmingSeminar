
import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class AddSpaces extends ConsoleProgram{
public void run(){
	
	String a = "ilovecoding";
	String c = "";
	int[] b = {1,5};
	for(int i : b){

		for(int k = 0; k < a.length(); k++){
			if(i == k){
				c += " ";	
			}else{
			c+= a.substring(k-1,k);
			
			}
			
		}
		
	}
	
	println(c);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
