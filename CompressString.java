import java.util.HashMap;

import acm.program.ConsoleProgram;

public class CompressString extends ConsoleProgram{
public void run(){
	HashMap<Character, Integer> a = new HashMap<>();
	String s = "aabbbcdfff";
	
	for(int i =0; i< s.length();i++){
		a.put(s.charAt(i), a.getOrDefault(s.charAt(i),0) + 1);
		
	}
	String ret = "";
	for(char t : a.keySet()){
		ret+= "" +t + a.get(t);
		
		
	}
	if(s.length() >= ret.length()){
		println(s);
	}else{
	println(ret);
	}
}
}
