package DasQuiz3.Data;

import DasQuiz3.QuizLogic.*;

import java.util.ArrayList;

public class Data {

    public Data() {
    }
    //methode rückgabe
    public ArrayList<QuizItem> generateQuestionAndAnswer() {

        ArrayList<QuizItem> quizItems = new ArrayList<>();
        AnswerFactory rightAnswerFactory = new CreatorRightAnswer();
        AnswerFactory wrongAnswerFactory = new CreatorWrongAnswer();

        ArrayList<Answer> Answers1 = new ArrayList<>();
        String question1 = "Wie viel ist 5*5";

        Answer answer1 = rightAnswerFactory.createAnswer();
        answer1.inputAnswer("25");
        Answers1.add(answer1);

        Answer answer2 = wrongAnswerFactory.createAnswer();
        answer2.inputAnswer("23");
        Answers1.add(answer2);

        Answers1.add(new WrongAnswer("27"));
        Answers1.add(new WrongAnswer("20"));
        QuizItem Nr1 = new QuizItem(question1, Answers1);
        quizItems.add(Nr1);
        ArrayList<Answer> Answers2 = new ArrayList<>();
        String question2 = "Wie viel ist 12*12";
        Answers2.add(new WrongAnswer("134"));
        Answers2.add(new WrongAnswer("122"));
        Answers2.add(new WrongAnswer("112"));
        Answers2.add(new RightAnswer("144"));
        QuizItem Nr2 = new QuizItem(question2 ,Answers2);
        quizItems.add(Nr2);
        ArrayList<Answer> Answers3 = new ArrayList<>();
        String question3 = "Wie viel it 9*9";
        Answers3.add(new WrongAnswer("99"));
        Answers3.add(new RightAnswer("81"));
        Answers3.add(new WrongAnswer("72"));
        Answers3.add(new WrongAnswer("90"));
        QuizItem Nr3 = new QuizItem(question3 ,Answers3);
        quizItems.add(Nr3);
        ArrayList<Answer> Answers4 = new ArrayList<>();
        String question4 = "Wie viel it 9*9";
        Answers4.add(new WrongAnswer("99"));
        Answers4.add(new RightAnswer("81"));
        Answers4.add(new WrongAnswer("72"));
        Answers4.add(new WrongAnswer("72"));
        Answers4.add(new WrongAnswer("72"));
        Answers4.add(new WrongAnswer("72"));
        Answers4.add(new WrongAnswer("90"));
        QuizItem Nr4 = new QuizItem(question4 ,Answers4);
        quizItems.add(Nr4);
        return quizItems;
    }
}
