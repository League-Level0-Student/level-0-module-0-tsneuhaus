package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero.
		int score = 0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String answer1 = JOptionPane.showInputDialog("What is the color of the sun?");
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		if (answer1.equals("yellow"))
			score += 1;
		
		answer1 = JOptionPane.showInputDialog("What is the color of the sky?");
		
		// 3.  Use an if statement to check if their answer is correct
		
		// 4.  if the user's answer was correct, add one to their score 
		if (answer1.equals("blue"))
			score += 1;
		
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
		JOptionPane.showMessageDialog(null, "Your score is " + score);
		
	}
}
