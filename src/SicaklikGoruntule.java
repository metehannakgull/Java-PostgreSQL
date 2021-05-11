import java.util.Random;

public class SicaklikGoruntule extends Algilama{
    Random rand=new Random(); //random sınıfı
    private int sicaklik=rand.nextInt(40);// 0 ile 40 arası sıcaklık değerleri

    public void SGoruntule(){

        System.out.println("Sıcaklık değeri..:"+sicaklik);
    }
}
