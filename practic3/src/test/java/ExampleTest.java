import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExampleTest {

    private Example example;
    private FileReader fileReader;

    @Before
    public void setUp() {
        example = new Example();
        fileReader = mock(FileReader.class);
    }

    @After
    public void close() throws IOException {
        fileReader.close();
    }

    @Test

    public void testGetLongestLineCharsCountWorks() throws IOException {
        when(fileReader.readLine()).thenReturn("File.txt line 1: this is first string");
        when(fileReader.hasMoreLines()).thenReturn(true, false);
        assertEquals("Wrong result", 37, example.getLongestLineCharsCount(fileReader));
    }

    @Test
    public void testHasNext() {
        assertFalse("Wrong result", fileReader.hasMoreLines());
    }
    @Test
    public void testGetLongestLineCharsCountWorksWithTwoLines() throws IOException {
        when(fileReader.readLine()).thenReturn("this is first string").thenReturn("second string");
        when(fileReader.hasMoreLines()).thenReturn(true, true, false);
        assertEquals("Wrong result", 20, example.getLongestLineCharsCount(fileReader));
    }

}



