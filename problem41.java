import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem41 extends GraphicsProgram {
	 
	public void run() {

		
		
		addMouseListeners();
		
		
		
	}
	
	public void mouseDragged(MouseEvent e ){
		paint(e.getX(), e.getY());
		
		
	}
	
	public void mouseClicked(MouseEvent e ){
		
		paint(e.getX(), e.getY());
		
	}

	private void paint(double x , double y) {
		GOval ball = new GOval (50,50);
		ball.setFilled(true);
		
		add(ball,x - 10 , y- 10);
		
	}
	
	
	
}
