package be.bastienhousiaux.quizz.business.models;

import java.util.List;

public class Question {
    private List<InformationChunk> statement;
    private List<InformationChunk> answer;
    private List<List<InformationChunk>> alternateAnswer;

    public List<InformationChunk> getStatement() {
        return statement;
    }

    public void setStatement(List<InformationChunk> statement) {
        this.statement = statement;
    }

    public List<InformationChunk> getAnswer() {
        return answer;
    }

    public void setAnswer(List<InformationChunk> answer) {
        this.answer = answer;
    }

    public Question(List<InformationChunk> statement, List<InformationChunk> answer, List<List<InformationChunk>> alternateAnswer) {
        this.statement = statement;
        this.answer = answer;
        this.alternateAnswer = alternateAnswer;
    }
}
