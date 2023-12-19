import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Hashmap extends ConsoleProgram {
	public void run() {
HashMap<String, Integer> names = new HashMap<String, Integer>();
		while(true){
			
			String a = readLine("@");
			
			if(a.equals("")) break;
			
			if(names.containsKey(a)){
				int b = names.get(a);
				names.put(a, b + 1);
				
			}else{
				names.put(a, 0);	
		}
		}
		
		for(String name : names.keySet()){
			println( name + "  :  " + names.get(name));
			
		}
		
		
	}
}
