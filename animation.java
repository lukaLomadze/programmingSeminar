import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class animation extends GraphicsProgram {
	public void run(){
		
		
		GOval oval = new GOval(50 , 50);
		add(oval);
		
		while(oval.getX()+50 <= getWidth() ){
			pause(40);
			oval.move(2, 2);
		}
		
		
	}
}
