import java.awt.Color;

import acm.graphics.GOval;
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
	eye1.setColor(Color.black);
	add(eye1,x+20, y+40 );
	
	GRect eye2 = new GRect(40, 40);
	eye2.setFilled(true);
	eye2.setColor(Color.black);
	add(eye2,x+140, y+40 );
	
	GOval mounth = new GOval(100,25);
	mounth.setFilled(true);
	mounth.setColor(Color.black);
	add(mounth, x+50, y+140);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}
