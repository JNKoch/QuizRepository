package DasQuiz2;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Console {

    public Console() {
    }


    public static int antwortRichtigerBereich(int untergrenze, int obergrenze) {
        int eingabe = EingabeMitScanner();
        int check = 0;
        do {
            if (eingabe < untergrenze || eingabe > obergrenze ) {
                Ausgabe("Falsche Eingabe nochmal eingeben");
                eingabe = EingabeMitScanner();
            } else check = 1;
        } while (check == 0);
        return eingabe;
    }

    public static String Ausgabe(String ausgabe) {
        String str = ("-------------------------------" + "\n" +
                ausgabe + "\n" +
                "-------------------------------" + "\n");
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
                Ausgabe("Bitte nur eine Zahl und keine Buchstaben eingeben");
            }
        } while (exceptionHandler == 0);

        return eingabe;
    }

}
