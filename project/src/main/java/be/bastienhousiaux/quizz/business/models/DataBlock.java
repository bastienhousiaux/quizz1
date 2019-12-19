package be.bastienhousiaux.quizz.business.models;

import java.util.List;

public class DataBlock {
    private List<TypedData> datas;

    public void addData(TypedData data){
        this.datas.add(data);
    }
}
