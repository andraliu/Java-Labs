/*
 * Programmed by: Andra Liu
 * Date: 10/22/18
 * Description: This program draws a multicolored house
 * Period: 5
 * Version: 2.0
 * Version notes: First version didn't run, version 2 is another attempt
*/

import java.awt.*; //imports java awt package
import javax.swing.*; //imports javax swing package

public class BadStyle1 extends JPanel { //JPanel is the superclass of BadStyle1
	
	public void paintComponent(Graphics GRAPHICS) { //paintComponent method draws the house
		//calls paintComponent method
		super.paintComponent(GRAPHICS);
		
		//draws green chimney on house
		GRAPHICS.setColor(Color.GREEN);
		GRAPHICS.fillRect(120, 20, 17, 40);
		
		//draws chimney #2 - top right corner
		GRAPHICS.setColor(Color.BLUE);
		GRAPHICS.fillRect(320, 20, 17, 40);
		//draws chimney #3 - bottom left corner
		GRAPHICS.setColor(Color.RED);
		GRAPHICS.fillRect(120, 220, 17, 40);
		
		
		
		//draws red rectangular base of house
		GRAPHICS.setColor(Color.RED);
		GRAPHICS.fillRect(30, 40, 130, 45);
		
		//draws base #2 - top right corner
		GRAPHICS.setColor(Color.GREEN);
		GRAPHICS.fillRect(230, 40, 130, 45);
		//draws base #3 - bottom left corner
		GRAPHICS.setColor(Color.BLUE);
		GRAPHICS.fillRect(30, 240, 130, 45);
		
		
		
		//draws blue triangular roof of house
		GRAPHICS.setColor(Color.BLUE);
		Polygon thisIsAPolygon = new Polygon();
		thisIsAPolygon.addPoint(30, 40);
		thisIsAPolygon.addPoint(160, 40);
		thisIsAPolygon.addPoint(95, 20);
		GRAPHICS.fillPolygon(thisIsAPolygon);
		
		// draws roof #2 - top right corner
		GRAPHICS.setColor(Color.RED);
		Polygon thisIsAPolygon2 = new Polygon();
		thisIsAPolygon2.addPoint(230, 40);
		thisIsAPolygon2.addPoint(360, 40);
		thisIsAPolygon2.addPoint(295, 20);
		GRAPHICS.fillPolygon(thisIsAPolygon2);
		// draws roof #3 - bottom left corner
		GRAPHICS.setColor(Color.GREEN);
		Polygon thisIsAPolygon3 = new Polygon();
		thisIsAPolygon3.addPoint(30, 240);
		thisIsAPolygon3.addPoint(160, 240);
		thisIsAPolygon3.addPoint(95, 220);
		GRAPHICS.fillPolygon(thisIsAPolygon3);
		
	}

	public static void main(String[] args) {
		//creating new window
		JFrame window = new JFrame("Graphics Demo");
		window.setBounds(300, 300, 200, 150);
		//window.setBounds(300, 300, 400, 400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//creating new panel
		BadStyle1 panel = new BadStyle1();
		panel.setBackground(Color.WHITE);
		Container c = window.getContentPane();
		c.add(panel);
		window.setVisible(true);
	}
}
