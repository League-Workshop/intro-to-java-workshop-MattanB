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
				JOptionPane.showMessageDialog(null, "Bingo!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Sorry, but the answer was 2! You'll get it next time!");
			}
		// 4.  if the user's answer was correct, add one to their score 
			String q2 = JOptionPane.showInputDialog("What is the world's fastest 100 meter dash time?");
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
			if(q2.equalsIgnoreCase("9.58")) {
				score ++;
				JOptionPane.showMessageDialog(null, "Spot on!");
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
			String q4 = JOptionPane.showInputDialog("Who invented the bottle cap?");
			if(q4.equalsIgnoreCase("William Painter")) {
				score ++;
				JOptionPane.showMessageDialog(null, "You got it!");
			}
			else {
				JOptionPane.showMessageDialog(null, "The bottle cap was invented by William Painter.");
			}
			String q5 = JOptionPane.showInputDialog("Who has the most grand slams titles in men's tennis as of 2020?");
			if(q5.equalsIgnoreCase("Roger Federer")) {
				score ++;
				JOptionPane.showMessageDialog(null, "100%!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Nope. It's Roger Federer");
			}
			String q6 = JOptionPane.showInputDialog("How much wood would a woodchuck chuck if a woodchuck would chuck wood?");
			if(q6.equalsIgnoreCase("700 pounds worth of wood")) {
				score ++;
				JOptionPane.showMessageDialog(null, "Splendid work!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Sorry, but the answer was 700 pounds because they can chuck 700 pounds worth of dirt so \n" + "they can chuck an equivalent amount of wood");
			}
			String q7 = JOptionPane.showInputDialog("what is 1*1?");
			if(q7.equalsIgnoreCase("1")) {
				score ++;
				JOptionPane.showMessageDialog(null, "Yep, you got it");
			}
			else {
				JOptionPane.showMessageDialog(null, "WRONG! U = Dumb >:c");
			}
			String q8 = JOptionPane.showInputDialog("who won the 2020 superbowl?");
			if(q8.equalsIgnoreCase("The Chiefs")) {
				score ++;
				JOptionPane.showMessageDialog(null, "Mhm");
			}
			else {
				JOptionPane.showMessageDialog(null, "Wrong answer.");
			}
			String q9 = JOptionPane.showInputDialog("What is the chemical formula for Potassium Chloride?");
			if(q9.equalsIgnoreCase("KCI")) {
				
				score ++;
				JOptionPane.showMessageDialog(null, "That's Right!");
			}
			else {
				JOptionPane.showMessageDialog(null, "The right answer was KCI.");
			}
			String q10 = JOptionPane.showInputDialog("What is the estimated world population as of July 17, 2020?");
			if(q10.equalsIgnoreCase("7.8 billion")) {
				score ++;
				JOptionPane.showMessageDialog(null, "you got it!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Ahh. Sooo close! The answer was 7.8 billion");
			}
			String q11 = JOptionPane.showInputDialog("Where did camels originate?");
			if(q11.equalsIgnoreCase("North America")) {
				score ++;
				JOptionPane.showMessageDialog(null, "Correct!");
			}
			else {
				JOptionPane.showMessageDialog(null, "As odd as it is, camels originated in North America over 45 \n" + "million years ago and migrated on the bering land bridge in an ice age to Eurasia. \n" + 
						"They later migrated south to africa and the middle east");
			}
			String q12 = JOptionPane.showInputDialog("Who made this quiz?");
			if(q12.equalsIgnoreCase("Mattan")) {
				score ++;
				JOptionPane.showMessageDialog(null, "Yessir!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Mattan made this quiz.");
			}
			JOptionPane.showMessageDialog(null, "You got " + score + "/12 questions correct! Thank you for playing!");
	}
}
