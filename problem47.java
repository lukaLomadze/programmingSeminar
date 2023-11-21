import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class problem47 extends GraphicsProgram {

	private GRect rect = new GRect(10, 10, 10, 10);

	public void run() {

		add(rect, 10, 10);
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		if(getElementAt(e.getX(), e.getY()) == rect){
			remove(rect);
		}
	}
}
