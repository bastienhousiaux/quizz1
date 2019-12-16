package be.bastienhousiaux.quizz.dao.meta;

public interface ICreateDAO<T> {
    T create(T obj);
}
