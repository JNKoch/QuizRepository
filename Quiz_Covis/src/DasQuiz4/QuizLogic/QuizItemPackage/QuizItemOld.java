package DasQuiz4.QuizLogic.QuizItemPackage;

import DasQuiz4.QuizLogic.Answer.Answer;
import DasQuiz4.QuizLogic.Answer.RightAnswer;

import java.util.ArrayList;

public class QuizItemOld {
    public String question;
    public ArrayList<Answer> answers;


    public QuizItemOld(String question, ArrayList<Answer> answers) {
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
