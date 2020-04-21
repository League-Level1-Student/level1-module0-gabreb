package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	        public void showButton() {
	            System.out.println("Button clicked");
	            JFrame frame = new JFrame(); 
	            frame.setVisible(true);
	            JButton button = new JButton();
	            frame.add(button);
	            frame.pack(); 
	            button.addActionListener(this);
	          
	    }

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int randy = new Random().nextInt(5);
				JOptionPane.showMessageDialog(null, "Woohoo");
				if (randy == 0) {
					JOptionPane.showMessageDialog(null, "You shall stop coding for eternity!");
				}
				else if (randy == 1) {
					JOptionPane.showMessageDialog(null, "You shall hire Gaby to code 4 u");
				}
				else if (randy == 2) {
					JOptionPane.showMessageDialog(null, "You shall praise Gaby and tell him how great he is!");
				}
				else if (randy == 3) {
					JOptionPane.showMessageDialog(null, "You love someone you don't know yet!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Gaby is your superior!");
				}
			}
}
