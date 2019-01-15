import java.awt.Graphics; //imports java awt classes
import java.awt.Color; //tells compiler where to find the methods
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame; //imports javax swing classes
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FootTest extends JPanel //FootTest is a subclass of JPanel
{
  private Image shoe; //field "shoe"

  // Constructor
  public FootTest()
  {
    shoe = (new ImageIcon("leftshoe.gif")).getImage(); //setting image of shoe to leftshoe.gif
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g); //calling superclass' paint component method

    int x = 300; //sets x to 300
    int y = 100; //sets y to 100
    int stepLength = 100; //stepLength set to 100

    
 /*   
    //part a
 
    Foot foot = new Foot(x, y, shoe); //creating new foot
    foot.turn(270); //rotating foot to be vertical

    for (int count = 1; count <= 4; count++) //for each loop a foot gets drawn and then it moves sideways by 100
    {
    	foot.draw(g); //draws foot
    	foot.moveSideways(stepLength); //moves foot sideways
    }

    
    
    
    //part b
 /*
    Foot foot = new Foot(x, y, shoe); //creating new foot

    for (int count = 1; count <= 4; count++) //for loop
    {
      foot.draw(g); //draws the foot
      foot.turn(90); //turns it 90 degrees extra each time
      foot.moveForward(stepLength); //foot moves forward by 100 pixels
      foot.moveSideways(-35); //foot moves sideways
    }
 */
    
    
    
    //extra stuff
/*    
    Foot foot = new Foot(x, y, shoe);

    for (int count = 1; count <= 15; count++)
    {
      foot.draw(g);
      foot.turn(25);
      foot.moveForward(stepLength);
    }
    
    Foot foot1 = new Foot(x, y + 100, shoe);

    for (int count = 1; count <= 10; count++)
    {
      foot1.draw(g);
      foot1.turn(45);
      foot1.moveForward(stepLength);
    }
*/    
    
    
    // Draw a cursor at the expected center of the first "shoe":
    g.drawLine(x - 50, y, x + 50, y); 
    g.drawLine(x, y - 50, x, y + 50);
  }

  public static void main(String[] args) //main method
  {
    JFrame window = new JFrame("Feet"); //creating new JFrame
    window.setBounds(100, 100, 500, 480); //sets window bounds 
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes window when X is pressed

    FootTest panel = new FootTest(); //creating new panel
    panel.setBackground(Color.WHITE); //sets background to white
    Container c = window.getContentPane(); 
    c.add(panel);

    window.setVisible(true);
  }
}