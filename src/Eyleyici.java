import java.text.SimpleDateFormat;
import java.util.Date;
public class Eyleyici implements IEyleyici{ //DIP

    public String  calisiyor="Soğutucu çalıştırıldı..";
    SimpleDateFormat zt = new SimpleDateFormat();
    Date tarih = new Date();

    SogutucuKapat sogutucuKapat=new SogutucuKapat();
    @Override
    public void SogutucuAc() {
        System.out.println("Soğutucu açıldı soğuk hava verilmeye başlandı..:"+zt.format(tarih));
    }

    @Override
    public void SogutucuKapat() {
        sogutucuKapat.Kapatildi();
        System.out.println(zt.format(tarih));

    }


}