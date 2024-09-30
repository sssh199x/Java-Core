package quiz;

import java.util.Scanner;

public class QuestionService {
    int score = 0;
    Question[] listQuestions = new Question[5];
    String[] userInput = new String[5];

    public QuestionService() {
        listQuestions[0] = new Question(1, "What is the capital of Nepal?",
                new String[] { "Pokhara", "Kathmandu", "Chitwan", "Hetauda" }, "Kathmandu");
        listQuestions[1] = new Question(2, "How many eyes do Spiders have?", new String[] { "0", "1", "2", "3" }, "3");
        listQuestions[2] = new Question(3, "What is the largest planet in our solar system?",
                new String[] { "Earth", "Mars", "Jupiter", "Saturn" }, "Jupiter");
        listQuestions[3] = new Question(4, "Who wrote 'Romeo and Juliet'?",
                new String[] { "William Shakespeare", "Charles Dickens", "Mark Twain", "Jane Austen" },
                "William Shakespeare");
        listQuestions[4] = new Question(5, "What is the boiling point of water?",
                new String[] { "90deg C", "100deg C", "110deg C", "120deg C" }, "100deg C");
    }

    public void displayQuestions() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listQuestions.length; i++) {
            System.out.println(listQuestions[i].getQuestion());
            for (int j = 0; j < listQuestions[i].getOptions().length; j++) {
                System.out.println((j + 1) + ". " + listQuestions[i].getOptions()[j]);
            }
            System.out.println("Please Type The Answer In Words From The Available Options:");

            userInput[i] = scanner.nextLine();

            if (userInput[i].toLowerCase().equals(listQuestions[i].getAnswer().toLowerCase())) {

                score++;
            }
            System.out.println("Your score is: " + score + "/" + listQuestions.length);
        }
        scanner.close();
    }
}