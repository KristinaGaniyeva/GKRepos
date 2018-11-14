package reader;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileReaderTest {
    private static FileReader fileReader;

    @Before
    public void setUp() throws Exception {
        fileReader = new FileReader();
    }

    @Test
    public void testReadLine() throws IOException {
        String  str = "File.txt line: 1 this is first string\n" +
                "File.txt line: 2 second string\n";
        String result = fileReader.readLine();
        assertEquals(str, result);
    }
}