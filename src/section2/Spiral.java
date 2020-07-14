package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot Mattan = new Robot();
		
		Mattan.penDown();
		
		Mattan.setSpeed(100);
		
		for (int i = 0 ; i < 75; i++) {
		
			Mattan.setRandomPenColor();
		
			Mattan.move(5*i);
			
			Mattan.turn(360/7);
		
			Mattan.setPenWidth(i);
		}	
	}
}
