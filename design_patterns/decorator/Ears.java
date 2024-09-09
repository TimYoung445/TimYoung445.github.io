/* Ears class to add in ears to the potato head
 * 
 * Timothy Young
 */

public class Ears extends CharacterDecorator {
    /*Constructor to add a ears from reading the txt file */

    public Ears(Character character) {
        super(character);
        integratedDecor(FileReader.getLines(fileName:"./decorator/txt/ears.txt"));
    }
}