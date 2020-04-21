package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class jackInTheBox implements ActionListener {
	JButton button = new JButton();

	public void run() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button);
		button.setText("Suprise");
		frame.pack();
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		int i = 0;
			if (buttonPressed == button) {
				i = i + 1;
				
		}
			System.out.println(i);
		if (i == 5) {
			showPicture("jackInTheBox.png");
		}
	}

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setSize(500, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			java.net.URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}
}
