package be.bastienhousiaux.quizz.dao.entities;

public class SessionEntity {

    private int id;
    private QuestionEntity currentQuestion;
    private int current_question_id;

    public SessionEntity() {
    }

    public SessionEntity(QuestionEntity currentQuestion, int current_question_id) {
        this.currentQuestion = currentQuestion;
        this.current_question_id = current_question_id;
    }

    public SessionEntity(int id, QuestionEntity currentQuestion, int current_question_id) {
        this.id = id;
        this.currentQuestion = currentQuestion;
        this.current_question_id = current_question_id;
    }

    public int getId() {
        return id;
    }

    public QuestionEntity getCurrentQuestion() {
        return currentQuestion;
    }

    public int getCurrent_question_id() {
        return current_question_id;
    }
}
