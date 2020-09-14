package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog("Do you know how to write code?");
		int answer2 = JOptionPane.showConfirmDialog(null, "Do you know how to write code?");
				System.out.println(answer + " " + answer2);

		// 2. If they say "yes", tell them they will rule the world.
		if (answer2 == 0)
			System.out.println("You will rule the world!");
		// 3. Otherwise, tell them to sign up for classes at The League.
		else
			System.out.println("Sign up for classes at The League.");

	}
}

