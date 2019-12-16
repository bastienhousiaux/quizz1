package be.bastienhousiaux.quizz.business.models.memorycards;

import be.bastienhousiaux.quizz.business.models.types.AbstractTypedData;

public class MemoryCard<RectoType extends AbstractTypedData,VersoType extends AbstractTypedData> {
    private RectoType recto;
    private VersoType verso;

    public MemoryCard(RectoType recto, VersoType verso) {
        this.recto = recto;
        this.verso = verso;
    }

    public RectoType getRecto() {
        return recto;
    }

    public VersoType getVerso() {
        return verso;
    }


}
