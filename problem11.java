import stanford.karel.SuperKarel;

public class problem11 extends SuperKarel{

	public void run(){
		
		
		
	
	}
	private void gasayofi(){
		move();
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			move();
			turnAround();
			move();
			turnRight();
			move();
			move();
			putBeeper();
			
			
			
		}
	}
	private void gamyofi(){
		move();
		move();
		pickBeeper();
		move();
		
	}
}
