package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachines implements ActionListener {
	JButton button = new JButton();
	JButton button2 = new JButton(); 
	JButton button3 = new JButton(); 
public void run() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(button);
	button.setText("B1");
	frame.pack();
	button.addActionListener(this);
	panel.add(button2);
	button2.setText("B2");
	frame.pack();
	button2.addActionListener(this);
	panel.add(button3);
	button3.setText("B3");
	frame.pack();
	button3.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if (buttonPressed==button) {
		playSound("hi.wav");
	}
	else if (buttonPressed==button2) {
		playSound("cat.wav"); 
	}
	else if (buttonPressed==button3) {
		playSound("fun.wav");
	}
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}
}









