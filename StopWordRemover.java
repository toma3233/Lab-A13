import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @author Tom Abraham
 * period #1
 *
 */
public class StopWordRemover {
	String stopList;
	String inFile, outFile;
	int maxLineLength;
	/**
	 * Initializes the input and output files and the max characters per line
	 * @param in - input file
	 * @param out - name of output file
	 * @param max - max characters per line (including spaces)
	 * @param stop - name of stopWords file
	 */
	public StopWordRemover(String in, String out, String stop, int max) {
		inFile = in;
		outFile = out;
		maxLineLength = max;
		
		File stopWords = new File(stop);
		Scanner sc;
		try {
			sc = new Scanner(stopWords);
			while (sc.hasNext()) {
				stopList = stopList + " " + sc.next() + " ";
			}
			sc.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
	/**
	 * Removes the stop words and outputs the text to a file
	 * Each line of output is not more than max characters long
	 * @return the number of words removed
	 */
	public int removeStopWords() {
		try {
			Scanner scan = new Scanner(new File(inFile));
			if (!scan.hasNext()) {
				System.out.println("Error: " + inFile + " is empty");
				return 0;
			}
			int amountLeft = 0;
			String textOfNewFile = "";
			boolean hasNewLine = false;
			int length = 0;
			
			while (scan.hasNext()) {
				String word = scan.next();
				boolean hasWord = false;
				Scanner scan2 = new Scanner(stopList);
				
				while (scan2.hasNext()) {
					if ((" " + word + " ").toLowerCase().equals(" " + scan2.next() + " ")) {
						hasWord = true;
					}
				}
				boolean isEndOfLine = false;
				if (!scan.hasNext()) {
					isEndOfLine = true;
				}
				if (!hasWord) {
					length += word.length();
					if (hasNewLine) {
						if (isEndOfLine) {
							textOfNewFile += word;
						}
						else {
							textOfNewFile += word + " ";
						}
						hasNewLine = false;
						length++;
					} 
					else if (length < maxLineLength) {
						if (isEndOfLine) {
							textOfNewFile += word;
						} 
						else {
							textOfNewFile += word + " ";
						}
						length++;
					} 
					else {
						textOfNewFile = textOfNewFile.substring(0, textOfNewFile.length() - 1);
						textOfNewFile += "\n" + word + " ";
						hasNewLine = true;
						length = word.length() + 1;
					}
				} 
				else {
					amountLeft++;
				}
			}
			try {
				FileWriter newFile = new FileWriter(new File(outFile));
				newFile.write(textOfNewFile, 0, textOfNewFile.length());
				newFile.close();
			} 
			catch (FileNotFoundException e) {
				System.out.println("Error: " + e.getMessage());
			}
			return amountLeft++;
		} 
		catch (IOException f) {
			System.out.println("Error: " + f.getMessage());
			return 0;
		}

	}
}
