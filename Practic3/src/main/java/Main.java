import reader.Example;
import reader.FileReader;

import java.io.*;

public class Main {
    public static void main(final String[] args) {
        File file = new File(".", "MyHomework.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("File was previously created");
        }

        try (FileInputStream fin = new FileInputStream("Homework3.txt");
             FileOutputStream fos = new FileOutputStream("MyHomework.txt", true)) {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
            String text = "Ganieva";
            buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println("File not found");
        }
        System.out.println("File successfully written");

    }
}

