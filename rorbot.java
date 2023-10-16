import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class rorbot extends GraphicsProgram{
	public void run(){
		double x = getWidth()/2- 100;
		double y =getHeight()/2-100;
		drawFace();
		drawNose();
		drawMounth();
		drawLeftEyE();
		drawRightEye();
		}

	private void drawRightEye() {
		GOval eye2 = new GOval(40, 40);
		eye2.setFilled(true);
		eye2.setColor(Color.black);
		add(eye2,x+130, y+40 );
	}

	private void drawLeftEyE() {
		GOval eye1 = new GOval(40, 40);
		eye1.setFilled(true);
		eye1.setColor(Color.black);
		add(eye1,x+30, y+40 );
	}

	private void drawMounth() {
		GOval mounth = new GOval(100,25);
		mounth.setFilled(true);
		mounth.setColor(Color.black);
		add(mounth, x+50, y+140);
	}

	private void drawNose() {
		GRect nose = new GRect(10, 50);
		nose.setFilled(true);
		nose.setColor(Color.black);
		add(nose,x+95, y+70 );
		
	}

	private void drawFace() {
		GRect face = new GRect(200, 200);
		face.setFilled(true);
		face.setColor(Color.GRAY);
		
		add(face,x, y );
	}
		
		
	
	
}
