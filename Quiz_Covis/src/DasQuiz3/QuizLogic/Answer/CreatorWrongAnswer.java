package DasQuiz3.QuizLogic.Answer;

public class CreatorWrongAnswer extends AnswerFactory{
    @Override
    public Answer createAnswer() {
        return new WrongAnswer();
    }
}
