package be.bastienhousiaux.quizz.dao.db2;

import be.bastienhousiaux.quizz.dao.AbstractChunkTablePositionDAO;
import be.bastienhousiaux.quizz.dao.entities.ChunkTablePositionEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DB2ChunkTablePositionDAO extends AbstractChunkTablePositionDAO {

    private DB2Connection connection;

    public DB2ChunkTablePositionDAO(DB2Connection connection) {
        this.connection = connection;
    }

    @Override
    public ChunkTablePositionEntity create(ChunkTablePositionEntity obj) {
        PreparedStatement pr=connection.createPreparedStatement("INSERT INTO chunk_table_positions(chunk_table_id,line_position,column_position) VALUES (?,?,?)");
        Statement st=connection.createStatement();
        try {
            pr.setInt(1,obj.getTableId());
            pr.setInt(2,obj.getLinePosition());
            pr.setInt(3,obj.getColumnPosition());
            pr.execute();
            ResultSet rs=st.executeQuery("SELECT chunk_table_position_id from chunk_table_positions order by chunk_table_position_id desc fetch first 1 rows only");
            rs.next();
            obj.setId(rs.getInt("chunk_table_position_id"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void delete(ChunkTablePositionEntity obj) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public ChunkTablePositionEntity find(int id) {
        return null;
    }

    @Override
    public List<ChunkTablePositionEntity> findAll() {
        return null;
    }

    @Override
    public ChunkTablePositionEntity update(ChunkTablePositionEntity obj) {
        return null;
    }
}
