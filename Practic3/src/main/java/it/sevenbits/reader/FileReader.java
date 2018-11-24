package it.sevenbits.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

/**
 * Class FileReader
 */

public class FileReader {
    private ArrayList<String> list;
    private int strIndex = 1;
    private File file;

    /**
     * Reads lines from file and adds to ArrayList
     * @throws IOException exception
     */
    public FileReader() throws IOException {
        file = new File("./src/main/resources/File.txt");
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        list = new ArrayList<>();
        String strLine;
        while ((strLine = fileReader.readLine()) != null) {
            list.add(strLine);
        }
        fileReader.close();
    }

    /**
     * The method returns a string consisting of a file name, a string number and a string taken from a file
     * @return string
     */
    public String readLine() {
        StringBuilder sb = new StringBuilder();
            sb.append(file.getName()).append(" line: ").append(strIndex).append(" ").append(list.get(strIndex - 1));
            strIndex++;
        return sb.toString();
    }

    /**
     * The method returns true if there are still lines in the file, otherwise it is false
     * @return true or false
     */
    public boolean hasMoreLines() {
        if (strIndex < list.size()) {
            return true;
        } else {
            return false;
        }
    }
}
