import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class events extends GraphicsProgram {
	private GRect rect;
	public void run() {

		rect = new GRect(50, 50);
		rect.setFilled(true);
		add(rect, 50,50);
		
		
		
		
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		rect.setLocation(e.getX(), e.getY());
		
	}
}
