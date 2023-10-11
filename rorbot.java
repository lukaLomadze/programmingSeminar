import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class rorbot extends GraphicsProgram{
public void run(){
	
	
	GRect rect = new GRect(200, 200);
	rect.setFilled(true);
	rect.setColor(Color.GRAY);
	int x = getWidth()/2- 100;
	int y =getHeight()/2-100;
	
	add(rect,x, y );
	
	
	
	
	
	
	
}
	
	
	
	
}
