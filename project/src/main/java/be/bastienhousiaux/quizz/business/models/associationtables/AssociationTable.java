package be.bastienhousiaux.quizz.business.models.associationtables;

import be.bastienhousiaux.quizz.datatypes.ChunkType;

import java.util.ArrayList;
import java.util.List;

public class AssociationTable {
    private List<ChunkType> columnsTypes=new ArrayList<>();
    private List<String> columnsTitle=new ArrayList<>();
    private List<List<String>> tableData=new ArrayList<>();
    private int columns=0,lines=0;



    public void createColumn(String title,ChunkType columnType){
        columnsTitle.add(title);
        columnsTypes.add(columnType);

        for(int i=0;i<lines;i++){
            tableData.get(i).add(null);
        }
        columns++;
    }

    public void createLine(){
        this.tableData.add(new ArrayList<>());
        this.lines++;
        for(int i=0;i<this.columnsTypes.size();i++)this.tableData.get(lines-1).add(null);
    }

    public void setCellData(int x,int y,String data){
        this.tableData.get(y).set(x,data);
    }

    @Override
    public String toString() {
        String representation="|";
        for(int i=0;i<columns;i++)representation+="\t"+columnsTypes.get(i)+"\t|";
        representation+="\n|";
        for(int i=0;i<columns;i++)representation+="\t"+columnsTitle.get(i)+"\t|";
        representation+="\n";

        for(int i=0;i<lines;i++){
            representation+="|";
            for(int j=0;j<columns;j++){
                representation+="\t"+tableData.get(i).get(j)+"\t|";
            }
            representation+="\n";
        }
        return representation;
    }
}
