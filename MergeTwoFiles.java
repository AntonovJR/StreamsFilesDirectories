import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        Path one = Path.of("C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path two = Path.of("C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");
        List<String> oneFile = Files.readAllLines(one);
        List<String> twoFile = Files.readAllLines(two);

        PrintWriter writer = new PrintWriter("result.txt");
        for (String s : oneFile) {
            writer.println(s);

        }
        for (String s : twoFile) {
            writer.println(s);

        }
        writer.close();


    }
}

