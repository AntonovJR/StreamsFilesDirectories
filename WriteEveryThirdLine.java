import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String input = "C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";
        try (BufferedReader in = new BufferedReader(new FileReader(input));

             PrintWriter out = new PrintWriter(new FileWriter(output))) {

            int counter = 1;

            String line = in.readLine();

            while (line != null) {

                if (counter % 3 == 0)

                    out.println(line);

                counter++;

                line = in.readLine();

            }

        }
    }
}
