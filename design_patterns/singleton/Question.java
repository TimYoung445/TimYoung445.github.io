import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;


    /**
     * Constructs a Question object with the specified prompt and answers.
     * 
     * @param question the trivia question
     * @param correctAnswer the index of the correct answer (1-based)
     * @param answers the possible answers
     */

    public Question(String question, int correctAnswer, String... answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<>();
        for (String answer : answers) {
            this.answers.add(answer);
        }
    }

    /**
     * Returns a string representation of the question and answers.
     * 
     * @return formatted question and answers
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(question + "\n");
        for (int i = 0; i < answers.size(); i++) {
            sb.append((i + 1) + ": " + answers.get(i) + "\n");
        }
        return sb.toString();
    }


    /**
     * Checks if the provided answer is correct.
     * 
     * @param userAnswer the user's answer (1-based index)
     * @return true if the answer is correct, false otherwise
     */
    
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer;
    }

    public String getCorrectAnswer() {
        return answers.get(correctAnswer - 1);
    }
}