import acm.program.ConsoleProgram;

public class Twodimmension  extends ConsoleProgram {
	public void run() {
		int[] b = { 1, 5 };
		int[][] arr = new int [b.length][];
		
		for(int i =0; i< arr.length; i++){
			arr[i]= new int[b[i]];
		}
		println(b.toString());
		
		
	}
}
