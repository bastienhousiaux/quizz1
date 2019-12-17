package be.bastienhousiaux.quizz.dao.entities;

public class InformationChunkEntity extends AbstractEntity {
    private String data;
    private int type_id;
    private int block_id;

    public InformationChunkEntity(String data, int type_id, int block_id) {
        this.data = data;
        this.type_id = type_id;
        this.block_id = block_id;
    }

    public InformationChunkEntity(int id, String data, int type_id, int block_id) {
        super(id);
        this.data = data;
        this.type_id = type_id;
        this.block_id = block_id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getBlock_id() {
        return block_id;
    }

    public void setBlock_id(int block_id) {
        this.block_id = block_id;
    }
}
