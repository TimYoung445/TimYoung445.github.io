/* 
 * Written by Timothy Young
 */
public class Question {
    private final String question;
    private final int answer;

    public Question(int num1, num2, Operation operation) {
        this.question = num1 + " " + operation.label + " " + num2;
        this.answer = calculateAnswer(num1, num2, operation);
    }

    private int calculateAnswer(int num1, int num2, Operation operation) {
        switch(operation) {
            case PLUS:
                return num1 + num2;
            case MINUS
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            case DIVIDE:
                return num1 / num2;
        }
    }

    @OVERRIDE
    public String toString() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }

    public boolean isCorrect(int answer) {
        return this.answer == answer;
    }
}