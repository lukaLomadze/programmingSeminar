import stanford.karel.SuperKarel;

public class problem01 extends SuperKarel {
	 public void run(){
		while(leftIsClear()){
			moveOnRow();
		  if(facingEast()){
			  turnLeft();
			  move();
			  turnLeft();
		  }else{
			  turnRight();
			  if(frontIsClear()){
				  move();
				  turnRight();
			  
			  }  
		  }
		}
		
		moveOnRow();

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	 	 
	private void moveOnRow(){	
		while (frontIsClear() ){
			if(noBeepersPresent()){
			putBeeper();
			}
			move();	
		}
		if(noBeepersPresent()){
			putBeeper();
		}	
	}
}
	

	//N2	 
//	for (int i = 0; i < 4; i++) {
//		move(); 
//		}
//	for (int i = 0; i < 10; i++) {
//		pickBeeper(); 
//		}
//	move();
//	
//	for (int i = 0; i < 10; i++) {
//		putBeeper(); 
//		}





	
//3-4-5
//while (frontIsClear() ){
//	if(noBeepersPresent()){
//	putBeeper();
//	}
//	move();
//	
//}
//if(noBeepersPresent()){
//	putBeeper();
//	}




//N6
//	int n = 0 ;
//	int m = 0;
//	move();
//	while(beepersPresent()){
//		n++;
//		pickBeeper();
//	}
//	move();
//	while(beepersPresent()){
//		m++;
//		pickBeeper();
//	}
//	 move();
//	for (int i = 0; i< m+n; i++){
//		putBeeper();
//	}
//	  move();
//	  
//	  