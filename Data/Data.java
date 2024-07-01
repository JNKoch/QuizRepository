package DasQuiz3.Data;

import DasQuiz3.QuizLogic.Answer;
import DasQuiz3.QuizLogic.QuizItem;
import DasQuiz3.QuizLogic.RightAnswer;
import DasQuiz3.QuizLogic.WrongAnswer;

import java.util.ArrayList;

public class Data {

    public Data() {
    }
    //methode rückgabe
    public ArrayList<QuizItem> generateQuestionAndAnswer() {

        ArrayList<QuizItem> quizItems = new ArrayList<>();
        // Erster Spot für frage dann egal wie viel Antworten das ändern
        ArrayList<Answer> Answers1 = new ArrayList<>();
        String question1 = "Wie viel ist 5*5";
        Answers1.add(new RightAnswer("25"));
        Answers1.add(new WrongAnswer("23"));
        Answers1.add(new WrongAnswer("27"));
        Answers1.add(new WrongAnswer("20"));
        QuizItem Nr1 = new QuizItem(question1, Answers1, 1);
        quizItems.add(Nr1);
        ArrayList<Answer> Answers2 = new ArrayList<>();
        String question2 = "Wie viel ist 12*12";
        Answers2.add(new WrongAnswer("134"));
        Answers2.add(new WrongAnswer("122"));
        Answers2.add(new WrongAnswer("112"));
        Answers2.add(new RightAnswer("144"));
        QuizItem Nr2 = new QuizItem(question2 ,Answers2, 4);
        quizItems.add(Nr2);
        ArrayList<Answer> Answers3 = new ArrayList<>();
        String question3 = "Wie viel it 9*9";
        Answers3.add(new WrongAnswer("99"));
        Answers3.add(new RightAnswer("81"));
        Answers3.add(new WrongAnswer("72"));
        Answers3.add(new WrongAnswer("90"));
        QuizItem Nr3 = new QuizItem(question3 ,Answers3, 2);
        quizItems.add(Nr3);
        return quizItems;
    }
}
