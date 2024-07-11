package DasQuiz3.QuizLogic.QuizItemPackage;


import DasQuiz3.QuizLogic.Answer.Answer;

import java.util.ArrayList;

public abstract class QuizItemFactory {
    public abstract QuizItem createQuizItem(String question, ArrayList<Answer> answers);
}
