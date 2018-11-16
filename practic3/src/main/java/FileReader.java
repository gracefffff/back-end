import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * this class contains methods : readLine, hasMoreLines
 */
public class FileReader {
    private BufferedReader reader;
    private String fileName;
    private int lineNumber;
    private String line;

    /**
     *
     * @param path - String value is path to file
     * @throws IOException this  Signals that an I/O exception of some sort has occurred. This class is the general
     *                     class of exceptions produced by failed or interrupted I/O operations.
     */
    FileReader(final String path) throws IOException {
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        lineNumber = 0;
        fileName = new File(path).getName();
        line = readLine();
    }

    /**
     * @return String which contains name of file, number of line, and content of line
     * @throws IOException this  Signals that an I/O exception of some sort has occurred. This class is the general
     *                     class of exceptions produced by failed or interrupted I/O operations.
     */
    public String readLine() throws IOException {
        String currentLine = line;
        line = reader.readLine();
        return fileName + " line " + lineNumber++ + ": " + currentLine;
    }

    /**
     *
     * @return boolean value, true - next line is exist, false - next line is not exist
     */
    public boolean hasMoreLines() {
        return line != null;
    }

    /**
     * @throws IOException this  Signals that an I/O exception of some sort has occurred. This class is the general
     *                     class of exceptions produced by failed or interrupted I/O operations.
     */
    void close() throws IOException {
        reader.close();
    }
}
