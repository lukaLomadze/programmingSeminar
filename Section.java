import acm.program.ConsoleProgram;

public class Section extends ConsoleProgram {

	public void run(){
		println(tr());
		
				
			
			
			}
			
			private boolean tr(){
				String t = "iyo arabets rostevan mefe";
		
		for (int i = 1 ; i < t.length(); i++){
			String a = t.substring(0, i);
			String b = t.substring(i);	
//			println(a);
//			println(b);
			for (int k = 1 ; k < a.length(); k++){
			
			
				for (int l = 1 ; l < b.length(); l++){
					String rep_a = "" + a.charAt(k);
					a = a.replace(rep_a, "");
					String rep_b = "" + a.charAt(l);
					b = b.replace(rep_b, "");
					String finall = a+ b; 
					
					if(finall.equals("yo arabts rostvan mf") ){
						return true;
					}
				
					
				}
				
				
			}
			
			
			
		}
		
		return false;
		
		
		
		
	}
}
