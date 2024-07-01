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
        switch (console.rangeOfInput(1,2)) {
            case START:// sachen liste übergeben
                for (QuizItem quizItem : quizItems) {
                    console.printQuestionAndAnswers(quizItem);
                    checkAnswers(quizItem, console.rangeOfInput(1,4));
                }
                console.printFinalScores(rightAnswers, wrongAnswers);
//                console.printQuestionAndAnswers(data.Nr1);
//                checkAnswers(data.Nr1, console.rangeOfInput(1, 4));
//                console.printQuestionAndAnswers(data.Nr2);
//                checkAnswers(data.Nr2, console.rangeOfInput(1, 4));
//                console.printQuestionAndAnswers(data.Nr3);
//                checkAnswers(data.Nr3, console.rangeOfInput(1, 4));
//                console.printFinalScores(rightAnswers, wrongAnswers);
               break;
            case EXIT:
                System.exit(0);
        }
    }//creational patterns design patterns
    private void checkAnswers(QuizItem Nr, int Eingabe) {
        if ( Nr.answers.get(Eingabe-1) instanceof RightAnswer) {
            //instance of
            console.print("Die Antwort ist richtig");
            rightAnswers++;
        }  else {
            console.print("Die Antwort ist falsch");
            wrongAnswers++;
        }
    }
}
