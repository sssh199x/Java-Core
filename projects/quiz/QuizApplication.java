package quiz;

/**
 * Main Quiz Application
 * This is a practical project that combines multiple Java concepts:
 * - Classes and Objects
 * - Arrays
 * - User Input
 * - Methods
 */
public class QuizApplication {
    public static void main(String args[]) {
        QuestionService questionService = new QuestionService();
        questionService.displayQuestions();
    }
}

