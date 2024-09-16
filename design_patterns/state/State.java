/* 
 * Written by Timothy Young
 */
public interface State {
    int getNum();
    Operation getOperation();
    void increaseDifficulty();
    void decreaseDifficulty();
}