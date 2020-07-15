package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String q1 = JOptionPane.showInputDialog("What is 1 + 1?");
		// 3.  Use an if statement to check if their answer is correct
			if(q1.equalsIgnoreCase("2")) {
				score ++;
				JOptionPane.showMessageDialog(null, "Correct!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Sorry, but the answer was 2! You'll get it next time!");
			}
		// 4.  if the user's answer was correct, add one to their score 
			String q2 = JOptionPane.showInputDialog("What is the world's fastest 100 meter dash time?");
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
			if(q2.equalsIgnoreCase("9.58")) {
				score ++;
				JOptionPane.showMessageDialog(null, "Correct!");
			}
			else {
				JOptionPane.showMessageDialog(null, "The correct answer was 9.58!");
			}
			String q3 = JOptionPane.showInputDialog("What is the world's largest living animal?");
			// 6.  After all the questions have been asked, print the user's score 
			if(q3.equalsIgnoreCase("Blue Whale")) {
				score ++;
				JOptionPane.showMessageDialog(null, "Correct!");
			}
			else {
				JOptionPane.showMessageDialog(null, "The world's largest animal is the Blue Whale! Not " + q3 + ".");
			}
			String q4 = JOptionPane.showInputDialog("Who made this quiz?");
			if(q4.equalsIgnoreCase("Mattan")) {
				score ++;
				JOptionPane.showMessageDialog(null, "Correct!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Mattan made this quiz.");
			}
			JOptionPane.showMessageDialog(null, "You got " + score + "/4 questions correct! Thank you for playing!");
	}
}
