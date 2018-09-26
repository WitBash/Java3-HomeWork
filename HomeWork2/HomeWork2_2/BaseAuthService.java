package HomeWork2.HomeWork2_2;

import org.sqlite.JDBC;
import java.sql.*;

public class BaseAuthService implements AuthService {
    private static final String DB_PATH = "D:/Учеба/java3/SQLite/users";
    Connection conn;

    public BaseAuthService() {
            try {
                conn = DriverManager.getConnection(JDBC.PREFIX + DB_PATH);
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    @Override
    public String authByLoginAndPassword(String login, String password) {
        try {
            Statement stmt = conn.createStatement();
            for (int i = 1; i <= 3; i++) {
                ResultSet rslogin = stmt.executeQuery("SELECT login FROM users");
                ResultSet rspassword = stmt.executeQuery("SELECT password FROM users");
                ResultSet rsnickname = stmt.executeQuery("SELECT nickname FROM users");
                if (login.equals(rslogin.getString(i)) && password.equals(rspassword.getString(i))) {
                    return rsnickname.getString(i);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}