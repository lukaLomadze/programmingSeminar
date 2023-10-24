/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import acm.graphics.GRect;
import acm.program.*;

public class GraphicsProgramSample extends GraphicsProgram {
	
	public void run() {
	
		GRect squ = sqr(80);
		
		for(int i = 1; i<=5;i++){
			
			add(sqr(80), i* 80,i*80);
			
		}
		
		
		
		
		
	}
	private GRect sqr(double a ){
		GRect square = new GRect(a,a);
		return square;
	}

}
