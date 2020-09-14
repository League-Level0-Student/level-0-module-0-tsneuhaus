package _02_code_flow._3_pentagon_crazy;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class PentagonCrazy {
	
	public static void main(String[] args) {
		
		//  Create a new Robot
		Robot pam = new Robot();

		//  Put the robot's pen down
		pam.penDown();

		//  SPEED. Make the robot go at maximum speed (100)
		pam.setSpeed(100);

		//  COLOR. Set the pen to a color that you like for the shape
		pam.setPenColor(Color.GREEN);

		//  NUMBER OF SIDES. Make an int variable for the number of sides the shape will have.
		//  				(Hint: its called PentagonCrazy)
		int numSides = 5;

		//  TURN ANGLE. Make another int variable for the angle the robot must turn. 
		//  			Hint: Divide 360 by the number of sides the shape has to get the angle.
		int angle = 360/numSides;
		
		//  COUNT. Make another int variable to count how many times the loop has repeated
		//         Set its start value to zero.
		int count = 0;

		//  LOOP. Start a while loop to repeat the DRAW, TURN, and INCREASE COUNT code 200 times. 
		while (count < 200)
		{
				pam.move(count);
				//  DRAW.  Make the robot move "i" pixels
				//         "i" is the variable in the for loop
		
				//  TURN.  Turn the robot the amount in your angle variable + 1
				pam.turn(angle+1);

				//  INCREASE COUNT. Increase the count by 1
				count += 1;
		
		//  End the while loop here
		}

		//  Now hide the robot so you can see the pattern it has drawn.
		pam.hide();
		
		//  Run the program. 
		//  Check the pattern against the picture in the recipe. If it matches, you are done!
	

	
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	}
}