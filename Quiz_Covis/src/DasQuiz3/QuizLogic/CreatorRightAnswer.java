package DasQuiz3.QuizLogic;

public class CreatorRightAnswer extends AnswerFactory{
    @Override
    public Answer createAnswer() {
        return new RightAnswer();
    }
}
