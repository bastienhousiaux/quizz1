package be.bastienhousiaux.quizz.dao.meta;

public interface IDeleteDAO<T> {
    void delete(T obj);
    void delete(int id);
}
