package by.epam.info.parser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.info.composite.TextComponent;
import by.epam.info.composite.TextComposite;


public class ParagraphParser implements TextParser {

    private static final String PARAGRAPH_REGEX = "\r";
    private SentenceParser sentenceParser = new SentenceParser();


    @Override
    public TextComponent parse(String text) {
        TextComposite textComponent = new TextComposite();
        Matcher matcher = Pattern.compile(PARAGRAPH_REGEX).matcher(text);

        while (matcher.find()) {
            textComponent.add(sentenceParser.parse(matcher.group()));
        }
        
        return textComponent;
    }

}
