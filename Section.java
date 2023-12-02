import acm.program.ConsoleProgram;

public class Section extends ConsoleProgram {

	public void run(){
		
		String t = "iyo arabets rostevan mefe";
		
		for (int i = 1 ; i < t.length(); i++){
			String a = t.substring(0, i);
			String b = t.substring(i);	
			println(a);
			println(b);
			
			
		}
		
		
		
		
		
		
	}
}
