import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        SogutucuCalistir sogutucuCalistir = new SogutucuCalistir();
        Bekleme bekleme = new Bekleme();
        AkilliCihaz akilliCihaz = new AkilliCihaz();
        SogutucununDurumu sogutucununDurumu = new SogutucununDurumu(); //Builder Tasrım Deseni

        if (sogutucununDurumu.Durum) { //Builder tasarım deseni için kontrol

            System.out.println("1.Kayıt ol");  //Kayıt ol
            System.out.println("2.Giriş yap"); //Giriş yap

            Scanner input = new Scanner(System.in);

            String secim = null;
            while (!"end".equals(secim)) {

                System.out.print("Seçiminiz:");
                secim = input.nextLine();
                if ("1".equals(secim)) {    //kayıt ol seçimi
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Kullanıcı Adı: ");
                    String username = input2.nextLine();
                    System.out.print("Şifre: ");
                    String password = input2.nextLine();

                    insertDATA DATA = new insertDATA(); //veritabanına veri ekleme
                    DATA.insertDataaa(username, password);
                    secim = null;
                } else if ("2".equals(secim)) {  //giriş yap seçimi
                    Scanner input3 = new Scanner(System.in);
                    System.out.print("Kullanıcı adı:");
                    String username2 = input3.nextLine();
                    System.out.print("Şifre:");
                    String pasword2 = input3.nextLine();

                    selectDATA DATA2 = new selectDATA(); //veritabanından veri seçimi
                    DATA2.selectDataa(username2, pasword2);
                    if (DATA2.dene == true) {
                        Scanner input4 = new Scanner(System.in);
                        System.out.print("Soğutucuyu çalıştırmak için 'ok' giriniz:");
                        String tm = "ok";
                        String tut = input4.nextLine();
                        if (tut.equals(tm)) {
                            sogutucuCalistir.Calistirildi();
                            bekleme.Bekle();
                            akilliCihaz.menu();
                        } else {
                            System.out.println("Yanlış giriş yaptınız. Lütfen 'ok' giriniz.");
                        }


                    }
                    secim = null; //seçim döngüsü için


                } else { //1 ve 2 dışındaki seçimler için
                    System.out.println("Seçiminiz 1 veya 2 olmalıdır. Yanlış seçim girdiniz.");
                }

            }
            input.close();
        }
        else{ //Soğutucunun durumu false yapılırsa tüm cihazların arizalı olduğu bilgisi gelir
            ServisDisi servisDisi1=
                    new ServisDisi.ServisDisiBuilder("Akilli cihaz: Arizali","Sicaklik Algilayici: Arizali")
                            .ey("Eyleyici:Arizali")
                            .aa("Ağ arayüzü:Arizali")
                            .build();
            servisDisi1.toString();
        }
    }
}
