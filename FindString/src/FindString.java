import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FindString {
    public static void main(String[] args) throws Exception{
        if (args.length == 3) {
            System.out.println("Find word: " + args[2] + " in file: " + args[0]);
            try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
                String string;
                try (FileWriter writer = new FileWriter(args[1])) {
                    while ((string = reader.readLine()) != null) {
                        if (string.contains(args[2])) {
                            writer.write(string);
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Incorrect number of arguments");
        }
    }
}