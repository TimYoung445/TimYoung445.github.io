package design_patterns.singleton;

import java.util.ArrayList;
import java.util.Random;

public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;

    // Private constructor to prevent instantiation
    private TriviaGame() {
        this.score = 0;
        this.numGames = 0;
        this.rand = new Random();
        this.questions = DataLoader.getTriviaQuestions();
    }

    // Method to get the single instance of TriviaGame
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    // Get a question from the list
    public Question getQuestion() {
        if (hasMoreQuestions()) {
            return questions.remove(rand.nextInt(questions.size()));
        }
        return null; // or handle no questions left
    }

    // Check if there are more questions available
    public boolean hasMoreQuestions() {
        return !questions.isEmpty();
    }

    // Increase score for winning a round
    public void winRound() {
        score++;
        numGames++;
    }

    // Increase the number of games played
    public void loseRound() {
        numGames++;
    }

    // Get the scores
    public String getScores() {
        return "Score: " + score + " out of " + numGames;
    }
}