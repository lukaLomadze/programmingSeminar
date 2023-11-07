import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class animation extends GraphicsProgram {
	public void run(){
		
		
		GOval oval = new GOval(50 , 50);
		add(oval, 0 , getHeight()/2 - 25);
		
		while(oval.getX()+52 <= getWidth() ){
			pause(10);
			oval.move(1, 0);
		}
		
		
	}
}
