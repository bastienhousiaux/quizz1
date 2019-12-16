package be.bastienhousiaux.quizz.dao.db2;

import be.bastienhousiaux.quizz.dao.meta.AbstractDBConnector;
import com.ibm.db2.jcc.DB2Driver;

import java.sql.*;
import java.util.Date;

public class DB2Connection extends AbstractDBConnector {
    public DB2Connection(String baseUrl, String dbName, String user, String pwd) {
        super(baseUrl, dbName, user, pwd);
        try {
            DriverManager.registerDriver(new DB2Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
