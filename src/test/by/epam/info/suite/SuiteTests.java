package test.by.epam.info.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.by.epam.info.logic.TextPrinterTest;
import test.by.epam.info.parser.SentenceParserTest;
import test.by.epam.info.reader.TextReaderTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TextPrinterTest.class,
        SentenceParserTest.class,
        TextReaderTest.class

})

public class SuiteTests {

}
