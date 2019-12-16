package be.bastienhousiaux.quizz.dao.entities;

import java.util.List;

public class QuizzEntity extends QuizzDescriptorEntity {
    private List<QuizzEntity> questions;

    public QuizzEntity(List<QuizzEntity> questions) {
        this.questions = questions;
    }

    public QuizzEntity(String name, List<QuizzEntity> questions) {
        super(name);
        this.questions = questions;
    }

    public QuizzEntity(int id, String name, List<QuizzEntity> questions) {
        super(id, name);
        this.questions = questions;
    }

    public List<QuizzEntity> getQuestions() {
        return questions;
    }
}
