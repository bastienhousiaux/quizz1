package be.bastienhousiaux.quizz.dao.meta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public abstract class AbstractCRUDDAO<T> implements  ICreateDAO<T>,IFindDAO<T>,IUpdateDAO<T>,IDeleteDAO<T> {

    private int lastInsertedId;
    private AbstractDBConnector driverManager;


    public AbstractCRUDDAO(AbstractDBConnector driverManager) {
        this.driverManager = driverManager;
    }

    protected int getLastInsertedId(){
        return lastInsertedId;
    }

    protected void setLastInsertedId(int lastInsertedId){
        this.lastInsertedId=lastInsertedId;
    }
}
