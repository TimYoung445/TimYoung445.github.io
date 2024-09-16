/* 
 * Written by Timothy Young
 */
public class Medium implements State {
    private final ArithemeticGame game;

    /**
     * Constructs a Medium state with the given game context.
     * 
     * @param game the game context for the state
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /*
     * Returns a random number between 0 and 19.
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 20);
    }

    /*
     * 
     * Returns a random operation from the available operations.
     */
    @Override
    public Operation getOperation() {
        return Operation.values()[(int) (Math.random() * Operation.values().length)];
    }

    /*
     * 
     * Increases difficulty to Hard if the score is divisible by 3.
     */
    @Override
    public void increaseDifficulty() {
        if (game.getScore() % 3 == 0) {
            game.setState(game.getHardState());
            System.out.println("Level Increased to: Hard");
        }
    }

    /*
     * 
     * Decreases difficulty to Easy if the score is divisible by 3.
     */
    @Override
    public void decreaseDifficulty() {
        if (game.getScore() % 3 == 0) {
            game.setState(game.getEasyState());
            System.out.println("Level Decreased to: Easy");
        }
    }
}