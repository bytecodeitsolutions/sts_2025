package com.bytecode.net;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to server at localhost:5000
            Socket socket = new Socket("localhost", 6000);
            System.out.println("Connected to server!");

            // Input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // User input
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;

            System.out.println("Type messages to send to server. Type 'bye' to exit.");

            while (true) {
                System.out.print("You: ");
                message = userInput.readLine();

                // Send message to server
                out.println(message);

                // Read server response
                String response = in.readLine();
                System.out.println(response);

                if (message.equalsIgnoreCase("bye")) {
                    break;
                }
            }

            // Close resources
            in.close();
            out.close();
            out.flush();
            userInput.close();
            socket.close();
            System.out.println("Client disconnected.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
