import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class selectDATA {
    Connection connection=null;
    DbHelper helper=new DbHelper();
    Statement statement = null; //sqlsotguları yazmada kullancağım

    ResultSet resultSet;
    public boolean dene=false;

    public void selectDataa(String username2 ,String password2) throws SQLException {
        try {


            connection = helper.getConnection();
            statement = connection.createStatement(); //gönderilecek sorgu bu bağlantıya gidecek
            resultSet=statement.executeQuery("select username,password from kullanici");

            ArrayList<String> dizi=new ArrayList<>(); //username tutucu
            ArrayList<String> dizi2 = new ArrayList<>(); //password tutucu

            while(resultSet.next()){
                //  System.out.println(resultSet.getString("username"));
                dizi.add(resultSet.getString("username"));
                dizi2.add(resultSet.getString("password"));
            }

            AgArayuzu agArayuzu=new AgArayuzu();
            IslemYapiliyor islem=new IslemYapiliyor(); //Observer tasarım ilkesi


            if(dizi.contains(username2)){
                if(dizi2.contains(password2)){
                    agArayuzu.Bilgi(islem.islm); //Observer tasarım ilkesi
                    agArayuzu.AgBaglantisi();
                    System.out.println("Giriş başarılı.Artık soğutucu için yetkilisiniz.");
                    dene=true;
                }
                else{
                    System.out.println("Şifrenizi yanlış girdiniz..");
                }
            }
            else
            {
                System.out.println("Böyle bir username bulunmamaktadır. Lütfen Kayıt olunuz");
            }
        } catch (
                SQLException exception) { //hata varsa söyle

            helper.showErrorMessage(exception);
        } finally { //her türlü çalıssın. Bağlantınımı sonlandırdım
            connection.close();
        }
    }
}
