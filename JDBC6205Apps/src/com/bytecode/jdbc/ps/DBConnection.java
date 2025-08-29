package com.bytecode.jdbc.ps;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.InputStream;

public class DBConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            // Load db.properties file
            InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("db.properties");
            Properties props = new Properties();
            props.load(input);

            // Read properties
            String driver = props.getProperty("db.driver");
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            // Load Driver
            Class.forName(driver);

            // Create Connection
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

