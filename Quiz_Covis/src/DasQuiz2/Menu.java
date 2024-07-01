package DasQuiz2;

import static DasQuiz2.Console.Ausgabe;


public class Menu {
    public Menu() {
        menuPunkte();
    }

    public void menuPunkte() {
        Ausgabe("""
                Das Menü
                (1) Das Quiz beginnen
                (2) Das Quiz beenden
                """);
    }

}
