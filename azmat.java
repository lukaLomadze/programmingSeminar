import acm.program.ConsoleProgram;

public class azmat extends ConsoleProgram{
 public void run(){
	 
	 int n = 3;
	 int m = 5;
	 int k = n*m;
	 
	 int e = 3;
	 
	 int d =0;
	 for(int i = 0; i< k; i++){
		 
		 if((i * e) % k == 1 ){
			 d = i;
		 }
		 
		 
	 }
	 println(d);
	 
 }
}
