package be.bastienhousiaux.quizz.dao.entities;

public class QuizzDescriptorEntity {

    private int id;
    private String name;

    public QuizzDescriptorEntity() {
    }

    public QuizzDescriptorEntity(String name) {
        this.name = name;
    }

    public QuizzDescriptorEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
