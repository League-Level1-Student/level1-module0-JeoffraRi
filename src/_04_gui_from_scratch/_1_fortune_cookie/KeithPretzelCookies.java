package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeithPretzelCookies implements ActionListener {
	public static void main(String[] args) {
		new KeithPretzelCookies().showButtons();
		
	}
	
	public class FortuneCookie {
        public void showButton() {
            System.out.println("Button clicked");
       }
    }

	
	private void showButtons() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JButton button = new JButton();
		button.addActionListener(this);
		panel.add(button);
		frame.add(panel);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String landscaper  = new String("You will become a landscaper!");
		String grocery  = new String("You will become a grocery store owner!");
		String salesman  = new String("You will become a traveling salesman!");
		String data  = new String("You will become a data manager!");
		   int rand = new Random().nextInt(5);
		if (rand==1) {
		System.out.println("Woohoo!");
		speak("You will become a landscaper!");
		} else if (rand==2) {
			System.out.println("Woohoo!");
			speak("You will become a grocery store owner");
		} else if (rand==3) {
			System.out.println("Woohoo!");
			speak("You will become a traveling salesman!");
		} else if (rand==1) {
			System.out.println("Woohoo!");
			speak("You will become a data manager");
		}
		
	}
	
     static void speak(String characterToSpeak) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ characterToSpeak + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}
