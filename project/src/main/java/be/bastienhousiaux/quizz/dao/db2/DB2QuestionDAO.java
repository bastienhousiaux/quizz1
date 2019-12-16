package be.bastienhousiaux.quizz.dao.db2;

import be.bastienhousiaux.quizz.dao.AbstractQuestionDAO;
import be.bastienhousiaux.quizz.dao.entities.QuestionEntity;
import be.bastienhousiaux.quizz.dao.meta.AbstractDBConnector;

import java.util.List;

public class DB2QuestionDAO extends AbstractQuestionDAO {

    public DB2QuestionDAO(AbstractDBConnector driverManager) {
        super(driverManager);
    }

    public QuestionEntity create(QuestionEntity obj) {
        return null;
    }

    public void delete(QuestionEntity obj) {

    }

    public void delete(int id) {

    }

    public QuestionEntity find(int id) {
        return null;
    }

    public List<QuestionEntity> findAll() {
        return null;
    }

    public QuestionEntity update(QuestionEntity obj) {
        return null;
    }
}
