/*
 * Copyright(C) 2021, Nguyen Quang Truong.
 *
 * Record of change:
 * DATE            Version             AUTHOR           DESCRIPTION
 * 2021-05-14      1.0.0               TruongNQ         File initialization
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Contains methods to connect to the database and close the connection
 *
 * Bugs: None
 *
 * @author Nguyen Quang Truong
 */
public class DBContext {

    private InitialContext initial;
    private Context context;
    private String dbName;
    private String serverName;
    private String portNumber;
    private String userName;
    private String password;

    /**
     * Parameterless constructor used to initialize a digital object
     */
    public DBContext() {
        try {
            initial = new InitialContext();
            Object obj = initial.lookup("java:comp/env");
            context = (Context) obj;
            serverName = context.lookup("serverName").toString();
            dbName = context.lookup("dbName").toString();
            portNumber = context.lookup("portNumber").toString();
            userName = context.lookup("userName").toString();
            password = context.lookup("password").toString();
        } catch (NamingException e) {
        }
    }

    /**
     * To connect with the database
     *
     * @return a connection to given database URL
     * @throws Exception
     */
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userName, password);
    }

    /**
     * Close ResultSet
     *
     * @param rs the ResultSet. It is a <code>java.sql.ResultSet</code> object
     * @throws SQLException
     */
    public void closeRs(ResultSet rs) throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
    }

    /**
     * Close PreparedStatement
     *
     * @param ps the PreparedStatement. It is a
     * <code>java.sql.PreparedStatement</code> object
     * @throws SQLException
     */
    public void closePs(PreparedStatement ps) throws SQLException {
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
    }

    /**
     * Close Connection
     *
     * @param con the Connection. It is a <code>java.sql.Connection</code>
     * object
     * @throws SQLException
     */
    public void closeCon(Connection con) throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }
}
