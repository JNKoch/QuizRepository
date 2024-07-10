package DasQuiz3.QuizLogic;

import java.util.ArrayList;

public class QuizItem {
    public String question;
    public ArrayList<Answer> answers;
    public int positionRightAnswer;

    public QuizItem(String question, ArrayList<Answer> answers, int positionRightAnswer) {
        this.question = question;
        this.answers = answers;
        this.positionRightAnswer = positionRightAnswer;
    }
    public boolean checkAnswers(int input) {
        int changeListNumberBy = 1;
        boolean checkAnswer;
        checkAnswer = answers.get(input - changeListNumberBy) instanceof RightAnswer;
        return checkAnswer;
    }
}
