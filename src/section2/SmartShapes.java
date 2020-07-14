package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
    	Robot mattan = new Robot();
    	int distance = 250;
    	int angle = 90;
    	int side = 360;
        // 3. Put the robot's pen down
    	mattan.penDown();

        // 6. Make the robot move as fast as possible
    	mattan.setSpeed(200);

        // 5. Use a for loop to repeat everything below 4 times. 
    	for (int i = 0 ; i < side; i++) {
    		mattan.setRandomPenColor();
        //         2. Move your robot 200 pixels
    		mattan.move(distance);

        //         4. Turn the robot 90 degrees to the right
    		mattan.turn(angle);
    		
    		mattan.turn(1);
    	
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
    	
    	
    	}
    }
}
