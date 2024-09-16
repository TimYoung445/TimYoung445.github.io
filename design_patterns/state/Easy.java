/* 
 * Written by Timothy Young
 */
public class Easy implements State {
    private final ArithmeticGame game;

    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    @OVERRIDE
    public int getNum() {
    }
}