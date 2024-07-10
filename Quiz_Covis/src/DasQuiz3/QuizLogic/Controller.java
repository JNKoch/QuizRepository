package DasQuiz3.QuizLogic;

import DasQuiz3.Data.Data;
import DasQuiz3.FrontEnd.Console;

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
                    console.printQuizItem(quizItem);
                    sumAnswers(quizItem, console.rangeOfInput(quizItem.answers.size()));
                }
                console.printFinalScores(rightAnswers, wrongAnswers);
               break;
            case EXIT:
                System.exit(0);
        }
    }//creational patterns design patterns structure behavior
    private void sumAnswers(QuizItem Nr, int Eingabe) {
        if ( Nr.checkAnswers(Eingabe)) {
            console.print("Die Antwort ist richtig");
            rightAnswers++;
        }  else {
            console.print("Die Antwort ist falsch");
            wrongAnswers++;
        }
    }
}
