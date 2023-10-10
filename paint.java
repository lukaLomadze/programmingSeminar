import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class paint extends GraphicsProgram{
	public void run(){
	GRect rect = new GRect(200, 200);
	rect.setFilled(true);
	rect.setColor(Color.red);
	add(rect, 100, 100);
	
	GRect rect2 = new GRect(40, 90);
	rect2.setFilled(true);
	rect2.setColor(Color.blue);
	add(rect2, 120, 130);
	
	
	GRect rect3 = new GRect(40, 90);
	rect3.setFilled(true);
	rect3.setColor(Color.blue);
	add(rect3, 240, 130);
	
	GRect door = new GRect(60, 100);
	door.setFilled(true);
	door.setColor(Color.black);
	add(door, 170, 200);
	
	}
}
