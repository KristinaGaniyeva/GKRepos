package reader;

import java.io.IOException;

public class Example {
    public int getLongestLineCharsCount(FileReader reader) throws IOException {
        int strMax = 0;
        int strTemp = 0;
        for (int strNumber = 1; strNumber < 3; strNumber++) {
            strTemp = reader.readLine(strNumber).length();
            if (strMax < strTemp) {
                strMax = strTemp;
            }
        }
        return strMax;
    }
}
