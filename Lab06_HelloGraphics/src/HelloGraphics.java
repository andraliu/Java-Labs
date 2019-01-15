
//This program shows simple graphics in a window.

import java.awt.*; //imports everything in the java.awt package
import javax.swing.*; 

public class HelloGraphics extends JPanel //name of class
{
	public void paintComponent(Graphics g) //public void means you do not recieve output when the program is run
	{
		super.paintComponent(g);  // Call JPanel's paintComponent method
		                          //  to paint the background
		g.setColor(Color.BLUE); //sets rectangle color to blue
		
		// Draw a 150 by 45 rectangle that is always centered
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		//int xCenterrr =  xCenter - 50;
		//int yCenterrr = yCenter - 50;
		
		//g.drawRect(xCenter - 75, yCenter - 22, 150, 45);
		g.fillRect(xCenter - 75, yCenter - 22, 150, 45);
		
		g.setColor(Color.WHITE); // makes text white
		//g.setColor(Color.YELLOW);
		
		//Write "Ice Cream" and center it
		g.drawString("Ice cream", xCenter - 30, yCenter + 5);
		}
		
		public static void main(String[] args)
		{
		JFrame window = new JFrame("No more graphics"); //creates window
		// Set this window's location and size:
		// upper-left corner at 300, 300; width 400, height 300
		window.setBounds(300, 300, 400, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes window when pressed on x
		
		HelloGraphics panel = new HelloGraphics();
		panel.setBackground(Color.WHITE);  // the default color is light gray
		Container c = window.getContentPane();
		c.add(panel);
		
		window.setVisible(true);
	}
}


