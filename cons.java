import acm.program.ConsoleProgram;

public class cons extends ConsoleProgram {
	
	
	public void run(){
		
		int a = readInt("enter first number : ");
		int b = readInt("enter second number : ");
		int c = readInt("enter third number : ");
		
		
		double d = (1 /(double) a) + (1 / (double) b) + (1 / (double)c) ;
		
		println( 1 / d );
		
		println((a + b + c)/3.0);
		
		
		
		
		
	}
}
