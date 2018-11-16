import java.io.IOException;

/**
 * this class needed to get longest line char count
 */
public class Example {
    /**
     * constructor of this class
     */
    Example() {
    }

    /**
     *
     * @param fileReader object of class FileReader
     * @return a value that is a Longest Line Chars Count
     * @throws IOException this  Signals that an I/O exception of some sort has occurred. This class is the general
     * class of exceptions produced by failed or interrupted I/O operations.
     */
    public int getLongestLineCharsCount(final FileReader fileReader) throws IOException {
        int maxLength = 0;
        int currentLength;
        while (fileReader.hasMoreLines()) {
            currentLength = fileReader.readLine().length();
            if (currentLength >  maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}
