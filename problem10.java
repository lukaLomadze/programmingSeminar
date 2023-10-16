import stanford.karel.SuperKarel;

public class problem10 extends SuperKarel{

	public void run(){

	
		move();
		while(beepersPresent()){
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
			
			
			turnAround();
			move();
			
			turnAround();
			
			}
			
			
			move();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
			
			
			while(beepersPresent()){
				pickBeeper();
				turnAround();
				move();
				putBeeper();
				turnAround();
				move();
				
			
			}
			
			
			
		}			
	
	}

}