package be.bastienhousiaux.quizz.dao.entities;

public class ChunkTableEntity extends AbstractEntity{
    private String name;

    public ChunkTableEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
