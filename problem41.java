import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem41 extends GraphicsProgram {
	 
	public void run() {

		
		
		addMouseListeners();
		
		
		
	}
	
	public void mouseDragged(MouseEvent e ){
		paint(e);
		
		
	}
	
	public void mouseClicked(MouseEvent e ){
		
		paint(e);
		
	}

	private void paint(MouseEvent e) {
		GOval ball = new GOval (20,20);
		ball.setFilled(true);
		
		add(ball, e.getX() - 10 , e.getY()- 10);
		
	}
	
	
	
}
