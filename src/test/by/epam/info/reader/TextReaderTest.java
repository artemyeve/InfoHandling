package test.by.epam.info.reader;


import by.epam.info.reader.TextReader;
import org.junit.*;
import org.junit.rules.TemporaryFolder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class TextReaderTest {
    private File testFile;
    private FileWriter fw;
    private String original;
    private static TextReader reader;

    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();

    @BeforeClass
    public static void initTextReader() {
        reader = new TextReader();
    }

    @AfterClass
    public static void unInitTextReader() {
        reader = null;
    }

    @Before
    public void createFile() {
        original = "some text";
        try {
            folder.create();
            testFile = folder.newFile("test.txt");
            fw = new FileWriter(testFile);
            fw.write(original);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void readFileTest() throws IOException {
        String actual = reader.readFile(testFile.getPath());
        Assert.assertEquals(original, actual);
    }

}
