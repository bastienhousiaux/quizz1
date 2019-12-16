package be.bastienhousiaux.quizz.dao.entities;

import be.bastienhousiaux.quizz.datatypes.ChunkType;

public class InformationChunkEntity {
    private int id;
    private ChunkType type;
    private String data;

    public InformationChunkEntity() {
    }

    public InformationChunkEntity(ChunkType type, String data) {
        this.type = type;
        this.data = data;
    }

    public InformationChunkEntity(int id, ChunkType type, String data) {
        this.id = id;
        this.type = type;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public ChunkType getType() {
        return type;
    }

    public void setType(ChunkType type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
