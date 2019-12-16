package be.bastienhousiaux.quizz.dao;

public abstract class DAOAbstractFactory {



    public abstract AbstractSessionDAO createAbstractDAO();
    public abstract AbstractQuizzDAO createAbstractQuizzDAO();
    public abstract AbstractQuestionDAO createAbstractQuestionDAO();
    public abstract AbstractInformationChunkDAO createInformationChunkDAO();
    public abstract  AbstractQuizzDescriptorDAO createAbstractQuizzDescriptorDAO();


}
