package be.bastienhousiaux.quizz.dao;

import be.bastienhousiaux.quizz.dao.entities.QuestionEntity;
import be.bastienhousiaux.quizz.dao.meta.AbstractCRUDDAO;
import be.bastienhousiaux.quizz.dao.meta.AbstractDBConnector;

public abstract class AbstractQuestionDAO extends AbstractCRUDDAO<QuestionEntity> {
    public AbstractQuestionDAO(AbstractDBConnector driverManager) {
        super(driverManager);
    }
}
