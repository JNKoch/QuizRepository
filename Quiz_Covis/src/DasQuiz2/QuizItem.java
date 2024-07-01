package DasQuiz2;

import java.util.Objects;

import static DasQuiz2.Console.*;


public class QuizItem {
    String falscheAntwort;
    String richtigeAntwort;
    String falscheAntwort1;
    String[] kontrolle;

    //Richtige Antwort in der Mitte
    public QuizItem(FalscheAntwort falscheAntwort, RichtigeAntwort richtigeAntwort, FalscheAntwort falscheAntwort1) {

        this.falscheAntwort = falscheAntwort.getAntwort();
        this.richtigeAntwort = richtigeAntwort.getAntwort();
        this.falscheAntwort1 = falscheAntwort1.getAntwort();
        this.kontrolle = new String[]{this.falscheAntwort, this.richtigeAntwort, this.falscheAntwort1};
    }
    //Richtige Antwort Vorne
    public QuizItem(RichtigeAntwort richtigeAntwort, FalscheAntwort falscheAntwort, FalscheAntwort falscheAntwort1) {

        this.falscheAntwort = falscheAntwort.getAntwort();
        this.richtigeAntwort = richtigeAntwort.getAntwort();
        this.falscheAntwort1 = falscheAntwort1.getAntwort();
        this.kontrolle = new String[]{this.richtigeAntwort, this.falscheAntwort, this.falscheAntwort1};
    }
    // Richtige Antwort Hinten
    public QuizItem(Antwort falscheAntwort, FalscheAntwort falscheAntwort1, RichtigeAntwort richtigeAntwort) {

        this.falscheAntwort = falscheAntwort.getAntwort();
        this.richtigeAntwort = richtigeAntwort.getAntwort();
        this.falscheAntwort1 = falscheAntwort1.getAntwort();
        this.kontrolle = new String[]{this.falscheAntwort, this.falscheAntwort1, this.richtigeAntwort};
    }


    public void frageMitAntwortenAusgeben(String frage ) {
        Ausgabe(frage);
        for (int i = 0; i < kontrolle.length; i++) {
            System.out.println("Antwort Nummer (" + (i+1) + ") ist " + kontrolle[i]);
        }
    }
    // ist unnötig aber hab zu lange gebraucht deshalb muss das so bleiben
    //@Override
    //public String toString() {
        //for (int i = 0; i < kontrolle.length; i++) {
        //String übergabe = kontrolle[i];
        //System.out.println(antworten[i]);
        //}
        //return null;
//    }

    public  boolean antwortUeberpruefung(int eingabe) {
        if (eingabe == 1 && Objects.equals(kontrolle[0], richtigeAntwort)) {
            return true;
        } else if (eingabe == 2 && Objects.equals(kontrolle[1], richtigeAntwort)) {
            return true;
        } else if (eingabe == 3 && Objects.equals(kontrolle[2], richtigeAntwort)) {
            return true;
        }else {
            Ausgabe("Die Antwort ist falsch");
            return false;
        }
    }

    public static boolean ganzesProzedere(String frage, QuizItem fragen) {
        fragen.frageMitAntwortenAusgeben(frage);
        int eingabe = antwortRichtigerBereich(1,3);
        return fragen.antwortUeberpruefung(eingabe);
    }


}
