package be.bastienhousiaux.quizz.dao.entities;

public class InformationChunkTypeEntity extends AbstractEntity {
    private String typeName;

    public InformationChunkTypeEntity(String typeName) {
        this.typeName = typeName;
    }

    public InformationChunkTypeEntity(int id, String typeName) {
        super(id);
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
