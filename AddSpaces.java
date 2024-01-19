
import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class AddSpaces extends ConsoleProgram {
	public void run() {

		String a = "ilovecoding";
	
		int[] b = { 1, 5 };
		for (int i =0; i< b.length; i++) {
			String l = a.substring(0, b[i] + i) + " " + a.substring(b[i] + i );
			a = l;

		}
println(a);
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
}

