/*
 * Programmed by: Andra Liu
 * Date: 10/22/18
 * Description: This program draws a sun and sky during day and night
 * Period: 5
 * Version: 1
*/

import java.awt.*; //imports java library classes
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MovingDisk extends JPanel implements ActionListener { //MovingDisk class
	private int time; //integer variable called time

	public MovingDisk() { //MovingDisk constructor
		//creating and starting new timer
		time = 0;
		Timer clock = new Timer(30, this);
		clock.start();
	}

	public void paintComponent(Graphics g) { //paintComponent method
		//creating variables for the sky color and sun
		int x = 150 - (int) (100 * Math.cos(0.005 * Math.PI * time));
		int y = 130 - (int) (75 * Math.sin(0.005 * Math.PI * time));
		int r = 20;
		
		int x1 = time*2;
		int y1 = 50;

		//local variable
		Color sky;
	
		//if circle goes off the screen, background turns black
		if (y > 130)
			sky = Color.BLACK;
		else //if circle is on the screen, background is blue
			sky = Color.CYAN;
		setBackground(sky);
		super.paintComponent(g);

		// draws the sun
		g.setColor(Color.ORANGE);
		g.fillOval(x - r, y - r, 2 * r, 2 * r);
		
		/*
		// draws the sun #2
		g.setColor(Color.WHITE);
		g.fillOval(x - 5*r, y - r, 2 * r, 2 * r);
		// draws the sun #2
		g.setColor(Color.RED);
		g.fillOval(x - 9*r, y - r, 2 * r, 2 * r);
		//draws clouds
		g.setColor(Color.WHITE);
		g.fillOval(x1, y1, 50, 25);
		g.fillOval(x1 - 30, y1, 50, 25);
		*/
	}

	public void actionPerformed(ActionEvent e) { // actionPerformed method
		// adds to time
		time++;
		repaint();
	}

	public static void main(String args[]) { //main method
		//creating new JFrame
		JFrame w = new JFrame("Moving Disk");
		w.setSize(300, 150);
		//w.setSize(300, 300);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creating new container
		Container c = w.getContentPane();
		c.add(new MovingDisk());
		c.add(new MovingDisk());
		
		//setting JFrame's properties
		w.setResizable(false);
		w.setVisible(true);
	}
}