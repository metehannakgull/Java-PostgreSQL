public class AgArayuzu implements IObserver{

    public void AgBaglantisi() {
        System.out.println("Ağ bağlantısı gerçekleşiyor..");
    }


    @Override
    public void Bilgi(String bilgi) {
        System.out.println("Ağ Arayüzü modülüne gelen mesaj:"+bilgi);
    }
}
