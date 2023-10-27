import acm.program.ConsoleProgram;

public class fibo extends ConsoleProgram{
	public void run(){
		int n = readInt("enter number ");
		println(fib(n));
		
		
	}
	
	
	
	private int fib(int n){
		int a =1, b =1;
		if(n == 1){
			return a;
		}
		for (int i = 3; i <= n; i++){
			int c = a + b;
			a = b;
			b = c;
			
			
			
		}
		
		return b;
	}
}
