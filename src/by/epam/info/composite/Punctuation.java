package by.epam.info.composite;

import java.util.List;


public class Punctuation implements TextComponent {

    private Character character;
    
    public Punctuation(Character ch) {
        character = ch;
    }
    
    public Character getCharacter() {
        return character;
    }
    
    @Override
    public void add(TextComponent component) {
        throw new UnsupportedOperationException("Cannot add component");
    }

    @Override
    public void remove(TextComponent component) {
        throw new UnsupportedOperationException("Cannot remove component");
    }

    @Override
    public int countComponents() {
        return 1;
    }

    @Override
    public List<TextComponent> getComponents() {
        throw new UnsupportedOperationException("Cannot get component");
    }
    
    @Override
    public void makeImmutable() {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null || (obj.getClass() != getClass())) {
            return false;
        }
        
        return character.equals(((Punctuation) obj).character);
    }
    
    @Override
    public int hashCode() {
        return 17 * 31 + (int) character;
    }
    
    @Override
    public String toString() {
        return character.toString();
    }
}