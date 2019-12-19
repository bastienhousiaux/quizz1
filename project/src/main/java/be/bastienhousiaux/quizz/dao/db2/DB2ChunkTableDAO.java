package be.bastienhousiaux.quizz.dao.db2;

import be.bastienhousiaux.quizz.dao.AbstractChunkTableDAO;
import be.bastienhousiaux.quizz.dao.entities.ChunkTableEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DB2ChunkTableDAO extends AbstractChunkTableDAO {

    private DB2Connection connection;

    public DB2ChunkTableDAO(DB2Connection connection) {
        this.connection = connection;
    }

    @Override
    public ChunkTableEntity create(ChunkTableEntity obj) {
        PreparedStatement pr=connection.createPreparedStatement("INSERT INTO chunk_tables(table_name) VALUES(?);");
        Statement st=connection.createStatement();
        try {
            pr.setString(1,obj.getName());
            pr.execute();
            ResultSet rs=st.executeQuery("SELECT chunk_table_id FROM chunk_tables ORDER BY chunk_table_id DESC FETCH FIRST 1 ROWS ONLY");
            rs.next();
            obj.setId(rs.getInt("chunk_table_id"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.close();
        return obj;
    }

    @Override
    public void delete(ChunkTableEntity obj) {
        PreparedStatement pr=connection.createPreparedStatement("DELETE FROM chunk_tables WHERE table_name=?");
        try {
            pr.setString(1,obj.getName());
            pr.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.close();
    }

    @Override
    public void delete(int id) {
        PreparedStatement pr=connection.createPreparedStatement("DELETE FROM chunk_tables WHERE chunk_table_id=?");
        try {
            pr.setInt(1,id);
            pr.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.close();
    }

    @Override
    public ChunkTableEntity find(int id) {
        ChunkTableEntity chunkTableEntity = null;

        PreparedStatement pr=connection.createPreparedStatement("SELECT * FROM chunk_tables WHERE chunk_table_id=?");
        try {
            pr.setInt(1,id);
            ResultSet rs=pr.executeQuery();
            if(rs.next()){
                chunkTableEntity=new ChunkTableEntity(rs.getString("table_name"));
                chunkTableEntity.setId(rs.getInt(id));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return chunkTableEntity;
    }

    @Override
    public List<ChunkTableEntity> findAll() {
        List<ChunkTableEntity>chunkTableEntities=new ArrayList<>();
        Statement st=connection.createStatement();
        try {
            ResultSet rs=st.executeQuery("SELECT * FROM chunk_tables");
            while(rs.next()){
                ChunkTableEntity chunkTableEntity=new ChunkTableEntity(rs.getString("table_name"));
                chunkTableEntity.setId(rs.getInt("chunk_table_id"));
                chunkTableEntities.add(chunkTableEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chunkTableEntities;
    }

    @Override
    public ChunkTableEntity update(ChunkTableEntity obj) {
        PreparedStatement pr=connection.createPreparedStatement("UPDATE FROM chunk_tables SET table_name=? WHERE chunk_table_id=?");
        try {
            pr.setString(1,obj.getName());
            pr.setInt(2,obj.getId());
            pr.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
