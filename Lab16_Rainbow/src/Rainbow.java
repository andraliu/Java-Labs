/*
 * Programmed by: Andra Liu
 * Date: 10/31/18
 * Description: This program draws a rainbow
 * Period: 5
 * Version: 1
*/

//import statements
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Rainbow extends JPanel // Rainbow class
 implements ActionListener
{
	// Declare skyColor:
	private final Color skyColor = Color.CYAN;
	private int time;

	// rainbow constructor
	public Rainbow() {
		setBackground(skyColor);
		
		time = 0;
  		Timer clock = new Timer(30, this);
  		clock.start();
	}

	// draws the rainbow
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// declaring variables getWidth and getHeight
		int width = getWidth();
		int height = getHeight();

		// declaring local variables to draw arcs
		int xCenter = width / 2;
		int yCenter = height * 3 / 4;
		int radius = width / 4;

		// draws largest arc
		g.setColor(Color.RED);
		g.fillArc(xCenter - radius, yCenter - radius, radius * 2, radius * 2, 0, 180);

		// draws another arc
		Color myOrange = new Color(255, 165, 0);
		g.setColor(myOrange);
		g.fillArc(xCenter - 7 * radius / 8, yCenter - 7 * radius / 8, 7 * radius / 4, 7 * radius / 4, 0, 180);

		// draws second largest arc
		g.setColor(Color.GREEN);
		g.fillArc(xCenter - 3 * radius / 4, yCenter - 3 * radius / 4, 3 * radius / 2, 3 * radius / 2, 0, 180);

		// draws another arc
		Color myBlue = new Color(0, 0, 255);
		g.setColor(myBlue);
		g.fillArc(xCenter - 5 * radius / 8, yCenter - 5 * radius / 8, 5 * radius / 4, 5 * radius / 4, 0, 180);

		// draws medium arc
		g.setColor(Color.MAGENTA);
		g.fillArc(xCenter - radius / 2, yCenter - radius / 2, radius, radius, 0, 180);

		// draws another arc
		Color myPink = new Color(255, 182, 193);
		g.setColor(myPink);
		g.fillArc(xCenter - 3 * radius / 8, yCenter - 3 * radius / 8, 3 * radius / 4, 3 * radius / 4, 0, 180);

		// draws small arc
		g.setColor(Color.CYAN);
		g.fillArc(xCenter - radius / 4, yCenter - radius / 4, radius / 2, radius / 2, 0, 180);

		// draws another arc
		Color myYellow = new Color(255, 255, 0);
		g.setColor(myYellow);
		g.fillArc(xCenter - radius / 8, yCenter - radius / 8, radius / 4, radius / 4, 0, 180);
		
		//draws sun and clouds
		Color myYellowOrange = new Color(255, 250, 0);
		g.setColor(myYellowOrange);
		g.fillOval(time, radius / 3, radius / 3, radius / 3);
		g.setColor(Color.WHITE);
		g.fillOval(time - 12, radius / 3, radius / 3, radius / 7 + 7);
		g.fillOval(time - 15, radius / 3 + 10, radius / 3, radius / 7);
	}
	
	public void actionPerformed(ActionEvent e) { // actionPerformed method
		// adds to time
		time++;
		repaint();
	}

	public static void main(String[] args) // main string
	{
		JFrame w = new JFrame("Rainbow");
		w.setBounds(300, 300, 300, 200);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(new Rainbow());
		w.setVisible(true);
	}
}