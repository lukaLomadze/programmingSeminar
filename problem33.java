import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem33 extends GraphicsProgram {
	private RandomGenerator tr = RandomGenerator.getInstance();
	public void run(){
		
		for(int i = 0; i< 100000000; i++){
		
		drawRect();
		}
		
		
		
		
		
		
		
		
		
	}
	private void drawRect() {
		GRect rect = new GRect(tr.nextInt(200), tr.nextInt(200));
		rect.setFilled(tr.nextBoolean());
		rect.setColor(tr.nextColor());
		add(rect, tr.nextInt(200), tr.nextInt(200));
		
		
		
		
	}
	
	
	
	
}
