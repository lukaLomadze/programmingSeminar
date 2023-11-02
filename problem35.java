import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem35 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		
		int t =0;
		int f =0;
		
		for(int i = 0; i< 10000; i++){
		if(rgen.nextBoolean()){
			t++;
		}else{
			f++;
		}
		println(t/ (double)(t+f));
		
		
		
	}	
		
	
		
		
		
}
}