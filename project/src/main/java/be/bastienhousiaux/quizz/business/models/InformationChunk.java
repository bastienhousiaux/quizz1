package be.bastienhousiaux.quizz.business.models;

import be.bastienhousiaux.quizz.datatypes.ChunkType;

public class InformationChunk {

    private ChunkType type;
    private String data;

    public InformationChunk(ChunkType type, String data) {
        this.type = type;
        this.data = data;
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
