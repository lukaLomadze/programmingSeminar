import stanford.karel.SuperKarel;

public class problem11 extends SuperKarel{

	public void run(){
		
		move();
		move();
		
		
		if(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			turnAround();
			while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			move();
			turnAround();
			
			}
		}
		move();
		move();
		move();
			while(beepersPresent()){
				pickBeeper();
				turnAround();
				move();
				move();
				move();
				putBeeper();
				turnAround();
				move();
				move();
				move();
				
				
				
			}
			move();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
//	private void gasayofi(){
//		move();
//		while(beepersPresent()){
//			pickBeeper();
//			turnLeft();
//			move();
//			turnAround();
//			move();
//			turnRight();
//			move();
//			move();
//			putBeeper();
//			
//			
//			
//		}
//	}
//	private void gamyofi(){
//		move();
//		move();
//		pickBeeper();
//		move();
//		
//	}

