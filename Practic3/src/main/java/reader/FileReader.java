package reader;

import java.io.*;

public class FileReader {
    public String readLine() throws IOException {
        File file = new File("./resources/File.txt");
        StringBuilder sb = new StringBuilder();

        InputStream fileStream = new FileInputStream(new File("src/main/resources/File.txt"));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(fileStream));
        String strLine;

        int i = 0;
        while ((strLine = fileReader.readLine()) != null) {
            i++;
//            if (i == 1) {

            sb.append(file.getName()).append(" line: ").append(i).append(" ").append(strLine).append("\n");
//            }
        }
        fileReader.close();
        return sb.toString();
    }

    public String hasMoreLines() throws IOException {
        return null;
    }
}
