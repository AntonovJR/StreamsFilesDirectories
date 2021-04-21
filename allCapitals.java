import java.io.*;


public class allCapitals {
    public static void main(String[] args) {
        String input = "C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String output = "C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        try (BufferedReader in = new BufferedReader(new FileReader(input));
             PrintWriter out = new PrintWriter(new FileWriter(output))) {

            String line = in.readLine();
            while (line != null) {

                out.write(line.toUpperCase());
                out.write("\n");
                line = in.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
