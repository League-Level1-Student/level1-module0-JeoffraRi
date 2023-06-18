package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		System.out.println("Woohoo!");
		speak("Well, you can tell by the way I use my walk \n"
				+ "I'm a woman's man, no time to talk \n"
				+ "Music loud and women warm \n"
				+ "I've been kicked around since I was born\n"
				+ "\n"
				+ "And now it's all right, that's okay \n"
				+ "And you may look the other way \n"
				+ "We can try to understand \n"
				+ "The New York Times' effect on man\n"
				+ "\n"
				+ "Whether you're a brother or whether you're a mother \n"
				+ "You're stayin' alive, stayin' alive \n"
				+ "Feel the city breakin' and everybody shakin' \n"
				+ "And we're stayin' alive, stayin' alive \n"
				+ "Ah, ha, ha, ha, stayin' alive, stayin' alive \n"
				+ "Ah, ha, ha, ha, stayin' alive \n"
				+ "Oh when you walk\n"
				+ "\n"
				+ "Well now, I get low and I get high \n"
				+ "And if I can't get either, I really try \n"
				+ "Got the wings of heaven on my shoes \n"
				+ "I'm a dancin' man and I just can't lose\n"
				+ "\n"
				+ "You know it's all right, it's okay \n"
				+ "I'll live to see another day \n"
				+ "We can try to understand \n"
				+ "The New York Times' effect on man\n"
				+ "\n"
				+ "Whether you're a brother or whether you're a mother \n"
				+ "You're stayin' alive, stayin' alive \n"
				+ "Feel the city breakin' and everybody shakin' \n"
				+ "And we're stayin' alive, stayin' alive \n"
				+ "Ah, ha, ha, ha, stayin' alive, stayin' alive \n"
				+ "Ah, ha, ha, ha, stayin' alive\n"
				+ "\n"
				+ "Life goin' nowhere, somebody help me \n"
				+ "Somebody help me, yeah \n"
				+ "Life goin' nowhere, somebody help me, yeah \n"
				+ "I'm stayin' alive\n"
				+ "\n"
				+ "Well, you can tell by the way I use my walk \n"
				+ "I'm a woman's man, no time to talk \n"
				+ "Music loud and women warm \n"
				+ "I've been kicked around since I was born\n"
				+ "\n"
				+ "And now it's all right, it's okay \n"
				+ "And you may look the other way \n"
				+ "We can try to understand \n"
				+ "The New York Times' effect on man\n"
				+ "\n"
				+ "Whether you're a brother or whether you're a mother \n"
				+ "You're stayin' alive, stayin' alive \n"
				+ "Feel the city breakin' and everybody shakin' \n"
				+ "And we're stayin' alive, stayin' alive \n"
				+ "Ah, ha, ha, ha, stayin' alive, stayin' alive \n"
				+ "Ah, ha, ha, ha, stayin' alive\n"
				+ "\n"
				+ "Life goin' nowhere, somebody help me \n"
				+ "Somebody help me, yeah \n"
				+ "Life goin' nowhere, somebody help me, yeah \n"
				+ "I'm stayin' alive \n"
				+ "Life goin' nowhere, somebody help me \n"
				+ "Somebody help me, yeah \n"
				+ "Life goin' nowhere, somebody help me, yeah \n"
				+ "I'm stayin' alive \n"
				+ "Life goin' nowhere, somebody help me \n"
				+ "Somebody help me, yeah \n"
				+ "Life goin' nowhere, somebody help me, yeah \n"
				+ "I'm stayin' alive \n"
				+ "Life goin' nowhere, somebody help me \n"
				+ "Somebody help me, yeah \n"
				+ "Life goin' nowhere, somebody help me, yeah \n"
				+ "I'm stayin' alive");
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
