package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public void actionPerformed(ActionEvent e) {
	
	
}
}
