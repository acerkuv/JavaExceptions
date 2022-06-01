
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;


public class FilesWriter {

    private final String path = "fileToWrite.txt";
    private final Calendar today = Calendar.getInstance();

    protected void fileWriter() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(path, "UTF-8");
        writer.println("Добрый день, Андрей");
        writer.println("Попробовал такой вариант реализации");
        writer.println("Надеюсь, что он сработает.");
        today.set(Calendar.HOUR_OF_DAY, 0);
        writer.println(today.getTime());
        writer.close();
    }
}
