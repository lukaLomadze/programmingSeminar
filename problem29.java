import acm.program.ConsoleProgram;

public class problem29 extends ConsoleProgram{
	
	
 public void run(){
	
	 int f = 12456;
	 println(sum(f));
	 
 }
 
	 private int sum (int f){
		 int sum = 0;
		 
		 while(f>0){
			 int na = f %10;
			 f /= 10;
			 sum += na;
			 
			 
		 }
		
		 return sum;
	 
	 
	 
	 
	 
	 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
