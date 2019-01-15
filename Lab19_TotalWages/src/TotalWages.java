/*
 * Programmed by: Andra Liu
 * Date: 11/27/18
 * Description: This program calculates wages.
 * Period: 5
 * Version: 1
*/

/*
 * 1. comments
 * 2. header
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class TotalWages extends JFrame //total wages class
    implements ActionListener
{
  private JTextField inputHours, inputRate, display; //declaring fields
  private DecimalFormat money = new DecimalFormat("$0.00");

  public TotalWages() //creates window and graphical features for program
  {
    super("Wages Calculator");

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3,2));

    panel.add(new JLabel("   Hours worked:"));
    inputHours = new JTextField(5);
    inputHours.setHorizontalAlignment(JTextField.RIGHT);
    panel.add(inputHours);

    panel.add(new JLabel("   Hourly rate:"));
    inputRate = new JTextField(5);
    inputRate.setHorizontalAlignment(JTextField.RIGHT);
    panel.add(inputRate);

    panel.add(new JLabel("   Total wages:"));
    display = new JTextField(20);
    display.setHorizontalAlignment(JTextField.RIGHT);
    display.setEditable(false);
    display.setBackground(Color.yellow);
    panel.add(display);

    JButton calc = new JButton("Calculate wages");
    calc.addActionListener(this);

    Container c = getContentPane();
    c.add(panel, BorderLayout.CENTER);
    c.add(calc, BorderLayout.SOUTH);
  }

  public double totalWages(double hours, double rate) //calculates wage using hour and rate
  {
    double wages;
    
    //if hours worked is 0
    if(hours == 0) {
    	wages = 0;
    }
    
    //if hours worked is less than or equal to 40
    if(hours > 0 && hours <= 40)
    {
    	wages = hours*rate;
    }
    else //if hours worked is greater than 40
    {
    	wages = (40 * rate) + (hours - 40) * (rate * 1.5);
    }
    
    return wages;
  }

  public void actionPerformed(ActionEvent e)
  {
    String s = inputHours.getText();
    double hours = Double.parseDouble(s);
    s = inputRate.getText();
    double rate = Double.parseDouble(s);
    double wages = totalWages(hours, rate);
    display.setText(money.format(wages));
    
    //if wages are negative
   if(wages < 0) {
	   display.setText("Try entering a different number. Negative numbers are not valid.");
   }
   
   //if wages are between 100 and 200 including 100
   if(wages >= 100 && wages < 200) {
	   display.setText(money.format(wages) + " You're rich!");
   }
   
   //if wages are between 200 and 300 including 200
   if(wages >= 200 && wages < 300) {
	   display.setText(money.format(wages) + " Give me all your money.");
   }
   
   //if wages are above 300 including 300
   if(wages >= 300) {
	   display.setText(money.format(wages) + " You're the next Bill Gates!");
   }
  }

  public static void main(String[] args) //main method
  {
    TotalWages window = new TotalWages();
    window.setBounds(300, 300, 200, 150);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}
