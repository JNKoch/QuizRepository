package DasQuiz3.QuizLogic.QuizItemPackage;

import DasQuiz3.QuizLogic.Answer.Answer;
import DasQuiz3.QuizLogic.Answer.RightAnswer;

import java.util.ArrayList;

public class QuizItemInteger implements QuizItem {
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
        System.out.println("-------------------------------");
        System.out.println(question);
        for (int i = 0; i < answers.size(); i++) {
            System.out.println("("+(i+1)+") "+ answers.get(i).getAnswerInt());
        }
        System.out.println("-------------------------------");
    }

    @Override
    public int returnAnswersSize() {
        return answers.size();
    }
}

