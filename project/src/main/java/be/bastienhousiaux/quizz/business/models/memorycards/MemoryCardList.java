package be.bastienhousiaux.quizz.business.models.memorycards;

import be.bastienhousiaux.quizz.business.models.memorycards.MemoryCard;

import java.util.List;

public class MemoryCardList {
    private List<MemoryCard> cards;
    private int index=0;

    public MemoryCardList(List<MemoryCard> cards) {
        this.cards = cards;
    }

    public MemoryCard getNextCard(){
        return this.cards.get(index++);
    }

    public boolean hasCardLeft(){
        return this.index<this.cards.size();
    }
}
