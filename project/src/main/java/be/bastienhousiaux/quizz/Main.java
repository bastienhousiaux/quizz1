package be.bastienhousiaux.quizz;

import be.bastienhousiaux.quizz.business.models.memorycards.MemoryCard;
import be.bastienhousiaux.quizz.business.models.memorycards.MemoryCardList;
import be.bastienhousiaux.quizz.business.models.types.TextData;
import be.bastienhousiaux.quizz.presentation.MemoryCardGroupTest;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<MemoryCard> cardGroup=new ArrayList<MemoryCard>();
        cardGroup.add(new MemoryCard(new TextData("hello"),new TextData("world")));
        cardGroup.add(new MemoryCard(new TextData("hello2"),new TextData("world2")));
        cardGroup.add(new MemoryCard(new TextData("hello3"),new TextData("world3")));
        (new MemoryCardGroupTest(new MemoryCardList(cardGroup))).start();

    }
}
