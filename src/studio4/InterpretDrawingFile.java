package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); // making Scanner with a File

		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double d1 = in.nextDouble();
		double d2 = in.nextDouble();
		double d3 = in.nextDouble();
		double d4 = in.nextDouble();
		

		if (shapeType.equals("rectangle")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			StdDraw.filledRectangle(d1, d2, d3, d4);
		} else if (shapeType.equals("ellipse")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if (isFilled == true) {
				StdDraw.filledEllipse(d1, d2, d3, d4);
			} else {
				StdDraw.ellipse(d1, d2, d3, d4);
			}
		} else if (shapeType.equals("triangle")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			double d5 = in.nextDouble();
			double d6 = in.nextDouble();
			if (isFilled == true) {
				double[] xs = { d1, d3, d5 };
				double[] ys = { d2, d4, d6 };
				StdDraw.filledPolygon(xs, ys);
			} else {
				double[] xs = { d1, d3, d5 };
				double[] ys = { d2, d4, d6 };
				StdDraw.polygon(xs, ys);

			}
		}
	}
}

//purple outline ellipse 73 0 146 false 0.5 0.5 0.2 0.2
//rectangle 0 0 0 false 0.5 0.5 0.2 0.2