import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem47 extends GraphicsProgram {

	private int A = 100;
	private GRect rect = new GRect(A, A, 100, 100);
	private RandomGenerator rgen = RandomGenerator.getInstance();

	
	public void run() {
		
		add(rect,rgen.nextInt(100), 10);
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
		if(getElementAt(e.getX(), e.getY()) == rect){
			remove(rect);
		}
	}
}
