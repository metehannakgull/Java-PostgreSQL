public class ServisDisi { //Builder Tasarım Deseni
    public String ey; //eyleyici
    public String sa; //sıcaklık algılayıcı
    public String ac; //akıllı cihaz
    public String aa; //ağ arayüzü

    private ServisDisi(ServisDisiBuilder builder) {

        this.ey = builder.ey;
        this.sa = builder.sa;
        this.ac = builder.ac;
        this.aa = builder.aa;
    }

    @Override
    public String toString() {
        return "ServisDisi{" +
                "eyleyici=" + ey +
                ", sicaklikAlgilayici=" + sa +
                ", akilliCihaz='" + ac + '\'' +
                ", agArayuzu=" + aa +
                '}';
    }
    public static class ServisDisiBuilder{
        public String ey; //eyleyici
        public String sa; //sıcaklık algılayıcı
        public String ac; //akıllı cihaz
        public String aa; //ağ arayüzü


        public ServisDisiBuilder(String ac, String sa) {
            this.ac = ac;
            this.sa = sa;
        }
        public ServisDisiBuilder ey (String ey) {
            this.ey = ey;
            return this;
        }
        public ServisDisiBuilder aa (String aa) {
            this.aa = aa;
            return this;
        }
        public ServisDisi build() {

            return new ServisDisi(this);
        }
    }
}
