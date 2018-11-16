import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class FileReaderTest {
    private FileReader fileReader;

    @Before
    public void setUp() throws IOException {
        fileReader = new FileReader("Homework3.txt");
    }

    @After
    public void closeFile() throws IOException {
        fileReader.close();
    }

    @Test
    public void readLineTest() throws IOException {
        String result = "";
        while(fileReader.hasMoreLines()){
            result = fileReader.readLine();
        }
        assertEquals("Wrong result", "Homework3.txt line 4: А ларчик просто открывался", result);
    }
}
