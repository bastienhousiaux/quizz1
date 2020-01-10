package be.bastienhousiaux.quizz.presentation;

import be.bastienhousiaux.quizz.business.models.memorycards.MemoryCard;
import be.bastienhousiaux.quizz.business.models.memorycards.MemoryCardList;

import java.util.Scanner;

public class MemoryCardGroupTest {

    private MemoryCardList group;
    private Scanner scanner;

    public MemoryCardGroupTest(MemoryCardList group){
        this.group=group;
        this.scanner=new Scanner(System.in);
    }

    public void start(){
        while(group.hasCardLeft()){
            try{
                MemoryCard card=group.getNextCard();
//                System.out.println("recto:\n"+card.getRecto().getData()+"\n appuyez sur enter pour continuer");
                System.in.read();
//                System.out.println("verso:\n"+card.getVerso().getData()+"\n appuez sur enter pour continuer");
                System.in.read();
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }


}
