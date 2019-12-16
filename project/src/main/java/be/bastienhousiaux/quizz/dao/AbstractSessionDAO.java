package be.bastienhousiaux.quizz.dao;

import be.bastienhousiaux.quizz.dao.entities.SessionEntity;
import be.bastienhousiaux.quizz.dao.meta.AbstractCRUDDAO;
import be.bastienhousiaux.quizz.dao.meta.AbstractDBConnector;

public abstract class AbstractSessionDAO extends AbstractCRUDDAO<SessionEntity> {
    public AbstractSessionDAO(AbstractDBConnector driverManager) {
        super(driverManager);
    }
}
