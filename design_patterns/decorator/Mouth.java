/* Mouth class to add in mouth to the potato head
 * 
 * Timothy Young
 */

public class Mouth extends CharacterDecorator {
   /*Constructor to add a mouth from reading the txt file */

    public Mouth(Character character) {
        super(character);
        integratedDecor(FileReader.getLines(fileName:"./decorator/txt/mouth.txt"));
    }
}