/* Nose class to add in Nose to the potato head
 * 
 * Timothy Young
 */

public class Nose extends CharacterDecorator {
    /*Constructor to add a nose from reading the txt file */

    public Nose(Character character) {
        super(character);
        integratedDecor(FileReader.getLines(fileName:"./decorator/txt/nose.txt"));
    }
}