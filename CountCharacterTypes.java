import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String input = "C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String output = "C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        String vowels = "aeoui";
        String punctuation = "!.?,";
        int countVowels = 0;
        int countPunctuation = 0;
        int countConsonants = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(input));
             PrintWriter out = new PrintWriter(new FileWriter(output))) {
            String line = in.readLine();
            while (line != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    for (char symbol : word.toCharArray()) {
                        String charAsString = String.valueOf(symbol);
                        if (vowels.contains(charAsString)) {
                            countVowels++;
                        } else if (punctuation.contains(charAsString)) {
                            countPunctuation++;
                        } else {
                            countConsonants++;
                        }
                    }

                }
                line = in.readLine();
            }
            out.println("Vowels: "+countVowels);
            out.println("Consonants: "+countConsonants);
            out.println("Punctuation: "+countPunctuation);

            System.out.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d",countVowels,countConsonants,countPunctuation);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
