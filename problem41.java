import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem41 extends GraphicsProgram {
	 
	public void run() {

		
		
		addMouseListeners();
		
		
		
	}
	
	public void MouseDragged(MouseEvent e ){
		GOval ball = new GOval (20,20);
		ball.setFilled(true);
		
		add(ball, getX() , getY());
		
		
	}
	
	
}
