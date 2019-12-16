package be.bastienhousiaux.quizz.dao.meta;

import java.sql.*;

public abstract class AbstractDBConnector implements DBConnector {
    private String dbName;
    private String user;
    private String pwd;

    private String baseUrl="jdbc:db2://localhost:50000/";

    public AbstractDBConnector( String baseUrl,String dbName, String user, String pwd) {
        this.dbName = dbName;
        this.user = user;
        this.pwd = pwd;
        this.baseUrl = baseUrl;
    }

    public Connection getConnection(){
        try {
            return DriverManager.getConnection(baseUrl+dbName,user,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Statement getStatement(){
        try {
            return this.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private PreparedStatement getPreparedStatement(String sql){
        try {
            return this.getConnection().prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet query(String sql){
        Statement st=getStatement();
        try {
            return st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public ResultSet execute(String sql,Object ...args){
        try{
            PreparedStatement pr=getPreparedStatement(sql);
            for(int i=0;i<args.length;i++){
                if(args[i] instanceof String){
                    pr.setString(i,(String)args[i]);
                }else if(args[i] instanceof Integer){
                    pr.setInt(i,(Integer)args[i]);
                }else if(args[i] instanceof java.util.Date){
                    pr.setDate(i, (java.sql.Date) args[i]);
                }
            }
            pr.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
