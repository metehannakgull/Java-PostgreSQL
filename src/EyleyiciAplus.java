import java.text.SimpleDateFormat; //SOLID DIP
import java.util.Date;

public class EyleyiciAplus implements IEyleyici{ //SOLID Dependency Inversion Principle

    public String  calisiyor="Soğutucu A+ çalıştırıldı..";
    SimpleDateFormat zt = new SimpleDateFormat();
    Date tarih = new Date();
    SogutucuKapat sogutucuKapat=new SogutucuKapat();
    @Override
    public void SogutucuAc() {
        System.out.println("Soğutucu A+ açıldı soğuk hava verilmeye başlandı..:"+zt.format(tarih));

    }

    @Override
    public void SogutucuKapat() {
        sogutucuKapat.Kapatildi();
        System.out.println(zt.format(tarih));

    }
}