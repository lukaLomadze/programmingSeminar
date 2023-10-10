import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class paint extends GraphicsProgram{
	public void run(){
	GRect rect = new GRect(200, 200);
	rect.setFilled(true);
	rect.setColor(Color.red);
	add(rect, 100, 100);
	GRect rect2 = new GRect(50, 90);
	rect2.setFilled(true);
	rect2.setColor(Color.blue);
	add(rect2, 130, 130);
	add(rect2, 230, 130);
	
	
	}
}
