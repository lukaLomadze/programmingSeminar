import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
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
	
	
	rect2 = new GRect(40, 90);
	rect2.setFilled(true);
	rect2.setColor(Color.blue);
	add(rect2, 240, 130);
	
	GRect door = new GRect(60, 100);
	door.setFilled(true);
	door.setColor(Color.black);
	add(door, 170, 200);
	
	GOval handle = new GOval(10, 10);
	handle.setFilled(true);
	handle.setColor(Color.white);
	add(handle,180, 250);	
		
	GLine roof1 = new GLine(200, 50, 100,100);
	add(roof1);
	GLine roof2 = new GLine(200, 50, 300,100);
	add(roof2);
		
	System.out.print(getHeight());
	
	
	GLine lin = new GLine(0, getHeight()/2, getWidth(),  getHeight()/2);
	add(lin);
		
	}
}
