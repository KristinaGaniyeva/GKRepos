package reader;

import java.io.IOException;

public class Example {
    public int getLongestLineCharsCount(FileReader reader) throws IOException {
        int strMax = 0;
        int strTemp = reader.readLine().length();
        for (int i = 0; i < strTemp; i++)
            if (strMax < strTemp) {
                strMax = strTemp;
        }
        return strMax;
    }
}
