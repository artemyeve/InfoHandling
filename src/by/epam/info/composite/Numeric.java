package by.epam.info.composite;

import java.util.List;


public class Numeric implements TextComponent {

    private final Character character;

    public Numeric(Character ch) {
        character = ch;
    }

    public Character getCharacter() {
        return character;
    }
    
    @Override
    public int countComponents() {
        return 1;
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
        
        if (obj == null || (obj.getClass() != this.getClass())) {
            return false;
        }
        
        return character.equals(((Numeric) obj).character);
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
