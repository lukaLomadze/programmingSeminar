import stanford.karel.*;


public class problem8 extends SuperKarel{
	public void run(){
		
		
		move();
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
		move();
		while (beepersPresent()){
			pickBeeper();
			move();
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			move();
			turnAround();
			
		}
		
		move();
		move();
		
		
		
		
		
		
	}

}
