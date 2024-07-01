package Quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class DasQuiz {
    public static void main(String[] args) {
        new DasQuiz();
    }

    public DasQuiz() {
        int richtigeAntworten = 0;
        int falscheAntworten = 0;
        int fragen = 1;
        int Antwort;
        Random random = new Random();
        random.nextInt(1, 3);
        Ausgabe("""
                Das Menü
                (1) Das Quiz beginnen
                (2) Das Quiz beenden
                """);
        int Eingabe = EingabeMitScanner();
        while (Eingabe > 2 || Eingabe < 1) {
            Ausgabe("Bitte Richtig eingeben");
            Eingabe = EingabeMitScanner();
        }
        switch (Eingabe) {
            case 1 -> {
                do {
                    switch (fragen) {
                        case 1 -> {
                            Ausgabe("""
                                    Die Erste Frage lautet:
                                    Was ist 3*3 ->
                                    (1) 3
                                    (2) 33
                                    (3) 9
                                    """);
                            Antwort = EingabeMitScanner();
                            while (Antwort > 3 || Antwort < 1) {
                                Ausgabe("Falsche Eingabe");
                                Antwort = EingabeMitScanner();
                            }
                            if (Antwort != 3) {
                                falscheAntworten++;
                                Ausgabe("Die Antwort ist Falsch");
                            }else {
                                richtigeAntworten++;
                                Ausgabe("Die Antwort ist Richtig");
                            }
                            fragen++;
                        }
                        case 2 -> {
                            Ausgabe("""
                                    Die Zweite Frage lautet:
                                    Was ist 33*11 ->
                                    (1) 363
                                    (2) 399
                                    (3) 333
                                    """);
                            Antwort = EingabeMitScanner();
                            while (Antwort > 3 || Antwort < 1) {
                                Ausgabe("Falsche Eingabe");
                                Antwort = EingabeMitScanner();
                            }
                            if (Antwort != 1) {
                                falscheAntworten++;
                                Ausgabe("Die Antwort ist Falsch");
                            }else {
                                richtigeAntworten++;
                                Ausgabe("Die Antwort ist Richtig");
                            }
                            fragen++;
                        }
                        case 3 -> {
                            Ausgabe("""
                                    Die Dritte Frage lautet:
                                    Wie viele Layer gibt es in dem OSI-Modell ->
                                    (1) 4
                                    (2) 8
                                    (3) 7
                                    """);
                            Antwort = EingabeMitScanner();
                            while (Antwort > 3 || Antwort < 1) {
                                Ausgabe("Falsche Eingabe");
                                Antwort = EingabeMitScanner();
                            }
                            if (Antwort != 2) {
                                falscheAntworten++;
                                Ausgabe("Die Antwort ist Falsch");
                            }else {
                                richtigeAntworten++;
                                Ausgabe("Die Antwort ist Richtig");
                            }
                            Ausgabe(richtigeAntworten+ " richtige Antworten\n"+
                                    falscheAntworten+ " falsche Antworten");
                            fragen++;
                        }case 4 -> {
                            Ausgabe("""
                                    Die Vierte Frage lautet:
                                    Wie viele Layer gibt es in dem OSI-Modell ->
                                    (1) 4
                                    (2) 8
                                    (3) 7
                                    """);
                            Antwort = EingabeMitScanner();
                            while (Antwort > 3 || Antwort < 1) {
                                Ausgabe("Falsche Eingabe");
                                Antwort = EingabeMitScanner();
                            }
                            if (Antwort != 3) {
                                falscheAntworten++;
                                Ausgabe("Die Antwort ist Falsch");
                            }else {
                                richtigeAntworten++;
                                Ausgabe("Die Antwort ist Richtig");
                            }
                            Ausgabe(richtigeAntworten+ " richtige Antworten\n"+
                                    falscheAntworten+ " falsche Antworten");
                            fragen++;
                        }
                    }
                } while (fragen != 5);
            }case 2 -> {
                System.exit(0);
            }
        }
    }

    public static String Ausgabe(String ausgabe) {
        String str = ("-------------------------------"+"\n"+
                ausgabe +"\n"+
                "-------------------------------"+"\n");
        System.out.println(str);
        return str;
    }

    public static int EingabeMitScanner() {
        int eingabe = 0;
        int exceptionHandler;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                eingabe = scanner.nextInt();
                exceptionHandler = 1;
            } catch (InputMismatchException ex) {
                scanner.next();
                exceptionHandler = 0;
                Ausgabe("Bitte nur eine Zahl und keinen Buchstaben");
            }
        } while (exceptionHandler == 0);

        return eingabe;
    }
}
