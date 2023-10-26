import acm.program.ConsoleProgram;

public class problem28 extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
 public void run(){
	 int numberOfOdds = 0;
	while(true){
		
		int odd = readInt("enter number :");
		
		if(odd == SENTINEL){
			break;
		}
		if(odd % 2 == 0 && odd >= 0){
			numberOfOdds++;
		}
		
		
		
	}
	 
	 println(numberOfOdds);
	 
 }
	
	
	
	
}
