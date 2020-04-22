package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
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
	button.setText("Ducks");
	frame.pack();
	button.addActionListener(this);
	panel.add(button2);
	button2.setText("Frogs");
	frame.pack();
	button2.addActionListener(this);
	panel.add(button3);
	button3.setText("FluffyUnicrons");
	frame.pack();
	button3.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if (buttonPressed==button) {
		showDucks();
	}
	else if (buttonPressed==button2) {
		showFrog();
	}
	else if (buttonPressed==button3) {
		showFluffyUnicorns(); 
	}
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
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
}
