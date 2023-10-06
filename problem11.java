import stanford.karel.SuperKarel;

public class problem11 extends SuperKarel{

	public void run(){
	
	move();
	
	while(beepersPresent()){
		pickBeeper();
		move();
		if(beepersPresent()){
			pickBeeper();
		}else{
			break;
		}
		turnAround();
		move();
		turnAround();
		
		
		
	}
	
	
//	2-n
//	3-m
//	n<m 3
//	n>m 2
//	n=m 1
//	if(beepersPresent()){
//		move();
//		move();
//		putBeeper();
//		putBeeper();
//	}
//	
//	if(noBeepersPresent()){
//		move();
//		if(noBeepersPresent()){
//			move();
//			putBeeper();
//		}
//		
//	}
//	move();
//	if(beepersPresent()){
//		move();
//		putBeeper();
//		putBeeper();
//		putBeeper();
//	}
//	
//	
	
	
		
//		move();
//		while(beepersPresent()){
//			pickBeeper();
//			move();
//			if(beepersPresent()){
//				pickBeeper();	
//			}else{
//				move();
//				move();
//				putBeeper();
//				putBeeper();
//				putBeeper();
//				turnAround();
//				move();
//				turnAround();
//			}
//			
//			turnAround();
//			move();
//			turnAround();
//			
//		}
//		
//		move();
//		if(beepersPresent()){
//			move();
//			putBeeper();
//			putBeeper();
//		}else{
//			move();
//			putBeeper();
//		}
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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