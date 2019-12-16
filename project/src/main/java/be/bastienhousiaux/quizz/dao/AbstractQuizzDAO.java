package be.bastienhousiaux.quizz.dao;

import be.bastienhousiaux.quizz.dao.entities.QuizzEntity;
import be.bastienhousiaux.quizz.dao.meta.AbstractCRUDDAO;
import be.bastienhousiaux.quizz.dao.meta.AbstractDBConnector;


public abstract  class AbstractQuizzDAO extends AbstractCRUDDAO<QuizzEntity> {
    public AbstractQuizzDAO(AbstractDBConnector driverManager) {
        super(driverManager);
    }
}
