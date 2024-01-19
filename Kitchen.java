import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Kitchen extends ConsoleProgram{
public void run(){
	HashMap <String, ArrayList<String>> dishes = new HashMap<>();
	ArrayList<String> ingr = new ArrayList<>();
	
	ArrayList<String> kerz = new ArrayList<>();
	
	for(String i : dishes.keySet()){
		
		if(cannBeCooked(dishes.get(i) , ingr))kerz.add(i); 	
	}

}

private boolean cannBeCooked(ArrayList<String> arrayList, ArrayList<String> ingr) {
		for(String j : arrayList){
				if(!ingr.contains(j)) return false;
		}
		return true;
}
}
