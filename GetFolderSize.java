import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class GetFolderSize {
    public static void main(String[] args) throws IOException {
        String one = "C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(one);
        long sum = 0;
        for (File file: folder.listFiles()) {
            sum+=file.length();
        }
        System.out.println("Folder size: "+sum);
    }
}
