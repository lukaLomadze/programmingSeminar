import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem57 extends ConsoleProgram {
	public void run() {

		String a = "luka";
		String b = "aulk";
		
	println(Arrays.equals(check(a), check(b)));
	
	}

	

	private int[] check(String a) {
		int[] arr = new int[26];
		for(int i =0; i<a.length(); i++){
			arr[a.charAt(i)-'a']++;
		}
		return arr;
		
	}
}