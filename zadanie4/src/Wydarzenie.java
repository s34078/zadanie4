public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostępneMiejsca = 100;
    private double cena;

    // Konstruktory
    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena);
        this.data = data;
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this(nazwa, cena, data);
        this.miejsce = miejsce;
    }


    public String getNazwa() { return nazwa; }
    public String getData() { return data; }
    public String getMiejsce() { return miejsce; }
    public int getMaxLiczbaMiejsc() { return maxLiczbaMiejsc; }
    public int getDostępneMiejsca() { return dostępneMiejsca; }
    public double getCena() { return cena; }

    public void setNazwa(String nazwa) { this.nazwa = nazwa; }
    public void setData(String data) { this.data = data; }
    public void setMiejsce(String miejsce) { this.miejsce = miejsce; }
    public void setCena(double cena) { this.cena = cena; }


    public boolean zarezerwujMiejsce() {
        if (dostępneMiejsca > 0) {
            dostępneMiejsca--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Wydarzenie: " + nazwa + ", Data: " + data + ", Miejsce: " + miejsce +
                ", Cena: " + cena + " zł, Dostępne miejsca: " + dostępneMiejsca;
    }
}

