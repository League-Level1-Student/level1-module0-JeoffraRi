package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import _04_gui_from_scratch._2_jack_in_the_box.Jacksbox;

public class soundeffectsmachiney implements ActionListener {

	public static void main(String[] args) {
		soundeffectsmachiney soundeffectsmachiney = new soundeffectsmachiney();
		soundeffectsmachiney.showButtons();
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
		// TODO Auto-generated method stub
		
	}
	
}
