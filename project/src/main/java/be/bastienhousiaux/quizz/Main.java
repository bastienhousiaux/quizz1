package be.bastienhousiaux.quizz;

import be.bastienhousiaux.quizz.business.models.memorycards.MemoryCard;
import be.bastienhousiaux.quizz.business.models.memorycards.MemoryCardList;
import be.bastienhousiaux.quizz.business.models.types.TextData;
import be.bastienhousiaux.quizz.dao.db2.DB2Connection;
import be.bastienhousiaux.quizz.dao.db2.DB2InformationChunkTypeDAO;
import be.bastienhousiaux.quizz.dao.entities.InformationChunkTypeEntity;
import be.bastienhousiaux.quizz.presentation.MemoryCardGroupTest;
import com.google.gson.Gson;
import com.ibm.db2.jcc.DB2Driver;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    DB2InformationChunkTypeDAO aaa=new DB2InformationChunkTypeDAO(new DB2Connection());
//        InformationChunkTypeEntity icte=new InformationChunkTypeEntity("UPLOADED_IMAGE");
//
//        aaa.create(icte);
//
//        ArrayList<MemoryCard> cardGroup=new ArrayList<MemoryCard>();
//        cardGroup.add(new MemoryCard(new TextData("hello"),new TextData("world")));
//        cardGroup.add(new MemoryCard(new TextData("hello2"),new TextData("world2")));
//        cardGroup.add(new MemoryCard(new TextData("hello3"),new TextData("world3")));
//        (new MemoryCardGroupTest(new MemoryCardList(cardGroup))).start();

    }
}
