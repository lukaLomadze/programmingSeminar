import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class line extends GraphicsProgram {
public void run(){
	
//	GLine lin = new GLine(0, getHeight()/2, getWidth(),  getHeight()/2);
//	add(lin);
	
	
	
	
	for(int i = 1; i < 20; i++){
		
		GLine lin = new GLine( i* getWidth()/(double) 20 , 0, i* getWidth()/(double)20,  getHeight());	
		
		add(lin);
		
	}
}
}
