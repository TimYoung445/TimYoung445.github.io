package design_patterns.decorator;

import java.util.ArrayList;

public abstract class CharacterDecorator extends Character {
    protected Character character;

    public CharacterDecorator(Character character) {
        super(character.lines, character.getName()) {
            this.character = character;
        }
    }

    protected abstract void integrateDecor(Arraylist<String> decor);
}