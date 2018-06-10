import java.io.*;
import java.util.*;
/**
 * 
 * @author Tom Abraham
 * Period #1
 *
 */
public class Average {
	private File file;
	String fileName;
	/**
	 * Constructor to initialize the file and the fileName
	 * @param file - the file to be read
	 */
	public Average(String file) {
		this.file = new File(file);
		fileName = file;
	}

	/**
	 * Scans data from the file
	 * @return returns the average from all the numbers in the file
	 */
	public double scanDataAndCalculateAverage() {
		try {
			Scanner sc = new Scanner(this.file);
			double count = 0;
			long total = 0;
			double average = 0;
			
			if (!sc.hasNext()) {
				throw new IllegalArgumentException(fileName + " is empty");
			}
			else if (!sc.hasNextInt()) {
				throw new IllegalArgumentException(fileName + " does not have numeric data");
			}
			while (sc.hasNextInt()) {
				total += sc.nextInt();
				count++;
			}
			average = total / count;
			return average;
		}
	   catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			return 0.0;
		}
	}
}
