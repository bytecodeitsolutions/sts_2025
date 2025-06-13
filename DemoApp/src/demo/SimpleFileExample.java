package demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class SimpleFileExample {
	public static void main(String[] args) {
		try {
			// Create a File object
			File file = new File("data.txt");

			/// Write data to the file using
			Writer writer = new FileWriter(file);
			writer.write("Hello Java!\n");
			writer.write("This is a simple file write-read example.");
			writer.close();
			System.out.println("Data written successfully.");

			// Read data from the file using FileReader
			Reader reader = new FileReader(file);
			int ch;
			System.out.println("\nReading from file:");
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
			reader.close();

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
