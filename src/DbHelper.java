import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {     //POSTGRESQL bağlantısı
    private String userName="postgres";
    private   String password="admin";          //db şifrem
    private   String dbURL="jdbc:postgresql://localhost:5432/test1"; //test1 db adı

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbURL,userName,password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error:"+exception.getMessage());
        System.out.println("Error code:"+exception.getErrorCode());

    }
}