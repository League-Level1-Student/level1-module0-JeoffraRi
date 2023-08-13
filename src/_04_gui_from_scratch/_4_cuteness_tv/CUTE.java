package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CUTE implements ActionListener {
	
	
	public static void main(String[] args) {
		CUTE cute = new CUTE();
	}
	
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	CUTE(){
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		button.setText("waddlewaddle");
		button.addActionListener(this);
		button2.setText("croakcroak");
		button2.addActionListener(this);
		button3.setText("neighneigh");
		button3.addActionListener(this);
		panel.add(button);
		frame.pack();
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=HXMrrjfUKR4");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent buttonData) {
		System.out.println("this button works");
		if(buttonData.getSource()==button) {
			showDucks();
		}
		if(buttonData.getSource()==button2) {
			showFrog();
		}
		if(buttonData.getSource()==button3) {
			showFluffyUnicorns();
		}
	}
}
