
public class Car {
	int gear = 1;
	int location ;
	int speed = 0;
	final int destination = 250;
	

	void reverseGear() {
		gear = -1 ;
	}
	
	void gearUp () {
		if (gear >= 6){
			System.out.println("It cannot increase the gear anymore");
		}
		else if (gear == -1){
			gear = 1;
			
		}
		else {
			gear = gear + 1 ;
			}
	}
	
	void gearDown (){
		if (gear == 1){
		System.out.println("It cannot decrease the gear anymore");
		}
		else if (gear == -1){
			System.out.println (" it cannot decrease the gear because the car is in the reverse gear");
			
		}
		else
		{
			gear = gear -1 ;
			
		}
		
	}

	int reportGear () {
		return gear;
	
		
	}
	int reportLocation (){
		return location;
	}
	
	int reportRemaining(){
		int Remaining = destination - location;
		return Remaining;
	}
	
	void moveByTime(int time){
		if (time <= 0) {
			System.out.println("the time should be positive");
		}
		
		else {
		
			speed = gear * 20;
			int delta = speed * time;
			location = delta + location;
			
			
			
			
		}
	}
	
	boolean isArrived (){
		if (location >= destination){
			return true;
		}
		else {
			return false;
		}
	}
		
}
			
		
	
	


