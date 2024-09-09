/* Hat class to add in hat to the potato head
 * 
 * Timothy Young
 */

public class Hat extends CharacterDecorator {
    /*Constructor to add a hat from reading the txt file */

    public Hat(Character character) {
        super(character);
        integratedDecor(FileReader.getLines(fileName:"./decorator/txt/hat.txt"));
    }
}