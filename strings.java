import acm.program.ConsoleProgram;

public class strings extends ConsoleProgram {
	public void run() {
		String a = "mari";
		String b = "mari";
		String c = new String("mari");
		//String d = readLine("enter str4");
		
		String  e = readLine("write") ;
		char  f = readLine("write char");
		
		int n = 0;
		
		for(int i = 0; i < e.length(); i++){
			if(f == e.charAt(i)){
				n++;
			}
		}
		
		
		println("there are " + n + " " +f + " in " + e);
		
		
		
		
		
		
		
		
		
	}
}
