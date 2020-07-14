package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		int angle = 90;
		int distance = 100;
		
		Robot rob = new Robot();
		
		rob.setSpeed(100);
		
		rob.penDown();
		
		for (int i = 0 ; i < 4; i++) {
		
		rob.move(distance);
		
		rob.turn(angle);
		}
		
	}
}
