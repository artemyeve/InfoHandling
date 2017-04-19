package test.by.epam.info.logic;

import by.epam.info.composite.Letter;
import by.epam.info.composite.Punctuation;
import by.epam.info.composite.TextComposite;
import by.epam.info.logic.TextPrinter;
import org.junit.Test;

public class TextPrinterTest {
    @Test
    public void printWordsByAlphabetTest() {
        TextPrinter printer = new TextPrinter();
        Letter capA = new Letter('A');
        Letter a = new Letter('a');
        Letter b = new Letter('b');
        Letter d = new Letter('d');
        Letter capG = new Letter('G');
        Letter p = new Letter('p');
        Punctuation dot = new Punctuation('.');

        TextComposite wordCapA = new TextComposite();
        wordCapA.add(capA);

        TextComposite wordBa = new TextComposite();
        wordBa.add(b);
        wordBa.add(a);


        TextComposite wordBDot = new TextComposite();
        wordBDot.add(b);
        wordBDot.add(dot);


        TextComposite wordDDot = new TextComposite();
        wordDDot.add(d);
        wordDDot.add(dot);


        TextComposite wordGa = new TextComposite();
        wordGa.add(capG);
        wordGa.add(a);

        TextComposite wordGpDot = new TextComposite();
        wordGpDot.add(capG);
        wordGpDot.add(p);
        wordGpDot.add(dot);


        TextComposite firstSentence = new TextComposite();
        firstSentence.add(wordCapA);
        firstSentence.add(wordBa);
        firstSentence.add(wordDDot);

        TextComposite secondSentence = new TextComposite();
        secondSentence.add(wordGpDot);


        TextComposite thirdSentence = new TextComposite();
        thirdSentence.add(wordGa);
        thirdSentence.add(wordBDot);

        TextComposite firstParagraph = new TextComposite();
        firstParagraph.add(firstSentence);

        TextComposite secondParagraph = new TextComposite();
        secondParagraph.add(secondSentence);
        secondParagraph.add(firstSentence);
        secondParagraph.add(thirdSentence);

        TextComposite fullText = new TextComposite();
        fullText.add(firstParagraph);
        fullText.add(secondParagraph);

        printer.printWordsByAlphabet(fullText);
    }

}
