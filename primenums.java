import acm.program.ConsoleProgram;

public class primenums extends ConsoleProgram{
	public void run(){
		
		int d = 0;
		for(int i = 2; i < 1000000; i++){
			if(isprime(i)){
				d++;
			}	
		}
		
		println(d);
		
		
		
		
	}
	private boolean isprime (int n){
		for(int i = 1; i * i  < n; i++){
			if(n % i == 0){
					return false;
			}
				
				
		}
	return true ;
		
		
	}
	
	
}
