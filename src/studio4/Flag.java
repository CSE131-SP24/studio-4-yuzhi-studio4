package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(13, 94, 175);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0.5, 0.7, 0.5, 0.03);
		StdDraw.filledRectangle(0.5, 0.57, 0.5, 0.03);
		StdDraw.filledRectangle(0.5, 0.44, 0.5, 0.03);
		StdDraw.filledRectangle(0.5, 0.31, 0.5, 0.03);
		
		StdDraw.setPenColor(13, 94, 175);
		StdDraw.filledSquare(0.15, 0.65, 0.15);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0.15, 0.635, 0.15, 0.035);
		StdDraw.filledRectangle(0.15, 0.635, 0.035, 0.165);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.3);


	}
}