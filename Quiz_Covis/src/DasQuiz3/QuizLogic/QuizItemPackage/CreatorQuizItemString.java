package DasQuiz3.QuizLogic.QuizItemPackage;

import DasQuiz3.QuizLogic.Answer.Answer;

import java.util.ArrayList;

public class CreatorQuizItemString extends QuizItemFactory{
    @Override
    public QuizItem createQuizItem(String question, ArrayList<Answer> answers) {
        return new QuizItemString(question,answers);
    }
}
