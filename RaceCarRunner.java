

public class RaceCarRunner {
	
	public static void main(String[] args) {
		int i = 0;
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar ferrari=new RaceCar("Ferrari", 5);
		// 2. Print the RaceCar's position in the race
	System.out.println("Your car is in position number "+ ferrari.getPositionInRace());
		// 3. Crash the RaceCar
		ferrari.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		ferrari.pit();
		// 5. Help the car move into first place.
		for(i=0; i<7; i++) {
			ferrari.overtake();
		}
	}
}
