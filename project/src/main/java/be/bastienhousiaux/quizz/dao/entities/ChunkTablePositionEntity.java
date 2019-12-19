package be.bastienhousiaux.quizz.dao.entities;

public class ChunkTablePositionEntity extends  AbstractEntity {
    private int tableId;
    private int linePosition;
    private int columnPosition;

    public ChunkTablePositionEntity(int tableId, int linePosition, int columnPosition) {
        this.tableId = tableId;
        this.linePosition = linePosition;
        this.columnPosition = columnPosition;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getLinePosition() {
        return linePosition;
    }

    public void setLinePosition(int linePosition) {
        this.linePosition = linePosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }
}
