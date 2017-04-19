package by.epam.info.parser;

import by.epam.info.composite.TextComponent;
import by.epam.info.composite.TextComposite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SentenceParser implements TextParser {

    private static final String SENTENCE_REGEX = "\\p{Blank}+[^.!?]*[.!?]";
    private WordParser lexemeParser = new WordParser();


    @Override
    public TextComponent parse(String text) {
        TextComposite textComponent = new TextComposite();
        Matcher matcher = Pattern.compile(SENTENCE_REGEX).matcher(text);

        while (matcher.find()) {
            textComponent.add(lexemeParser.parse(matcher.group()));
        }

        return textComponent;
    }

}
