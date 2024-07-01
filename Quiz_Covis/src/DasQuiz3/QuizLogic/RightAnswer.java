package DasQuiz3.QuizLogic;

public class RightAnswer extends Answer {
    String rightAnswer;

    public RightAnswer(String answer) {
        this.rightAnswer = answer;
    }
    public String getAnswer() {
        return rightAnswer;
    }
}
