import acm.program.ConsoleProgram;

public class cons extends ConsoleProgram {
public void run(){
	
	int a = readInt("enter first number : ");
	int b = readInt("enter second number : ");
	int c = readInt("enter third number : ");
	println((a + b + c)/3);
	
	double d = (1 / a) + (1 / b) + (1 / c) ;
	
	println( 1 / d );
}
}
