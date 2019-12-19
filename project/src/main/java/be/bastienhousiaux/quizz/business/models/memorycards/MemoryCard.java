package be.bastienhousiaux.quizz.business.models.memorycards;

import be.bastienhousiaux.quizz.business.models.DataBlock;

public class MemoryCard{
    private DataBlock recto;
    private DataBlock verso;


    public MemoryCard(DataBlock recto, DataBlock verso) {
        this.recto = recto;
        this.verso = verso;
    }

    public DataBlock getRecto() {
        return recto;
    }

    public void setRecto(DataBlock recto) {
        this.recto = recto;
    }

    public DataBlock getVerso() {
        return verso;
    }

    public void setVerso(DataBlock verso) {
        this.verso = verso;
    }
}
