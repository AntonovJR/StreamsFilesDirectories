import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Path text = Path.of("C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        Path searchedWords = Path.of("C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");

        List<String> lines = Files.readAllLines(searchedWords);
        Map<String, Integer> wordsCounts = new LinkedHashMap<>();

        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                wordsCounts.put(word, 0);

            }
            
        }
        List<String> textLines = Files.readAllLines(text);
        for (String textLine : textLines) {
            Arrays.stream(textLine.split("\\s+")).forEach(word->
            {
                if(wordsCounts.containsKey(word)){
                    wordsCounts.put(word, wordsCounts.get(word)+1);
                }
            });

        }
        PrintWriter writer = new PrintWriter("result.txt");
        for (Map.Entry<String, Integer> entry : wordsCounts.entrySet()) {
           writer.println(entry.getKey()+ " - "+entry.getValue());

        }
        writer.close();
    }
}
