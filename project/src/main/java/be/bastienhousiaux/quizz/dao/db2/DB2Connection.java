package be.bastienhousiaux.quizz.dao.db2;

import java.sql.*;


public class DB2Connection {
    private String url="jdbc:db2://localhost:50000";
    private String dbName="quizz";
    private String user="db2admin";
    private String password="Test1234=";

    private Connection connection;


    public void close(){
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        try {
            this.connection= DriverManager.getConnection(url+"/"+dbName,user,password);
            return this.connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Statement createStatement(){
        try {
            return this.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PreparedStatement createPreparedStatement(String sql){
        try {
            return this.getConnection().prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Deprecated
    public ResultSet getEverythingFromTable(String tableName){
        PreparedStatement ps=this.createPreparedStatement("SELECT * from ?");
        try {
            ps.setString(1,tableName);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
