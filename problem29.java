import acm.program.ConsoleProgram;

public class problem29 extends ConsoleProgram{
	
	
 public void run(){
	 int n = readInt("enter numb ");
	 int f = 12456;
	
	 
	// reverse(f);
	 
 println(sum(f));
	 
 }
 
 private int sum (int f){
 int sum = 0;
 
 while(f>=0){
	 int na = f %10;
	 f %= 10;
	 sum += na;
	 
	 
 }

 return sum;
 
 
 
 
 
 }
 
 
 
 
 
 
 
 
 
 
 
 
// private int reverse(int f){
//	 int res = 0;
//	 while(f > 0){
//		 int d = n % 10;
//		 res = res*10+ d;
//		 
//	 }
//	 
// }
 
 
 
 
}
// 0, 1, 1, 2, 3, 5, 8, 