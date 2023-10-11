import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class rorbot extends GraphicsProgram{
public void run(){
	
	
	GRect face = new GRect(200, 200);
	face.setFilled(true);
	face.setColor(Color.GRAY);
	int x = getWidth()/2- 100;
	int y =getHeight()/2-100;
	
	add(face,x, y );
	
	GRect eye1 = new GRect(40, 40);
	eye1.setFilled(true);
	eye1.setColor(Color.gray);
	
	
	add(eye1,x+40, y+40 );
	
	
	
	
	
}
	
	
	
	
}
