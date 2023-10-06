import stanford.karel.SuperKarel;

public class problem11 extends SuperKarel{

	public void run(){
	
	move();
	while(beepersPresent()){
		pickBeeper();
		move();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		turnAround();
		
		
		
	}
		
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			if(beepersPresent()){
				pickBeeper();	
			}else{
				move();
				move();
				putBeeper();
				putBeeper();
				putBeeper();
			}
			
			turnAround();
			move();
			move();
			turnAround();
			
		}
		
		move();
		if(beepersPresent()){
			move();
			putBeeper();
			putBeeper();
		}else{
			move();
			putBeeper();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		move();
//		while(beepersPresent()){
//			move();
//			while(beepersPresent()){	
//			pickBeeper();
//			
//			turnAround();
//			move();
//			pickBeeper();
//			turnAround();
//			move();
//			move();
//			putBeeper();
//			
//			
//			turnAround();
//			move();
//			
//			turnAround();
//			
//			}
//			move();
//			move();
//			putBeeper();
//			turnAround();
//			move();
//			turnAround();
//			while(beepersPresent()){
//				pickBeeper();
//				turnAround();
//				move();
//				putBeeper();
//				turnAround();
//				move();
//				
//			
//			}
//			turnAround ();
//			move();
//			move();
//			turnAround();
//			
//			
//			
//		}		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
//	
//	move();
//		move();
//		
//		
//		while(beepersPresent()){
//			pickBeeper();
//			turnAround();
//			move();
//			turnAround();
//			while(beepersPresent()){
//				pickBeeper();
//				move();
//				move();
//				putBeeper();
//				move();
//				putBeeper();
//				turnAround();
//				move();
//				move();
//				move();
//				turnAround();
//				
//			}
//		
//			move();
//			move();
//			move();
//			
//			move();
//			putBeeper();
//			turnAround();
//			move();
//			turnAround();
//				
//				while(beepersPresent()){
//					pickBeeper();
//					turnAround();
//					move();
//					move();
//					move();
//					putBeeper();
//					turnAround();
//					move();
//					move();
//					move();
//					
//					
//					
//				}
//			turnAround();
//			move();
//			move();
//			turnAround();
//		
//		
//		
//		}
//		
//		
//		move();
//		move();
//		move();
//		while(beepersPresent()){
//			pickBeeper();
//			turnAround();
//			move();
//			move();
//			move();
//			turnAround();
//			putBeeper();
//			move();
//			move();
//			move();	
//		}
		
		
		
		
		
		
		
		
		
		
	
	}

}