package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int randNum = ran.nextInt(4);
	
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	
		// 3. Print your variable to the console
		System.out.println("Rand num is " + randNum);
	
		// 4. Get the user to enter something that they think is awesome
		String awesome = JOptionPane.showInputDialog("Enter something you think is awesome");
	
		// 5. If your variable is  0
	
			// -- tell the user whatever they entered is awesome!
		if (randNum == 0)
			System.out.println(awesome + " ... That's awesome!");
	
		// 6. If your variable is  1
	
			// -- tell the user whatever they entered is ok.
		else if (randNum == 1)
			System.out.println(awesome + " ... That's OK");
	
		// 7. If your variable is  2
	
			// -- tell the user whatever they entered is boring.
		else if (randNum == 2)
			System.out.println(awesome + " ... That's boring");
	
		// 8. If your variable is  3
	
			// -- invent your own message to give to the user (be nice).
		else
			System.out.println(awesome + " ... That's lame!");
		
	}

}
