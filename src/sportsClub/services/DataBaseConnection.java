package sportsClub.services;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
    private Statement statement;
    private Connection connection;

    public DataBaseConnection(Statement statement, Connection connection) {
        this.statement = statement;
        this.connection = connection;
    }

    public DataBaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store?serverTimezone=UTC",
                    "root", "informatica2019");
            Statement mystatement = this.connection.createStatement();

            this.statement = mystatement;
            this.connection = myconnection;
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
