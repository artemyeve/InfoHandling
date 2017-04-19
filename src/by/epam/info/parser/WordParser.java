package by.epam.info.parser;

import by.epam.info.composite.Letter;
import by.epam.info.composite.Punctuation;
import by.epam.info.composite.TextComponent;
import by.epam.info.composite.TextComposite;
import java.util.regex.Pattern;

public class WordParser implements TextParser {

    private static final String LETTER_REGEX = "\\p{Alpha}";
    private static final String PUNCT_REGEX = "\\p{Punct}";
    private static final String NUMERIC_REGEX = "\\d+(\\.\\d+)?";
    private static final String NON_MATH_END_REGEX = "[^\\d)]";

    @Override
    public TextComponent parse(String text) {

        TextComposite fullWord = new TextComposite();


        if (Pattern.compile(NUMERIC_REGEX).matcher(text).find()) {

            String endSymb = text.substring(text.length() - 1, text.length());
            boolean isLast = false;

            if ((isLast = endSymb.matches(NON_MATH_END_REGEX))) {
                text = text.substring(0, text.length() - 1);
            }

            if (isLast) {
                fullWord.add(new Punctuation(endSymb.charAt(0)));
            }

        } else {
            for (char ch : text.toCharArray()) {
                if (String.valueOf(ch).matches(LETTER_REGEX)) {
                    fullWord.add(new Letter(ch));
                } else if (String.valueOf(ch).matches(PUNCT_REGEX)) {
                    fullWord.add(new Punctuation(ch));
                }
            }
        }
        return fullWord;
    }

}
