import acm.program.ConsoleProgram;

public class problem20  extends ConsoleProgram{
	public void run(){

		int a = readInt("enter number : ");
		int c = 0;
		
		for(int i= 0 ; i < a; i++){
			
			int b = readInt(i +") enter number : ");
			c += b;
			
		}
		
		println("sum is " + c);
		
		
		
		
}
	
}
