package be.bastienhousiaux.quizz.dao;

import be.bastienhousiaux.quizz.dao.entities.InformationChunkEntity;
import be.bastienhousiaux.quizz.dao.meta.AbstractCRUDDAO;
import be.bastienhousiaux.quizz.dao.meta.AbstractDBConnector;

public abstract class AbstractInformationChunkDAO extends AbstractCRUDDAO<InformationChunkEntity> {
    public AbstractInformationChunkDAO(AbstractDBConnector driverManager) {
        super(driverManager);
    }
}
