/* 
 * Written by Timothy Young
 */
public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    /**
     * Constructs a new ArithemeticGame with the initial state set to Easy.
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        score = 0;
    }

    /**
     * Generates a new question based on the current state.
     * 
     * @return a new Question object with random numbers and operation
     */
    public Question getQuestion() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        Operation operation = state.getOperation();
        return new Question(num1, num2, operation);
    }

    /**
     * Increases the score and adjusts the difficulty level if necessary.
     */
    public void increaseScore() {
        score++;
        state.increaseDifficulty();
    }

    /**
     * Decreases the score and adjusts the difficulty level if necessary.
     */
    public void decreaseScore() {
        score--;
        state.decreaseDifficulty();
    }

    /**
     * Sets the current state of the game.
     * 
     * @param state the new state to set
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Returns the Easy state.
     * 
     * @return the Easy state
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * Returns the Medium state.
     * 
     * @return the Medium state
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * Returns the Hard state.
     * 
     * @return the Hard state
     */
    public State getHardState() {
        return hardState;
    }

    /**
     * Returns the current score of the game.
     * 
     * @return the current score
     */
    public int getScore() {
        return score;
    }
}
