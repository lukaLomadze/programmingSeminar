import acm.program.ConsoleProgram;

public class cons extends ConsoleProgram {
public void run(){
	
	double a = readDouble("enter first number : ");
	double b = readDouble("enter second number : ");
	double c = readDouble("enter third number : ");
	println((a + b + c)/3);
	
	double d = (1 / a) + (1 / b) + (1 / c) ;
	System.out.print(1/a);
	//println( 1 / d );
}
}
