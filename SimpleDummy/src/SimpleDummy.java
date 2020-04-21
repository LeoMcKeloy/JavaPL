import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SimpleDummy {

    public static void main(String[] args) throws IOException {

        try (ServerSocket server = new ServerSocket(8083)) {
            System.out.println("Start connection on port 8080");

            while (true) {
                Socket socket = server.accept();
                Date date = new Date();
                System.out.println("Client connected");

                try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                     PrintWriter output = new PrintWriter(socket.getOutputStream())) {
                    while (!input.ready());

                    System.out.println();

                    while (input.ready()) {
                        System.out.println(input.readLine());
                    }

                    output.println(date);
                    output.println("HTTP/1.1 200 OK");
                    output.flush();
                    System.out.println("Client disconnected");
                }
            }
        }
    }
}
