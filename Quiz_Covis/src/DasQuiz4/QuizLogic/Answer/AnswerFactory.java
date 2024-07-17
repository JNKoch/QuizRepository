package DasQuiz4.QuizLogic.Answer;

public class AnswerFactory {

    public Answer createRightAnswer() {
        return new RightAnswer();
    }
    public Answer createWrongAnswer() {
        return new WrongAnswer();
    }

}
