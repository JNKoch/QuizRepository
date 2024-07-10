package DasQuiz3.QuizLogic;

public class CreatorWrongAnswer extends AnswerFactory{
    @Override
    public Answer createAnswer() {
        return new WrongAnswer();
    }
}
