
import java.util.Scanner;

public class AkilliCihaz {
    IEyleyici cihazTuru= new Eyleyici(); //SOLID Dependency Inversion Principle
    // IEyleyici cihazTuru=new EyleyiciAplus(); // Soğutucu A+ için



    SicaklikGoruntule sicaklikGoruntule=new SicaklikGoruntule();
    SicaklikAlgilayici sicaklikAlgilayici=new SicaklikAlgilayici();
    Kapali kapali=new Kapali();
    Algilama algilama=new Algilama();
    IslemYapiliyor islem = new IslemYapiliyor(); //Observer tasarım ilkesi

    public void menu(){
        System.out.println("1.Soğutucu Aç");
        System.out.println("2.Soğutucu Kapat");
        System.out.println("3.Sıcaklık Görüntüle");

        Scanner input= new Scanner(System.in);
        String secim=null;

        while (!"end2".equals(secim)) {
            System.out.print("Soğutucu İşlem Seçiminiz:");
            secim=input.nextLine();
            if ("1".equals(secim)) {      //Soğutucu aç
                //   eyleyici.SogutucuAc();
                cihazTuru.SogutucuAc();
                secim=null;
            }
            else if("2".equals(secim)){  //Soğutucu kapat
                //  eyleyici.SogutucuKapat();
                cihazTuru.SogutucuKapat();
                kapali.AktifDegil();
                secim=null;
            }
            else if("3".equals(secim)) //Sıcaklık görüntüle
            {
                algilama.Algila();
                sicaklikAlgilayici.Bilgi(islem.islm); //Observer tasarım ilkesi
                sicaklikAlgilayici.SicaklikOku();
                sicaklikGoruntule.SGoruntule();
            }
            else{  //seçim 1 2 3 olmalı
                System.out.println("Seçiminiz 1,2 veya 3 olmalıdır. Yanlış seçim girdiniz.");
            }

        }
        input.close();
    }
}
