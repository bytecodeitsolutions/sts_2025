package demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

	public static void main(String[] args) {
		Properties properties = new Properties();

		try (InputStream input = PropertiesReader.class.getClassLoader().getResourceAsStream("config.properties")) {

			if (input == null) {
				System.out.println("Sorry, unable to find config.properties");
				return;
			}

			// load the properties file
			properties.load(input);

			// read properties
			String appName = properties.getProperty("app.name");
			String version = properties.getProperty("app.version");
			String author = properties.getProperty("app.author");

			System.out.println("App Name: " + appName);
			System.out.println("Version: " + version);
			System.out.println("Author: " + author);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
