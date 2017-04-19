package by.epam.info.reader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TextReader {

    private static final Logger LOGGER = LogManager.getLogger(TextReader.class);

    public String readFile(String fileName) {
        String line;
        try {
            line =  new String(Files.readAllBytes(new File(fileName).toPath()));
        } catch (IOException e) {
            LOGGER.log(Level.FATAL,e);
            throw new RuntimeException(e);
        }
        return line;
    }

}
