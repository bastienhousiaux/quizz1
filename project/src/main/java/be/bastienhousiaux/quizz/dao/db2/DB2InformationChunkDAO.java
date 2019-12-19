package be.bastienhousiaux.quizz.dao.db2;

import be.bastienhousiaux.quizz.dao.AbstractInformationChunkDAO;
import be.bastienhousiaux.quizz.dao.entities.InformationChunkEntity;

import java.util.List;

public class DB2InformationChunkDAO extends AbstractInformationChunkDAO {


    private DB2Connection connection;

    public DB2InformationChunkDAO(DB2Connection connection) {
        this.connection = connection;
    }

    public InformationChunkEntity create(InformationChunkEntity obj) {
        return null;
    }

    public void delete(InformationChunkEntity obj) {

    }

    public void delete(int id) {

    }

    public InformationChunkEntity find(int id) {
        return null;
    }

    public List<InformationChunkEntity> findAll() {
        return null;
    }

    public InformationChunkEntity update(InformationChunkEntity obj) {
        return null;
    }
}
