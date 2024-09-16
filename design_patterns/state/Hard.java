/* 
 * Written by Timothy Young
 */
public class Hard implements State {
    private final ArithemeticGame game;

    /**
     * Constructs a Hard state with the given game context.
     * 
     * @param game the game context for the state
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /*
     * Returns a random number between 0 and 49.
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 50);
    }

    /*
     * Returns a random operation from the available operations.
     */
    @Override
    public Operation getOperation() {
        return Operation.values()[(int) (Math.random() * Operation.values().length)];
    }

    /*
     * 
     * Increases difficulty, but since this is the hardest level, this method does nothing.
     */
    @Override
    public void increaseDifficulty() {
        // No higher level than Hard
    }

    /**
     * 
     * Decreases difficulty to Medium if the score is divisible by 3.
     */
    @Override
    public void decreaseDifficulty() {
        if (game.getScore() % 3 == 0) {
            game.setState(game.getMediumState());
            System.out.println("Level Decreased to: Medium");
        }
    }
}