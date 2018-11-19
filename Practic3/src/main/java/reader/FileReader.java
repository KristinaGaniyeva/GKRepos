package reader;

import java.io.*;

public class FileReader {

    public String readLine(int strNumber) throws IOException {
        File file = new File("src/main/resources/File.txt");
        StringBuilder sb = new StringBuilder();

        InputStream fileStream = new FileInputStream(new File(String.valueOf(file)));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(fileStream));
        String strLine;

        int i = 1;
        while ((strLine = fileReader.readLine()) != null) {
            if (i == strNumber) {
                sb.append(file.getName()).append(" line: ").append(strNumber).append(" ").append(strLine);
            }
            i++;
        }
        fileReader.close();
        return sb.toString();
    }

    public boolean hasMoreLines(int strNumber) throws IOException {
        return false;
    }
}
