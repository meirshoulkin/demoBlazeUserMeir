//import com.mysql.cj.Session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_alexbase {
    static Connection connection;
    static Statement statement;
//    static Session session;
    public static final String URL ="jdbc:mysql://localhost:9090/alexbase";
    public static final String USER_NAME ="root";
    public static final String PASSWORD ="qwerty";

    public static void main(String[] args) throws SQLException {

        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(!connection.isClosed())
            System.out.println("connection created");
        else
            System.out.println("connection closed");
        connection.close();
        if(!connection.isClosed())
            System.out.println("connection created");
        else
            System.out.println("connection closed");
    }
}
