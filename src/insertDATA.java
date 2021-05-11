import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class insertDATA {
    Connection connection=null;
    DbHelper helper=new DbHelper();
    PreparedStatement statement = null; //insert işlemi için bu kullanılır
    ResultSet resultSet;

    public void insertDataaa(String username, String password) throws SQLException {
        try {

            connection = helper.getConnection();
            String sql = "insert into kullanici (username,password) values(?,?)"; //Buda veritabanına bir diğer ekleme yöntemi
            statement = connection.prepareStatement(sql);
            // statement.setInt(1,4);
            statement.setString(1, username);
            statement.setString(2, password);

            statement.executeUpdate();

            System.out.println("Bağlantı oluştu..");

            System.out.print("Kaydınız başarılı şekilde gerçekleştirildi.");
            System.out.println("Lütfen giriş yapınız.(2'yi seçiniz.)");
        } catch (SQLException exception) { //hata varsa söyle
            System.out.println("Bu kullanıcı adı mevcut başka bir tane giriniz.");
            helper.showErrorMessage(exception);
        } finally { //her türlü çalıssın. Bağlantınımı sonlandırdım
            connection.close();
        }
    }
}