import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String input = "C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt";
        try (BufferedReader in = new BufferedReader(new FileReader(input));
             PrintWriter out = new PrintWriter(new FileWriter(output))) {

            List<String> list = Files.readAllLines(Path.of(input));
            Collections.sort(list);
            for (String s : list) {
                out.write(s);
                out.write("\n");

            }
        }

    }
}
