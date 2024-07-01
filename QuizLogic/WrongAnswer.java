package DasQuiz3.QuizLogic;

public class WrongAnswer extends Answer {
    String wrongAnswer;

    public WrongAnswer(String answer) {
        this.wrongAnswer = answer;
    }
    public String getAnswer() {
        return wrongAnswer;
    }
}
