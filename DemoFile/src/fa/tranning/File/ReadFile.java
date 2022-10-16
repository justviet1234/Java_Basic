package fa.tranning.File;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	public static void main(String args[]) throws IOException {
		// attach the file to FileInputStream
		FileInputStream fin = new FileInputStream("/data.txt");
		System.out.println("Number of remaining bytes:" + fin.available());
		// illustrating skip method
		/*
		 * Original File content: This is my first line This is my second line
		 */
		fin.skip(5);
		System.out.println("FileContents :");
		// read characters from FileInputStream and write them
		int ch;
		while ((ch = fin.read()) != -1)
			System.out.print((char) ch);
		// close the file
		fin.close();
	}
}
