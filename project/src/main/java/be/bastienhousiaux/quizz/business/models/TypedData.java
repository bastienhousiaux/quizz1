package be.bastienhousiaux.quizz.business.models;

import be.bastienhousiaux.quizz.datatypes.ChunkType;

public class TypedData {
    private String data;
    private ChunkType type;

    public TypedData(String data, ChunkType type) {
        this.data = data;
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ChunkType getType() {
        return type;
    }

    public void setType(ChunkType type) {
        this.type = type;
    }
}
