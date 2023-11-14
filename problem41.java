import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem41 extends GraphicsProgram {
	GOval ball;
	public void run() {

		ball = new GOval (20,20);
		ball.setFilled(true);
		
		
		addMouseListeners();
		
		
		
	}
	
	public void MouseDragged(MouseEvent e ){
		
		add(ball, getX() , getY());
		
		
	}
	
	
}
