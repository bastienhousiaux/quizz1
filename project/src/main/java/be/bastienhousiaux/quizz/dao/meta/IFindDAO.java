package be.bastienhousiaux.quizz.dao.meta;

import java.util.List;

public interface IFindDAO<T> {
    T find(int id);
    List<T> findAll();
}
