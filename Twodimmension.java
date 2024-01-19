import acm.program.ConsoleProgram;

public class Twodimmension  extends ConsoleProgram {
	public void run() {
		int[] b = { 1, 5 };
		String[][] arr = new String [b.length][];
		
		for(int i =0; i< arr.length; i++){
			arr[i]= new String[b[i]];
		}
		println(arr[0].toString());
		
		
	}
}
