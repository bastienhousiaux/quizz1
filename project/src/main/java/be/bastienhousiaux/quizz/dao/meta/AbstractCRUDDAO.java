package be.bastienhousiaux.quizz.dao.meta;


public abstract class AbstractCRUDDAO<T> implements  ICreateDAO<T>,IFindDAO<T>,IUpdateDAO<T>,IDeleteDAO<T> {

    private int lastInsertedId;

    protected int getLastInsertedId(){
        return lastInsertedId;
    }

    protected void setLastInsertedId(int lastInsertedId){
        this.lastInsertedId=lastInsertedId;
    }
}
