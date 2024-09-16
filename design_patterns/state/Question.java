/* 
 * Written by Timothy Young
 */
public class Question {
    private final String question;
    private final int answer;

    /**
     * Constructs a Question with the given numbers and operation.
     * 
     * @param num1 the first number
     * @param num2 the second number
     * @param operation the operation to perform
     */
    public Question(int num1, int num2, Operation operation) {
        this.question = num1 + " " + operation.label + " " + num2;
        this.answer = calculateAnswer(num1, num2, operation);
    }

    /**
     * Calculates the answer to the question based on the operation.
     * 
     * @param num1 the first number
     * @param num2 the second number
     * @param operation the operation to perform
     * @return the result of the operation
     */
    private int calculateAnswer(int num1, int num2, Operation operation) {
        switch (operation) {
            case PLUS:
                return num1 + num2;
            case MINUS:
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            case DIVIDE:
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid Operation");
        }
    }
}