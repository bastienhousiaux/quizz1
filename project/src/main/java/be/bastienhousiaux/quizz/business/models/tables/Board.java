package be.bastienhousiaux.quizz.business.models.tables;

import java.util.ArrayList;
import java.util.List;

public class Board<T> {
    private List<T> arrayData;
    private int width,height;

    public Board(int width, int height) {
        this(width,height,new ArrayList<T>());
    }

    public Board( int width, int height,List<T> arrayData) {
        this.arrayData = arrayData;
        this.width = width;
        this.height = height;
    }

    public int xyTox(int x,int y){
        return y*width+x;
    }

    public T getCell(int x,int y){
        return this.arrayData.get(xyTox(x,y));
    }

    public void setCell(int x,int y,T data){
        this.arrayData.set(xyTox(x,y),data);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
