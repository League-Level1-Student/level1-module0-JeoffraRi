package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String amtrakIsOffended = "file:///Users/asherlaw/Documents/Screenshot%202023-05-07%20at%201.19.56%20PM.png";
		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component
		Component c = createImage(amtrakIsOffended);
		// 4. add the image to the quiz window
		quizWindow.add(c);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ans = JOptionPane.showInputDialog("What type of train car is this? (It's case sensitive, bro!)");
		// 7. print "CORRECT" if the user gave the right answer
		if (ans.equalsIgnoreCase("Superliner")) {
			JOptionPane.showMessageDialog(null, "You are super right diddly doo! Haha!");
		}else {
			JOptionPane.showMessageDialog(null, "Nooooooooooooo! You're wrong! As punishment you must fight Sussy Samuel! ඞඞඞඞඞඞඞඞ SO SUSSSSYYY! AMOGUS");
		}
		String ans2 = JOptionPane.showInputDialog("What is the company owning the train in this image? (It's still case sensitive, bro!)");
		// 7. print "CORRECT" if the user gave the right answer
		if (ans2.equalsIgnoreCase("BNSF")) {
			JOptionPane.showMessageDialog(null, "YOU GUESSSSSED IT WOW THATS AMAZING WOOOO! Not at all LIKE THE COMPANY WAS ON THE SIDE OF THE TRAIN");
		}else {
			JOptionPane.showMessageDialog(null, "YOU BEITH WRONGGGG!11!!1!11!!! AAAAAAAAA! AAAA! AAAAIDJDNJNJDIQDNJK!");
		}
		String ans3 = JOptionPane.showInputDialog("What company is SUPPOSED to own this train car (It's STILL case sensitive, dude!)");
		// 7. print "CORRECT" if the user gave the right answer
		if (ans3.equalsIgnoreCase("Amtrak")) {
			JOptionPane.showMessageDialog(null, "WOOOOOOWWW! That was amazing! I can't believe you did that! You're awesome...FOR NOW! ඞඞඞ");
		}else {
			JOptionPane.showMessageDialog(null, "STOP BEING WRONG!11!!111!!YOU ARE TOO WRONG AAAASHHSAHSJHAKSK! YOU SHALL BE SMASHED IN MONSTR.PARTY");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String AmtrakIsOffended) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(AmtrakIsOffended);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
