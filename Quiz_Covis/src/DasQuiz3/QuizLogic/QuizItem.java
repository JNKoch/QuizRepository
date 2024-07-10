package DasQuiz3.QuizLogic;

import java.util.ArrayList;

public class QuizItem {
    public String question;
    public ArrayList<Answer> answers;


    public QuizItem(String question, ArrayList<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }
    public boolean checkAnswers(int input) {
        int changeListNumberBy = 1;
        boolean checkAnswer;
        checkAnswer = answers.get(input - changeListNumberBy) instanceof RightAnswer;
        return checkAnswer;
    }
}
