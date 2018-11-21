package it.sevenbits.reader;

import java.io.IOException;

public class Example {
    public int getLongestLineCharsCount(FileReader reader) throws IOException {
        int strMax = 0;
        int strTemp;
        for (int i = 0; i < reader.list.size(); i++) {
            strTemp = reader.readLine().length();
            if (strMax < strTemp) {
                strMax = strTemp;
            }
        }
        return strMax;
    }
}
