package reader;

import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExampleTest {
    private static Example example;

    @Before
    public void setUp() {
        example = new Example();
    }

    @Test
    public void testGetLongestLineCharsCount() throws IOException {
        FileReader reader = mock(FileReader.class);
        when(reader.readLine()).thenReturn("File.txt line: 1 this is first string").thenReturn("File.txt line: 2 second string");
        assertEquals(37, example.getLongestLineCharsCount(reader));
    }

}