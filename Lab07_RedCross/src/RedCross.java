// Question 2-13-a

import java.awt.*; //imports everything in the java.awt package
import javax.swing.*;

/**
 *  This program displays a red cross on a white
 *  background.
 */

public class RedCross extends JPanel //class name is RedCross
{
  public void paintComponent(Graphics g) //public void means you do not receive output when the program is run
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2; //gets the x value of the center of the window
    int yCenter = getHeight() / 2; //gets the y value of the center of the window
    int xCenterrr = xCenter - 40; //creating a new xCenter variable to create the left horizontal rectangle
    int yCenterrr = yCenter - 40; //creating a new yCenter variable to create the top vertical rectangle
    g.setColor(Color.RED); //setting all rectangles' colors to red
    g.fillRect(xCenter, yCenter, 10, 50); //creates bottom vertical rectangle
    g.fillRect(xCenter, yCenter, 50, 10); //creates right horizontal rectangle
    g.fillRect(xCenterrr, yCenter, 50, 10); //creates left horizontal rectangle
    g.fillRect(xCenter, yCenterrr, 10, 50); //creates top vertical rectangle
    
    //int xCenterr = (xCenter - xCenterrr) / 2;
    //int yCenterr = (yCenter - yCenterrr) / 2;
    //g.fillOval(xCenterr + 20, yCenterr, 20, 20);
    //g.fillOval(xCenterr + xCenter + xCenterr, yCenterr, 20, 20);
    //g.fillOval(xCenterr + 20, yCenter + 50, 20, 20);
    //g.fillOval(xCenterr + xCenter + xCenterr, yCenter + 50, 20, 20);
    
  }

  public static void main(String[] args) //main string
  {
    JFrame window = new JFrame("Red Cross"); //creates new window
    window.setBounds(300, 300, 200, 200); //sets window size
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the window when pressed on x
    RedCross panel = new RedCross();
    panel.setBackground(Color.WHITE); //sets panel background to white
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}

