package be.bastienhousiaux.quizz.dao.entities;

import be.bastienhousiaux.quizz.datatypes.QuestionAnsweringType;

import java.util.List;

public class QuestionEntity {
    private int id;
    private List<InformationChunkEntity> statement;
    private List<InformationChunkEntity> answer;
    private int points;
    private int time;
    private QuestionAnsweringType type;
    private List<List<InformationChunkEntity>> alternateAnswers;

    public QuestionEntity() {
    }

    public QuestionEntity(List<InformationChunkEntity> statement, List<InformationChunkEntity> answer, int points, int time, QuestionAnsweringType type, List<List<InformationChunkEntity>> alternateAnswers) {
        this.statement = statement;
        this.answer = answer;
        this.points = points;
        this.time = time;
        this.type = type;
        this.alternateAnswers = alternateAnswers;
    }

    public QuestionEntity(int id, List<InformationChunkEntity> statement, List<InformationChunkEntity> answer, int points, int time, QuestionAnsweringType type, List<List<InformationChunkEntity>> alternateAnswers) {
        this(statement,answer,points,time,type,alternateAnswers);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<InformationChunkEntity> getStatement() {
        return statement;
    }

    public List<InformationChunkEntity> getAnswer() {
        return answer;
    }

    public int getPoints() {
        return points;
    }

    public int getTime() {
        return time;
    }

    public QuestionAnsweringType getType() {
        return type;
    }

    public List<List<InformationChunkEntity>> getAlternateAnswers() {
        return alternateAnswers;
    }
}
