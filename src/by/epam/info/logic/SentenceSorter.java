package by.epam.info.logic;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import by.epam.info.composite.TextComponent;

public class SentenceSorter {

    public SortedSet<TextComponent> sortByWordCount(TextComponent text) {
        SortedSet<TextComponent> sentencesSet = new TreeSet<>(
                new Comparator<TextComponent>() {
                    @Override
                    public int compare(TextComponent o1, TextComponent o2) {
                        return o1.countComponents() - o2.countComponents();
                    }
                });
        
        for (TextComponent paragraph : text.getComponents()) {
            for (TextComponent sentence : paragraph.getComponents()) {
                sentencesSet.add(sentence);
            }
        }
        
        return sentencesSet;
    }
}
