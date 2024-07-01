package DasQuiz2;

import java.util.ArrayList;

import static DasQuiz2.Console.*;
import static DasQuiz2.QuizItem.ganzesProzedere;

public class Quiz {
    String quizName;

    public Quiz(String quizName) {
        this.quizName = quizName;
        Ausgabe("Das Quiz heißt " + quizName);
        control();
    }

    int Eingabe;
    int falscheErgebnisse;
    int richtigeErgebnisse;

    public void control() {
        new Menu();
        Eingabe = antwortRichtigerBereich(1, 2);
        switch (Eingabe) {
            // Konstanten benutzen
            case 1 -> {
                richtigOderFalsch("Was ist 3 * 3",
                        new QuizItem(new FalscheAntwort("3"), new FalscheAntwort("33"), new RichtigeAntwort("9")));
                richtigOderFalsch("Was ist 11 * 11",
                        new QuizItem(new RichtigeAntwort("363"), new FalscheAntwort("399"), new FalscheAntwort("333")));
                richtigOderFalsch("Wie viele Layer gibt es in dem OSI-Modell",
                        new QuizItem(new FalscheAntwort("7"), new RichtigeAntwort("8"), new FalscheAntwort("4")));


                Ausgabe("Richtig beantwortet: " + richtigeErgebnisse + "\n" +
                        "Falsch beantwortet:" + falscheErgebnisse);
            }
            case 2 -> System.exit(0);
        }
    }


    public void richtigOderFalsch(String frage, QuizItem fragen) {
        if (ganzesProzedere(frage, fragen)) {
            Ausgabe("Die Antwort ist Richtig");
            richtigeErgebnisse++;
        } else falscheErgebnisse++;
    }
}

