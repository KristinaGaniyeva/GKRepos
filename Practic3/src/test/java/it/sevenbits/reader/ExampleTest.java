package it.sevenbits.reader;

import org.junit.Before;
import org.junit.Test;
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
    public void testGetLongestLineCharsCount() {
        FileReader reader = mock(FileReader.class);
        when(reader.readLine()).thenReturn("File.txt line: 1 this is first string", "File.txt line: 2 second string");
        when(reader.hasMoreLines()).thenReturn(true, true, false);
        assertEquals(37, example.getLongestLineCharsCount(reader));
    }

    @Test
    public void testEmptyString() {
        FileReader reader = mock(FileReader.class);
        when(reader.readLine()).thenReturn("","");
        when(reader.hasMoreLines()).thenReturn(true, true, false);
        assertEquals(0, example.getLongestLineCharsCount(reader));
    }


}