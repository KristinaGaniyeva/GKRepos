package reader;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.io.IOException;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExampleTest {

    @Mock
    private FileReader reader;

    @InjectMocks
    private Example example;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetLongestLineCharsCount() throws IOException {
        Example i = mock(Example.class);
        when(i.getLongestLineCharsCount(reader)).thenReturn(37);
        assertEquals(37, i.getLongestLineCharsCount(reader));
    }
}