package be.bastienhousiaux.quizz;

import be.bastienhousiaux.quizz.business.models.associationtables.AssociationTable;
import be.bastienhousiaux.quizz.business.models.memorycards.MemoryCard;
import be.bastienhousiaux.quizz.business.models.memorycards.MemoryCardList;
import be.bastienhousiaux.quizz.business.models.types.TextData;
import be.bastienhousiaux.quizz.dao.db2.*;
import be.bastienhousiaux.quizz.dao.entities.ChunkTableEntity;
import be.bastienhousiaux.quizz.dao.entities.ChunkTablePositionEntity;
import be.bastienhousiaux.quizz.dao.entities.InformationChunkTypeEntity;
import be.bastienhousiaux.quizz.dao.meta.AbstractCRUDDAO;
import be.bastienhousiaux.quizz.datatypes.ChunkType;
import be.bastienhousiaux.quizz.presentation.MemoryCardGroupTest;
import be.bastienhousiaux.quizz.view.ViewWindow;
import com.google.gson.Gson;
import com.ibm.db2.jcc.DB2Driver;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AssociationTable table=new AssociationTable();
        table.createColumn("images",ChunkType.IMAGE_URL);
        table.createColumn("francais",ChunkType.TEXT);
        table.createLine();
        table.createLine();
        table.createLine();
        table.setCellData(0,0,"hello.png");
        table.setCellData(1,0,"bonjour");

        table.setCellData(0,1,"apple.png");
        table.setCellData(1,1,"pomme");

        table.setCellData(0,2,"house.png");
        table.setCellData(1,2,"maison");
        table.createColumn("colonne vide",ChunkType.TEXT);
        table.createLine();
        System.out.println(table);
//        ViewWindow vw=new ViewWindow(800,600);
//        vw.createLabel("mon bouton hello world : ");
//        vw.createInput();
//        vw.createButton("hello world").onMouseClick(()->{
//            System.out.println("mouse click");
//        });

//    DB2InformationChunkTypeDAO aaa=new DB2InformationChunkTypeDAO(new DB2Connection());
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
