import stanford.karel.SuperKarel;

public class problem11 extends SuperKarel{

	public void run(){
		
		move();
		move();
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			pickBeeper();
			turnAround();
			move();
			move();
			putBeeper();
			move();
			putBeeper();
			
			while(beepersPresent()){
				pickBeeper();
				move();
				move();
				move();
				pickBeeper();
				turnAround();
				move();
				move();
				move();
				turnAround();
				
				
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
}
