import acm.program.ConsoleProgram;

public class strings extends ConsoleProgram {
	public void run() {
//		String a = "mari";
//		String b = "mari";
//		String c = new String("mari");
		//String d = readLine("enter str4");
		
		
		String  e = readLine("write text : ") ;
		//String  f = readLine("write char : ");
		//char fChar= f.charAt(0);
		
		int count = 0;
		char ans ;
		for(int i = 0; i < e.length(); i++){
			
			if(count < countChars(e.charAt(i) , e)){
				count = countChars(e.charAt(i) , e);
				ans = e.charAt(i);
			}
			
			
		}
		println(count);
		
		
		
		
		
		
		
//	
//		
		
		
		
		
		
		
		
		
	}

	private int countChars(char fChar , String e) {
			int n = 0;
		
		for(int i = 0; i < e.length(); i++){
			if(fChar == e.charAt(i)){
				n++;
			}
		}
		return n;
		
	}
}
