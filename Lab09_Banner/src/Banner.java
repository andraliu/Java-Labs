
// This applet displays a message moving horizontally
// across the screen.

import java.awt.*; // impprts java awt package
import java.awt.event.*;
import javax.swing.*;

public class Banner extends JApplet implements ActionListener { //main class
	private int xPos, yPos; // hold the coordinates of the banner

	public void init() {
		Container c = getContentPane(); //creates container c
		c.setBackground(Color.WHITE); // sets background color to white
		xPos = 210; //sets x position
		yPos = c.getHeight() / 2; //sets y position
		Timer clock = new Timer(30, this); // fires every 30 milliseconds
		clock.start(); //starts clock
	}

	// Called automatically after a repaint request
	public void paint(Graphics g) {
		super.paint(g); //paints background
		g.fillRect(xPos, yPos, 50, 20); //creates rectangle
		
		//g.fillRect(xPos, yPos - 30, 50, 20);
		//g.fillRect(xPos, yPos - 60, 50, 20);
		//g.fillOval(xPos, yPos + 30, 50, 50);
		//g.drawString("Andra", xPos, yPos);
	}

	// Called automatically when the timer fires
	public void actionPerformed(ActionEvent e) {
		Container c = getContentPane();

		// Adjust the horizontal position of the banner:
		xPos--;
		if (xPos < -100) {
			xPos = c.getWidth();
		}

		// Set the vertical position of the banner:
		yPos = c.getHeight() / 2;

		repaint();
	}
}
