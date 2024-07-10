package DasQuiz3.QuizLogic;

public class RightAnswer implements Answer {
    String rightAnswer;

    public RightAnswer() {
    }
    public RightAnswer(String answer) {
        this.rightAnswer = answer;
    }

    public String getAnswer() {
        return rightAnswer;
    }

    @Override
    public void inputAnswer(String answer) {
        this.rightAnswer = answer;
    }
}
