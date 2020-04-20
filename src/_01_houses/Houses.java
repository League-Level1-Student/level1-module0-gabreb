package _01_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	static int height = 0;

	void run() {
		rob.setSpeed(40);
		rob.setX(60);
		rob.setY(540);
		rob.penDown();
		for (int i = 0; i < 10; i++) {
			String houseSize = JOptionPane.showInputDialog("Do you want a small, medium, or large house?");
			if (houseSize.equalsIgnoreCase("small")) {
				height = 60;
			} else if (houseSize.equalsIgnoreCase("medium")) {
				height = 120;
			} else if (houseSize.equalsIgnoreCase("large")) {
				height = 250;
			}
			String color = JOptionPane.showInputDialog("What color of the basic rainbow do you want your house?");
			if (color.equalsIgnoreCase("red")) {
				rob.setPenColor(Color.red);
			} else if (color.equalsIgnoreCase("orange")) {
				rob.setPenColor(Color.orange);
			} else if (color.equalsIgnoreCase("yellow")) {
				rob.setPenColor(Color.yellow);
			} else if (color.equalsIgnoreCase("green")) {
				rob.setPenColor(Color.green);
			} else if (color.equalsIgnoreCase("blue")) {
				rob.setPenColor(Color.blue);
			} else if (color.equalsIgnoreCase("purple")) {
				rob.setPenColor(Color.magenta);
			} else {
				rob.setRandomPenColor();
			}
			if (height==250) {
				drawFlatRoof();
			}
			else {
				drawPointyRoof();
			}
		}
	}

	public static void drawPointyRoof() {
		rob.move(height);
		rob.turn(30);
		rob.move(20);
		rob.turn(120);
		rob.move(20);
		rob.turn(30);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(10);
		rob.turn(-90);
	}
	public static void drawFlatRoof() {
		rob.move(height);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(10);
		rob.turn(-90);
	}

}
