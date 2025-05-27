package Ex35_TCPChat;
import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Connected to server.");

            // Setup streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            // Create a thread to read messages from server
            new Thread(() -> {
                try {
                    String serverMsg;
                    while ((serverMsg = in.readLine()) != null) {
                        System.out.println("Server: " + serverMsg);
                    }
                } catch (IOException e) {
                    System.out.println("Server disconnected.");
                }
            }).start();

            // Read user input and send to server
            String message;
            while ((message = userInput.readLine()) != null) {
                out.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
