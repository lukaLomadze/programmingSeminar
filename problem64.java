
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem64 extends ConsoleProgram {
	public void run() {
		HashMap<String, ArrayList<String>> names = new HashMap<String, ArrayList<String>>();
		while (true) {

			String a = readLine("11");
			
			if (a.equals(""))break;
	
			StringTokenizer token = new StringTokenizer(a);
			String friend1 = token.nextToken();
			String friend2 = token.nextToken();
			names.putIfAbsent(friend1, new ArrayList<String>() );
		if(!names.get(friend1).contains(friend2)){
			names.get(friend1).add(friend2);
		}
			
		}
		
		
		
		
		
		
		
		
		for(String i : names.keySet()){
		println( i + " : " + names.get(i).toString());
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		String name = "";
//		int num = 0;
//		
//		
//		println(name);
		
		

	}
}

