package test.by.epam.info.parser;

import by.epam.info.composite.TextComponent;
import by.epam.info.parser.SentenceParser;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class SentenceParserTest {
    private static String text;

    @BeforeClass
    public static void initText() {
        text = "Part of the data cleansing system is a set of diagnostic filters known as quality screens.They each implement a test in the data flow." +
                " The latter option is considered the best solution because the first option requires, that someone has" +
                " to manually deal with the issue each time it occurs and the second implies that data are missing from the target system.";
    }

    @AfterClass
    public static void unInitText() {
        text = null;
    }

    @Test
    public void parseTextTest() {
        SentenceParser sentenceParser = new SentenceParser();
        TextComponent sentences = sentenceParser.parse(text);
        Assert.assertEquals(3, sentences.getComponents().size());
    }

}
