package DasQuiz3.QuizLogic;

import DasQuiz3.Data.Data;
import DasQuiz3.FrontEnd.Console;
import DasQuiz3.QuizLogic.QuizItemPackage.QuizItem;

import java.util.ArrayList;

public class Controller {

    int rightAnswers = 0;
    int wrongAnswers = 0;
    final int START = 1;
    final int EXIT = 2;
    Console console;
    Data data;

    public Controller() {

        data = new Data();
        console = new Console();
    }

    public void start() {
        ArrayList<QuizItem> quizItems = data.generateQuestionAndAnswer();
        console.menu();
        switch (console.rangeOfInput(2)) {
            case START:// sachen liste übergeben
                for (QuizItem quizItem : quizItems) {
                    quizItem.printQuizItems();
                    sumAnswers(quizItem, console.rangeOfInput(quizItem.returnAnswersSize()));
                }
                console.printFinalScores(rightAnswers, wrongAnswers);
               break;
            case EXIT:
                System.exit(0);
        }
    }//creational patterns design patterns structure behavior
    private void sumAnswers(QuizItem quizItem, int Eingabe) {
        if ( quizItem.checkAnswers(Eingabe)) {
            console.print("Die Antwort ist richtig");
            rightAnswers++;
        }  else {
            console.print("Die Antwort ist falsch");
            wrongAnswers++;
        }
    }
}
