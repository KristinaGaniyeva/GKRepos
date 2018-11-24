package it.sevenbits.reader;

/**
 * Class Example
 */
public class Example {
    /**
     * The class finds the maximum string length
     * @param reader fileReader
     * @return strMax - maximum value
     */
    public int getLongestLineCharsCount(final FileReader reader) {
        int strMax = 0;
        int strTemp;
        while (reader.hasMoreLines()) {
            strTemp = reader.readLine().length();
            if (strMax < strTemp) {
                strMax = strTemp;
            }
        }
        return strMax;
    }
}
