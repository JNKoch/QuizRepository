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

}
