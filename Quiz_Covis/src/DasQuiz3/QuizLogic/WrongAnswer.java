package DasQuiz3.QuizLogic;

public class WrongAnswer implements Answer {
    String wrongAnswer;

    public WrongAnswer() {
    }
    public WrongAnswer(String answer) {
        this.wrongAnswer = answer;
    }
    public String getAnswer() {
        return wrongAnswer;
    }

    @Override
    public void inputAnswer(String answer) {
        this.wrongAnswer = answer;
    }
}
