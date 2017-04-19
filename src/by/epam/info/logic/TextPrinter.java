package by.epam.info.logic;

import java.util.SortedMap;
import java.util.TreeMap;

import by.epam.info.composite.TextComponent;


public class TextPrinter {


    public void printWordsByAlphabet(TextComponent text) {
        SortedMap<Character, String> wordsMap = new TreeMap<>();

        for (TextComponent paragraph : text.getComponents()) {
            for (TextComponent sentence : paragraph.getComponents()) {
                for (TextComponent word : sentence.getComponents()) {
                    String wordStr = word.toString() + " ";
                    Character key = Character.toLowerCase(wordStr.charAt(0));
                    wordsMap.merge(key, wordStr, String::concat);
                }
            }
        }

        for (String words : wordsMap.values()) {
            System.out.println(words);
        }
    }

}
