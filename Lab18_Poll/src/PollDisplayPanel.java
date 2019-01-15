// A PollDisplayPanel holds the vote counts and
// displays the numbers and the pie chart for
// the current vote counts.

/*
 * Programmed by: Andra Liu
 * Lab: Poll
 * Date: 11/7/18
 * Description: This program creates a poll
 * Period: 5
 * Version: 1
*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PollDisplayPanel extends JPanel {
	private String name1, name2, name3;
	private int count1, count2, count3;

	// Constructor
	public PollDisplayPanel(String nm1, String nm2, String nm3) {
		setBackground(Color.WHITE);
		name1 = nm1;
		name2 = nm2;
		name3 = nm3;
		count1 = 0; // optional
		count2 = 0; // optional
		count3 = 0; // optional
	}

	// Increments count1
	public void vote1() {
		count1++;
		System.out.println(this);
	}

	// Increments count2
	public void vote2() {
		count2++;
		System.out.println(this);
	}

	// Increments count3
	public void vote3() {
		count3++;
		System.out.println(this);
	}

	// Returns a string representation of this object
	public String toString() {
		return "Tami: " + count1 + " Brian: " + count2 + " Liz: " + count3;
	}

	// Redefines JPanel's paintComponent to draw this pie chart
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int w = getWidth();
		int h = getHeight();
		int x = w / 2;
		int y = h / 2;
		int r = Math.min(w, h) / 4;
		drawPieChart(g, x, y, r);
		drawScaleGraph(g);
		drawLegend(g, x, y, r);
	}

	private void drawPieChart(Graphics g, int x, int y, int r) { //draws pie chart
		int total = count1 + count2 + count3;
		int fromDegree = 0;

		if (total > 0) {
			int degrees;
			int degrees2;
			degrees = countToDegrees(count1, total);
			degrees2 = countToDegrees(count2, total);
			
			g.setColor(Color.RED);
			drawSector(g, x, y, r, fromDegree + 360 - (degrees + degrees2), degrees);

			g.setColor(Color.GREEN);
			drawSector(g, x, y, r, fromDegree + 360 - (degrees + degrees2) + degrees, degrees2);
			
			g.setColor(Color.BLUE);
			drawSector(g, x, y, r, fromDegree + 360 - (degrees + degrees2) + degrees + degrees2, 360 - (degrees + degrees2));

		} else {
			g.setColor(Color.LIGHT_GRAY);
			drawSector(g, x, y, r, fromDegree, 360);
		}
	}
	
	private void drawScaleGraph(Graphics g) { //draws bar chart
		int total = count1 + count2 + count3;
		int totalLength = 300;
		int yPosition = getHeight()/4 - 50;
		int widthOfBar = 30;
		double width1 = (double)count1 / (double)total * (double)totalLength;
		double width2 = (double)count2 / (double)total * (double)totalLength;
		double width3 = (double)totalLength - (double)width1 - (double)width2;

		if (total > 0) {
			// draws red portion of scale graph
			g.setColor(Color.RED);
			g.fillRect(getWidth() / 2 - totalLength / 2, yPosition, (int) width1, widthOfBar);

			// draws green portion of scale graph
			g.setColor(Color.GREEN);
			g.fillRect(getWidth() / 2 - totalLength / 2 + (int) width1, yPosition, (int) width2, widthOfBar);

			// draws blue portion of scale graph
			g.setColor(Color.BLUE);
			g.fillRect(getWidth() / 2 - totalLength / 2 + (int) width1 + (int) width2, yPosition, (int) width3, widthOfBar);
		} else {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(getWidth() / 2 - totalLength / 2, yPosition, totalLength, widthOfBar);
		}
	}

	// Draws the vote counts and the corresponding color squares.
	private void drawLegend(Graphics g, int x, int y, int r) {
		// Display the counts:
		y += (r + 20);
		g.setColor(Color.BLACK);

		g.drawString(count1 + "", x - r, y);
		g.drawString(count2 + "", x, y);
		g.drawString(count3 + "", x + r, y);

		// Display the color squares:
		y += 5;
		x -= 2;
		g.setColor(Color.RED);
		g.fillRect(x - r, y, 10, 10);
		g.setColor(Color.GREEN);
		g.fillRect(x, y, 10, 10);
		g.setColor(Color.BLUE);
		g.fillRect(x + r, y, 10, 10);
	}

	// Returns the number of degrees in a pie slice that
	// corresponds to count / total, rounded to the nearest integer.
	private int countToDegrees(int count, int total) {
		double degrees = 0.5 + 360 * (double) count / (double) total;
		return (int) degrees;
	}

	// Draws a sector, centered at x, y, of radius r,
	// of angle measure degrees, starting at fromDegree.
	private void drawSector(Graphics g, int x, int y, int r, int fromDegree, int degrees) {
		if (degrees > 359)
			g.fillOval(x - r, y - r, 2 * r, 2 * r);
		else
			g.fillArc(x - r, y - r, 2 * r, 2 * r, fromDegree, degrees);
	}
}
