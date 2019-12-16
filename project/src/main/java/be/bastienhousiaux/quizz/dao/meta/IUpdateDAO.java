package be.bastienhousiaux.quizz.dao.meta;

public interface IUpdateDAO<T> {
    T update(T obj);
}
