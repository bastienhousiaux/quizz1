package business.models.tables;

import be.bastienhousiaux.quizz.business.models.tables.Board;
import org.junit.Assert;
import org.junit.Test;

public class BoardTests {

    @Test
    public void addColumn_inRange_IncreaseWidth(){
        int width=4;
        int height=4;
        Board<Integer> board=new Board<>(width,height);

        board.addColumnAt(2);
        int result=board.getWidth();

        Assert.assertEquals(width+1,result);

    }

    @Test
    public void addColumn_inRange_wellPlaced(){

    }
}
