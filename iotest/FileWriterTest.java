package iotest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("file-write.txt");
        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("Write an text on file");
            fw.flush();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
