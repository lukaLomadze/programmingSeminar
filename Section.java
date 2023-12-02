import acm.program.ConsoleProgram;

public class Section extends ConsoleProgram {

	public void run(){
		println(tr("yo arabts rostvan mf" ));
		
				
			
			
			}
			
			private boolean tr(String txt){
				String t = "iyo arabets rostevan mefe";
		
		for (int i = 1 ; i < t.length()-1; i++){
			String a = t.substring(0, i);
			String b = t.substring(i);	
			println(a);
			println(b);
			for (int k = 0 ; k < a.length(); k++){
				
				
			String repa = "" + a.charAt(k);
					String aa = a.replace(repa, "");
			
				for (int l = 0 ; l < b.length(); l++){
					
					
					
					String repb = "" + b.charAt(l);
					String bb = b.replace(repb, "");
				
					String finall = aa + bb; 
					
					if(finall.equals(txt) ){
						return true;
					}
				
					
				}
				
				
			}
			
			
			
		}
		
		return false;
		
		
		
		
	}
}
