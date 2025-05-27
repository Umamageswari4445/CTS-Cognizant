package Ex35_TCPChat;
import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for a client...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            // Setup streams
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));

            // Create a thread to read messages from client
            new Thread(() -> {
                try {
                    String clientMsg;
                    while ((clientMsg = in.readLine()) != null) {
                        System.out.println("Client: " + clientMsg);
                    }
                } catch (IOException e) {
                    System.out.println("Client disconnected.");
                }
            }).start();

            // Read server input and send to client
            String message;
            while ((message = serverInput.readLine()) != null) {
                out.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

