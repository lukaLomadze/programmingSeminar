

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem66 extends ConsoleProgram {
	public void run() {
		HashMap<String, ArrayList<String>> names2 = new HashMap<String, ArrayList<String>>();
		HashMap<String, ArrayList<String>> names = new HashMap<String, ArrayList<String>>();
		while (true) {

			String a = readLine("11");
			
			if (a.equals(""))break;
	
			StringTokenizer token = new StringTokenizer(a);
			String friend1 = token.nextToken();
			String friend2 = token.nextToken();
			names2.putIfAbsent(friend2, new ArrayList<String>() );
		if(!names2.get(friend2).contains(friend1)){
			names2.get(friend2).add(friend1);
		}
		
		names.putIfAbsent(friend1, new ArrayList<String>() );
		if(!names.get(friend1).contains(friend2)){
			names.get(friend1).add(friend2);
		}
		
		
		}
		
			
		
		
	for(String i : names.keySet()){
		for(String k : names2.keySet()){
			if(!names.get(i).contains(k) && !names2.get(k).contains(i)){
				println(i + "   " + k);
			}
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
//		String name = "";
//		int num = 0;
//		for(String i : names2.keySet()){
//			if(num< names2.get(i).size()){
//				num = names2.get(i).size();
//				name = i;
//			}
//		}
//		
//		println(name);
		
		
	}
	

}
