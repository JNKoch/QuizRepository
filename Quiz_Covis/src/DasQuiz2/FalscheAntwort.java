package DasQuiz2;

public class FalscheAntwort extends Antwort {
    String FalscheAntwort;

    public FalscheAntwort(String antwort) {
        this.FalscheAntwort = antwort;
    }
    public String getAntwort() {
        return FalscheAntwort;
    }

}
