/* Eyes class to add in eyes to the potato head
 * 
 * Timothy Young
 */

public class Eyes extends CharacterDecorator {
    /*Constructor to add a eyes from reading the txt file */

    public Eyes(Character character) {
        super(character);
        integratedDecor(FileReader.getLines(fileName:"./decorator/txt/eyes.txt"));
    }
}