import java.awt.Graphics; //imports java awt classes
import java.awt.Color; //tells compiler where to find the libraries that contain the methods
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame; //imports javax swing classes
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class WalkerTest extends JPanel //WalkerTest is a subclass of JPanel
{
  private Image shoe; //creating field shoe
  private Image shoe2; //creating field shoe2

  // Constructor
  public WalkerTest()
  {
    shoe = (new ImageIcon("leftshoe.gif")).getImage(); //sets shoe to leftshoe.gif
    shoe2 = (new ImageIcon("rightshoe.gif")).getImage(); //sets shoe2 to rightshoe.gif
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g); //calls superclass' paintComponent method

    int x = 300; //sets x to 300
    int y = 100; //sets y to 100
    int stepLength = 100; //sets stepLength to 100

    
    //part a  

    Walker walker1 = new Walker(x, y, shoe, shoe2); //creates new walker using constructor from Walker.java
    walker1.draw(g); //draws the walker
    
    walker1.firstStep(); //walker takes first step
    walker1.nextStep(); //walker takes next step
    walker1.stop(); //walker stops
    walker1.draw(g); //draws the position at which the walker stopped
    
    walker1.firstStep();
    walker1.nextStep();
    walker1.stop();
    walker1.draw(g);
    
    walker1.firstStep();
    walker1.nextStep();
    walker1.stop();
    walker1.draw(g);

    
    
 
    
    //part b
/*   
    Walker walker1 = new Walker(x, y, shoe, shoe2); //creates new walker using constructor from Walker.java
    walker1.draw(g); //draws new walker
    
    walker1.firstStep(); //walker takes first step
    walker1.nextStep(); //walker takes another step
    walker1.stop(); //walker stops
    walker1.draw(g); //program draws the walker at where it stopped
    
    walker1.firstStep();
    walker1.nextStep();
    walker1.stop();
    
    walker1.firstStep();
    walker1.nextStep();
    walker1.stop();
    walker1.draw(g);
*/    
    
    
    //extra
/*
    Walker walker1 = new Walker(x, y, shoe, shoe2); //creates new walker using constructor from Walker.java
    walker1.firstStep();
    
    for (int count = 1; count <= 10; count++)
    {
    walker1.nextStep();
    walker1.draw(g);
    }

 */ 
    
    
  
//Draw a cursor at the expected center of the first "shoe":
  g.drawLine(x - 50, y, x + 50, y);
  g.drawLine(x, y - 50, x, y + 50);
  
}

  public static void main(String[] args) //main method
  {
    JFrame window = new JFrame("Feet"); //creating new JFrame
    window.setBounds(100, 100, 500, 480); //sets window bounds 
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes window when X is pressed

    WalkerTest panel = new WalkerTest(); //creating new panel
    panel.setBackground(Color.WHITE); //sets background to white
    Container c = window.getContentPane(); 
    c.add(panel);

    window.setVisible(true);
  }
}




//questions
/*
1.Which class is Foot a subclass of?
		
		Foot is a subclass of CoordinateSystem.
	
2.Does class Walker encapsulate functionality? If so, what does it encapsulate?

		Yes, class Walker encapsulates functionality. It encapsulates getLeftFoot, getRightFoot, firstStep, nextStep, stop, distanceTraveled, and draw methods.
		
*/