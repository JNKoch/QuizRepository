package DasQuiz3.QuizLogic;

import java.util.ArrayList;

public class QuizItemInteger implements QuizItemInterface{
    public String question;
    public ArrayList<Answer> answers;

    public QuizItemInteger(String question, ArrayList<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }
    @Override
    public boolean checkAnswers(int input) {
        int changeListNumberBy = 1;
        boolean checkAnswer;
        checkAnswer = answers.get(input - changeListNumberBy) instanceof RightAnswer;
        return checkAnswer;
    }

    @Override
    public void printQuizItems() {

    }
}

