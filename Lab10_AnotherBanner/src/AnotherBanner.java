
// This applet displays a message moving horizontally
// across the screen.
import java.awt.Color; //imports java awt package
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet; //imports javax swing package
import javax.swing.Timer;

public class AnotherBanner extends JApplet implements ActionListener { //main class
	private int msgID = 1; //creates variable called msgID

	private int yPos; // hold the coordinates of the banner
	private int xPos = 210; //the coordinates of the x Position
	
	int passed = 0; //creating new int passed to keep track of how many times the timer goes off

	public void init() { 
		repaint();
		Container c = getContentPane(); //creates container c
		c.setBackground(Color.WHITE); //sets background color to white
		
		//xPos = xPos - 100;
		//yPos = yPos;
		yPos = c.getHeight() / 2; //sets y Position to height of container c divided by two to get the center
		Timer clock = new Timer(10, this); // fires every 30 milliseconds
		clock.start(); //starts clock
	}

	// Called automatically after a repaint request
	public void paint(Graphics g) {
		//super.paint(g);

		Container c = getContentPane(); 
		 yPos = c.getHeight() / 2; //sets y Position to height of container c divided by two to get the center

		
		if (msgID == 1) { //setting 1 to the east or west text
			super.paint(g);
			//xPos = xPos - 5;
			g.drawString("East or West", xPos, yPos); //draws the text: East or West
		} else // if msgID == -1 //setting -1 to the java is best text
		{
			super.paint(g);
			//xPos = xPos - 5;
			g.drawString("Java is Best", xPos, yPos); //draws the text: Java is Best
		}

	}

	// Called automatically when the timer fires
	public void actionPerformed(ActionEvent e) {
		
		passed++; //adding 1 to the variable passed
		if(passed == 200) { //if passed is equal to 200 then msgID changes to -msgID, which changes the text
			passed = 0; //resetting passed to 0
			msgID = -msgID;
		}
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
