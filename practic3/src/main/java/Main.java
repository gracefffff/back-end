import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * this class is main application entry point
 */
public final class Main {
    private Main() {
    }

    /**
     * main function for application
     * @param args this is arguments from command line
     * @throws IOException this  Signals that an I/O exception of some sort has occurred. This class is the general
     *                     class of exceptions produced by failed or interrupted I/O operations.
     */
    public static void main(final String[] args) throws IOException {
        final String fileName = "Homework3.txt";
        final String filePath = "MyHomework.txt";
        final String surname = "Saitiev";
        File file = new File(filePath);
        File fileRead = new File(fileName);
        byte[] fileContent;
        if (!file.exists()) {
            boolean successCreating = file.createNewFile();
            if (!successCreating) {
                System.out.println("File has not been created");
            }
            try (InputStream readFileStream = new FileInputStream(fileRead)) {
                fileContent = new byte[(int) fileRead.length()];
                int successReading = readFileStream.read(fileContent);
                if (successReading != (int) fileRead.length()) {
                    System.out.println("File has not been read");
                }
            }
            try (OutputStream writeFileStream = new FileOutputStream(filePath)) {
                writeFileStream.write(fileContent);
                writeFileStream.write(surname.getBytes());
            }
        }


    }
}