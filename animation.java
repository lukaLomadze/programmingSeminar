
import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class animation extends GraphicsProgram {
	
	private static final double SUN_RADIUS = 50;
	private static final double EARTH_RADIUS = 5;
	private static final double DISTANCE = 150;
	
	
	public void run() {
		addSun();
		addEarth();
	}
	
	private void addSun() {
		GOval sun = new GOval(SUN_RADIUS * 2, SUN_RADIUS * 2);
		sun.setFilled(true);
		sun.setColor(Color.YELLOW);
		add(sun, getWidth() / 2.0 - SUN_RADIUS, getHeight() / 2.0 - SUN_RADIUS);
	}
	
	private void addEarth() {
		GOval earth = new GOval(EARTH_RADIUS * 2, EARTH_RADIUS * 2);
		earth.setFilled(true);
		earth.setColor(Color.BLUE);
		add(earth);
		double alpha = 0;
		while (true) {
			double x = DISTANCE * Math.cos(alpha) + getWidth() / 2 - EARTH_RADIUS;
			double y = DISTANCE * Math.sin(alpha) + getHeight() / 2 - EARTH_RADIUS;
			earth.setLocation(x, y);
			alpha += 0.001;
			pause(1);
		}
	}
}


//import acm.graphics.GOval;
//import acm.program.GraphicsProgram;
//
//public class animation extends GraphicsProgram {
//	public void run(){
//		
//		
//		GOval oval = new GOval(50 , 50);
//		add(oval, 0 , getHeight()/2 - 25);
//		int v = 
//		while(oval.getX()+52 <= getWidth() ){
//			pause(10);
//			oval.move(5, 2);
//			
//		}
//		
//		
//	}
//}
