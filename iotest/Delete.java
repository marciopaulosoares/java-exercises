package iotest;
import java.io.File;

public class Delete {
    public static void main(String[] args) {
        File file = new File("file.txt");

        boolean existis = file.exists();
        if(existis){
            System.out.println(file.delete());
        }
    }
}
