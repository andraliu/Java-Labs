
// Question 2-13-b

import java.awt.*; //imports everything in the java.awt package
import javax.swing.*;

/**
 * This program displays a bulls eye
 */

public class BullsEye extends JPanel // class name is BullsEye
{

	public void paintComponent(Graphics g) // public void means you do not receive output when the program is run
	{
		super.paintComponent(g); // Call JPanel's paintComponent method
									// to paint the background
		int xCenter = getWidth() / 2; // gets the x value of the center of the window
		int yCenter = getHeight() / 2; // gets the y value of the center of the window

		int xCenterrrr = xCenter - 150; //helps center the large circle
		int yCenterrrr = yCenter - 150; //helps center the large circle

		int xCenterrr = xCenter - 84; //helps center the medium circle
		int yCenterrr = yCenter - 84; //helps center the medium circle

		int xCenterr = xCenter - 25; //helps center the small circle
		int yCenterr = yCenter - 25; //helps center the small circle

		g.setColor(Color.RED); // setting circle color to black
		g.fillOval(xCenterrrr, yCenterrrr, 300, 300); //draws the largest centered circle

		g.setColor(Color.WHITE); //sets circle color to white
		g.fillOval(xCenterrr, yCenterrr, 168, 168); //draws the medium centered circle

		g.setColor(Color.RED); //sets circle color to black
		g.fillOval(xCenterr, yCenterr, 50, 50); //draws the small centered circle

		//g.fillOval(xCenterr, yCenterr - 53, 50, 50);
		//g.fillOval(xCenterr, yCenterr + 53, 50, 50);
		//g.fillOval(xCenterr + 53, yCenterr, 50, 50);
		//g.fillOval(xCenterr - 53, yCenterr, 50, 50);
		
		//g.setColor(Color.BLACK);
		//g.drawString("Hello Friends", xCenterr - 15, yCenterr - 8);
	}

	public static void main(String[] args) // main string
	{
		JFrame window = new JFrame("Bulls Eye"); // creates new window
		window.setBounds(300, 300, 400, 400); // sets window size
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits the window when pressed on x
		BullsEye panel = new BullsEye(); //creating new panel
		panel.setBackground(Color.WHITE); // sets panel background to white
		Container c = window.getContentPane();
		c.add(panel);
		window.setVisible(true);
	}
}
