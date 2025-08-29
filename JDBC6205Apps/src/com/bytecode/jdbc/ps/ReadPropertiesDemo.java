package com.bytecode.jdbc.ps;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();

        try (FileInputStream fis = new FileInputStream("db.properties")) {
            // Load the properties file
            prop.load(fis);

            // Read properties
            String url = prop.getProperty("db.url");
            String user = prop.getProperty("db.user");
            String password = prop.getProperty("db.password");
            String driver = prop.getProperty("db.driver");

            // Print values
            System.out.println("DB URL: " + url);
            System.out.println("User: " + user);
            System.out.println("Password: " + password);
            System.out.println("Driver: " + driver);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
