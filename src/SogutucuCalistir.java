import java.text.SimpleDateFormat;
import java.util.Date;
public class SogutucuCalistir {

    public String  calisiyor="Soğutucu çalıştırıldı..";
    SimpleDateFormat zt = new SimpleDateFormat();
    Date tarih = new Date();

    public void Calistirildi(){
        System.out.println("Soğutucu çalıştırıldı...:"+zt.format(tarih));

    }
}