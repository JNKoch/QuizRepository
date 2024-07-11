package DasQuiz3.QuizLogic.Answer;

public class CreatorRightAnswer extends AnswerFactory{
    @Override
    public Answer createAnswer() {
        return new RightAnswer();
    }
}
