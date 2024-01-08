
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem65 extends ConsoleProgram {
	public void run() {
		HashMap<String, ArrayList<String>> names2 = new HashMap<String, ArrayList<String>>();
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
		}
		
		
		
		
		String name = "";
		int num = 0;
		for(String i : names2.keySet()){
			if(num< names2.get(i).size()){
				num = names2.get(i).size();
				name = i;
			}
		}
		
		println(name);
		
		

	}
}
