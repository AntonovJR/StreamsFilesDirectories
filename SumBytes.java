import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args) {
        String input = "C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

            try (BufferedReader buffer = Files.newBufferedReader(Paths.get(input))) {
                String line = buffer.readLine();
                long sum = 0;
                while (line != null) {
                    for (char c : line.toCharArray()) {
                        sum+=c;
                    }
                    line = buffer.readLine();
                }
                System.out.println(sum);
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
