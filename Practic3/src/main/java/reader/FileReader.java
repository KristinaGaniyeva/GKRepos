package reader;

import java.io.*;
import java.util.ArrayList;

public class FileReader {
    public ArrayList<String> list;
    private StringBuilder sb = new StringBuilder();
    private int strIndex;

    public FileReader() throws IOException {
        File file = new File(this.getClass().getResource("/File.txt").getFile());
        String absolutePath = file.getAbsolutePath();
        InputStream fileStream = new FileInputStream(new File(absolutePath));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(fileStream));
        list = new ArrayList<>();

        String strLine;
        while ((strLine = fileReader.readLine()) != null) {
            list.add(strLine);
            strIndex = list.indexOf(strLine);
            sb.append(file.getName()).append(" line: ").append(strIndex).append(" ").append(list.get(strIndex)).append("\n");
        }
        fileReader.close();

    }

    public String readLine() {
        return sb.toString();
    }

    public boolean hasMoreLines() {
        if (strIndex > list.size()) {
            return true;
        } else {
            return false;
        }
    }
}
