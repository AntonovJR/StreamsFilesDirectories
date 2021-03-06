import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Alexandar_Antonov\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        Deque<File> deque = new ArrayDeque<>();
        deque.add(file);
        int count = 0;
        while (!deque.isEmpty()) {
            File f = deque.poll();
            System.out.println(f.getName());
            count++;
            File[] files = f.listFiles();
            for (File innerFile : files) {
                if (innerFile.isDirectory()) {
                    deque.offer(innerFile);
                }

            }
        }
        System.out.println(count + " folders");
    }
}


