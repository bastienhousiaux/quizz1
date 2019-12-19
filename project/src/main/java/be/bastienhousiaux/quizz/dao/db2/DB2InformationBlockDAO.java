package be.bastienhousiaux.quizz.dao.db2;

import be.bastienhousiaux.quizz.dao.AbstractInformationBlockDAO;
import be.bastienhousiaux.quizz.dao.entities.InformationBlockEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DB2InformationBlockDAO extends AbstractInformationBlockDAO {

    private DB2Connection connection;

    public DB2InformationBlockDAO(DB2Connection connection) {
        this.connection = connection;
    }

    @Override
    public InformationBlockEntity create(InformationBlockEntity obj) {

        Statement st=connection.createStatement();
        try {
            st.execute("INSERT INTO information_blocks VALUES DEFAULT");
            ResultSet rs=st.executeQuery("SELECT IDENTITY_VAL_LOCAL() AS insertedId FROM SYSIBM.SYSDUMMY1");
            rs.next();
            obj.setId(rs.getInt("insertedId"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.close();
        return obj;
    }

    @Override
    public void delete(InformationBlockEntity obj) {
        this.delete(obj.getId());
    }

    @Override
    public void delete(int id) {
        PreparedStatement pr=connection.createPreparedStatement("DELETE FROM information_blocks WHERE information_block_id=?");
        try {
            pr.setInt(1,id);
            pr.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.close();
    }

    @Override
    public InformationBlockEntity find(int id) {
        InformationBlockEntity ibe=null;
        PreparedStatement pr=connection.createPreparedStatement("SELECT * FROM information_blocks WHERE information_block_id=?");
        try {
            pr.setInt(1,id);
            ResultSet rs=pr.executeQuery();
            if(rs.next()) {
                ibe = new InformationBlockEntity();
                ibe.setId(rs.getInt("information_block_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.close();
        return ibe;
    }

    @Override
    public List<InformationBlockEntity> findAll() {
        List<InformationBlockEntity> informationBlockEntities=new ArrayList<>();
        Statement st=connection.createStatement();
        try {
            ResultSet rs=st.executeQuery("SELECT * FROM information_blocks");
            while(rs.next()) {
                InformationBlockEntity ibe=new InformationBlockEntity();
                ibe.setId(rs.getInt("information_block_id"));
                informationBlockEntities.add(ibe);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection.close();
        return informationBlockEntities;
    }

    @Override
    public InformationBlockEntity update(InformationBlockEntity obj) {
        System.out.println("InformationBlockEntity.update not implemented");
        return null;
    }
}
