import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class paint extends GraphicsProgram{
	public void run(){
	GRect rect = new GRect(200, 200);
	rect.setFilled(true);
	rect.setColor(Color.red);


	add(rect, 100, 100);
	
	
	}
}
