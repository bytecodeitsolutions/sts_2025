package com.bytecode.net;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            // Create server socket on port 5000
            serverSocket = new ServerSocket(6000);
            System.out.println("Server started. Waiting for client...");

            // Accept client connection
            socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Client says: " + message);

                // Send response
                out.println("Server received: " + message);

                // If client says "bye", disconnect
                if (message.equalsIgnoreCase("bye")) {
                    System.out.println("Client disconnected.");
                    break;
                }
            }

            // Close streams and socket
            in.close();
            out.close();
            socket.close();
            System.out.println("Server stopped.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
