/* 
 * Written by Timothy Young
 */
public class Easy implements State {
    private final ArithemeticGame game;

      /**
     * Constructs a Easy state with the given game context.
     * 
     * @param game the game context for the state
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /*
     * Returns a random number between 0 and 9.
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 10); 
    }

    /*
     * Returns a random operation from the available operations.
     */

    @Override
    public Operation getOperation() {
        return Operation.PLUS;
    }

    /*
     * Increases difficulty to Medium if the score is divisible by 3.
     */
    @Override
    public void increaseDifficulty() {
        if (game.getScore() % 3 == 0) {
            game.setState(game.getMediumState());
            System.out.println("Level Increased to: Medium");
        }
    }

     /**
     * 
     * Decreases difficulty, but since this is the easiest level, this method does nothing.
     */

    @Override
    public void decreaseDifficulty() {
        // No lower level than Easy
    }
}