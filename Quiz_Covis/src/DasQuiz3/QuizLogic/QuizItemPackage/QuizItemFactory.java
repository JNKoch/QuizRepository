package DasQuiz3.QuizLogic.QuizItemPackage;


import DasQuiz3.QuizLogic.Answer.Answer;

import java.util.ArrayList;

public class QuizItemFactory {

    public QuizItem createQuizItemString(String question, ArrayList<Answer> answers) {
        return new QuizItemString(question,answers);
    }
    public QuizItem createQuizItemInt(String question, ArrayList<Answer> answers) {
        return new QuizItemInteger(question,answers);
    }
}
