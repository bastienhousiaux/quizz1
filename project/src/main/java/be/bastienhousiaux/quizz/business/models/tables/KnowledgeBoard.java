package be.bastienhousiaux.quizz.business.models.tables;

import be.bastienhousiaux.quizz.business.models.types.AbstractTypedData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class KnowledgeBoard extends Board<AbstractTypedData>{
    private String title;
    private List<String> aliasesColumns;


    public KnowledgeBoard(int width, int height) {
        this(width, height,new ArrayList<AbstractTypedData>());
    }

    public KnowledgeBoard(int width, int height, List<AbstractTypedData> arrayData) {
        this(width, height, arrayData,new String[width]);
    }

    public KnowledgeBoard(int width, int height, List<AbstractTypedData> arrayData, String[] aliasesColumns) {
        super(width, height, arrayData);
        this.aliasesColumns = new ArrayList(Arrays.asList(aliasesColumns));
    }

    public int getRandomLine(){
        Random rng=new Random();
        return rng.nextInt(this.getHeight());
    }

    public AbstractTypedData getCellWithAlias(String alias,int line){
        return this.getCell(this.aliasesColumns.indexOf(alias),line);
    }
}
