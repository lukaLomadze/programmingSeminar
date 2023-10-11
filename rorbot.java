import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class rorbot extends GraphicsProgram{
public void run(){
	
	
	GRect rect = new GRect(200, 200);
	rect.setFilled(true);
	rect.setColor(Color.GRAY);
	
	
	
	add(rect, getWidth()/2- 100,  getHeight()/2-100);
	
	System.out.print(getWidth()/2- 100,  getHeight()/2-100);
	
	
	
	
	
	
}
	
	
	
	
}
