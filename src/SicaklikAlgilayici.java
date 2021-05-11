
public class SicaklikAlgilayici implements ISicaklikAlgilayici,IObserver{ //Observer tasarım ilkesi
    @Override
    public void SicaklikOku() {
        System.out.println("Sicaklik okunuyor...");
    }


    @Override
    public void Bilgi(String bilgi) {
        System.out.println("Sıcaklık Algılayıcı modüle gelen mesaj:"+bilgi);
    }
}