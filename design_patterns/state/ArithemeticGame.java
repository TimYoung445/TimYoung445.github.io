/* 
 * Written by Timothy Young
 */
public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    public ArithemticGame() {
        easyState = new Easy(this);
        
    }

}