package by.epam.info.logic;

import java.util.List;

import by.epam.info.composite.Letter;
import by.epam.info.composite.TextComponent;
import by.epam.info.composite.TextComposite;


public class WordRemover {


    public TextComponent removeWordsStartWithAndOfLen(TextComponent text, char ch, int len) {
        Letter letter = new Letter(ch);
        TextComponent newText = new TextComposite();

        for (TextComponent paragraph : text.getComponents()) {
            TextComponent newParagraph = new TextComposite();

            for (TextComponent sentence : paragraph.getComponents()) {
                TextComponent newSentence = new TextComposite();

                for (TextComponent word : sentence.getComponents()) {
                    List<TextComponent> components = word.getComponents();
                    
                    if (components.size() == len && !components.isEmpty() 
                            && components.get(0).equals(letter)) {
                        continue;
                    }
                    
                    TextComponent newWord = new TextComposite();
                    for (TextComponent c : components) {
                        newWord.add(c);
                    }
                    newSentence.add(newWord);
                }
                newParagraph.add(newSentence);
            }
            newText.add(newParagraph);
        }
        
        return newText;
    }

}
