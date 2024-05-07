package iotest;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class Create {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
           boolean isCreated = file.createNewFile();
           System.out.println(isCreated);
           System.out.println(file.getPath());
           System.out.println(file.getAbsolutePath());
           System.out.println("Is directory? " +file.isDirectory());
           System.out.println("Is file? " +file.isFile());
           System.out.println("Is hidden? " +file.isHidden());
           System.out.println("Is lastModified? " +file.lastModified());
           System.out.println("Formatted date of file: " +Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
