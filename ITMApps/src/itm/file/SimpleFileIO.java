package itm.file;

import java.io.*;

public class SimpleFileIO {
    public static void main(String[] args) {
        String fileName = "simple.txt";
        String data = "Hello, writing and reading file using simple IO classes.";

        // Writing to file
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(data.getBytes());   // convert string to bytes
            fos.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing.");
            e.printStackTrace();
        }

        // Reading from file
        try {
            FileInputStream fis = new FileInputStream(fileName);
            int i;
            System.out.println("File content:");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);   // convert byte back to char
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error while reading.");
            e.printStackTrace();
        }
    }
}
