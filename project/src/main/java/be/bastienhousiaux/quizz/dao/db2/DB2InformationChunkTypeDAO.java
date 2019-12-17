package be.bastienhousiaux.quizz.dao.db2;

import be.bastienhousiaux.quizz.dao.AbstractInformationChunkTypeDAO;
import be.bastienhousiaux.quizz.dao.entities.InformationChunkTypeEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB2InformationChunkTypeDAO extends AbstractInformationChunkTypeDAO {

    private DB2Connection connection;

    public DB2InformationChunkTypeDAO(DB2Connection connection) {
        this.connection = connection;
    }

    public InformationChunkTypeEntity create(InformationChunkTypeEntity obj) {
        PreparedStatement pr=this.connection.createPreparedStatement("INSERT INTO information_chunk_types(type_name) VALUES (?)");
        try {
            pr.setString(1,obj.getTypeName());
            pr.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connection.close();
        return obj;
    }

    public void delete(InformationChunkTypeEntity obj) {
        PreparedStatement pr=this.connection.createPreparedStatement("DELETE FROM information_chunk_types WHERE type_name=?");
        try {
            pr.setString(1,obj.getTypeName());
            pr.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connection.close();

    }

    public void delete(int id) {
        PreparedStatement pr=this.connection.createPreparedStatement("DELETE FROM information_chunk_types WHERE information_chunk_type_id=?");
        try {
            pr.setInt(1,id);
            pr.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connection.close();
    }

    public InformationChunkTypeEntity find(int id) {
        InformationChunkTypeEntity informationChunkTypeEntity=null;


        try {
            PreparedStatement pr=this.connection.createPreparedStatement("SELECT * FROM information_chunk_types WHERE information_chunk_type_id=?");
            pr.setInt(1,id);
            ResultSet rs=pr.executeQuery();
            rs.next();
            informationChunkTypeEntity=new InformationChunkTypeEntity(id,rs.getString("type_name"));
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return informationChunkTypeEntity;
    }

    public List<InformationChunkTypeEntity> findAll() {
        List<InformationChunkTypeEntity> informationChunkTypeEntities=new ArrayList<InformationChunkTypeEntity>();
        try {
            ResultSet resultSet=this.connection.createStatement().executeQuery("SELECT * from information_chunk_types");
            this.connection.close();
            while(resultSet.next()){
                int id=resultSet.getInt("information_chunk_type_id");
                String name=resultSet.getString("type_name");
                informationChunkTypeEntities.add(new InformationChunkTypeEntity(id,name));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return informationChunkTypeEntities;
    }

    public InformationChunkTypeEntity update(InformationChunkTypeEntity obj) {
        PreparedStatement pr=this.connection.createPreparedStatement("UPDATE information_chunk_types SET type_name=? WHERE information_chunk_type_id=?");

        try {
            pr.setString(1,obj.getTypeName());
            pr.setInt(2,obj.getId());
            pr.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
