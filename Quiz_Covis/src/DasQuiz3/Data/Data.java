package DasQuiz3.Data;

import DasQuiz3.QuizLogic.Answer.*;
import DasQuiz3.QuizLogic.QuizItemPackage.CreatorQuizItemInteger;
import DasQuiz3.QuizLogic.QuizItemPackage.CreatorQuizItemString;
import DasQuiz3.QuizLogic.QuizItemPackage.QuizItem;
import DasQuiz3.QuizLogic.QuizItemPackage.QuizItemFactory;

import java.util.ArrayList;

public class Data {

    public Data() {
    }
    //methode rückgabe
    public ArrayList<QuizItem> generateQuestionAndAnswer() {

        ArrayList<QuizItem> quizItems = new ArrayList<>();
        AnswerFactory rightAnswerFactory = new CreatorRightAnswer();
        AnswerFactory wrongAnswerFactory = new CreatorWrongAnswer();
        QuizItemFactory integerQuizItemFactory = new CreatorQuizItemInteger();
        QuizItemFactory stringQuizItemFactory = new CreatorQuizItemString();

        ArrayList<Answer> Answers1 = new ArrayList<>();
        String question1 = "Wie viel ist 5*5";

        Answer answer1 = rightAnswerFactory.createAnswer();
        answer1.inputAnswerInt(25);
        Answers1.add(answer1);

        Answer answer2 = wrongAnswerFactory.createAnswer();
        answer2.inputAnswerInt(23);
        Answers1.add(answer2);

        quizItems.add(integerQuizItemFactory.createQuizItem(question1, Answers1));


        return quizItems;
    }
}
