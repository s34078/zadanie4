import java.util.ArrayList;

public class Klient {
    private String imię;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;


    public Klient(String imię, String nazwisko) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.listaRezerwacji = new ArrayList<>();
    }

    public Klient(String imię, String nazwisko, String email) {
        this(imię, nazwisko);
        this.email = email;
    }


    public String getImię() { return imię; }
    public String getNazwisko() { return nazwisko; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }


    public void dodajRezerwację(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
    }

    public void wyświetlRezerwacje() {
        if (listaRezerwacji.isEmpty()) {
            System.out.println("Brak rezerwacji.");
            return;
        }
        for (Wydarzenie w : listaRezerwacji) {
            System.out.println(w);
        }
    }

    public void anulujRezerwację(Wydarzenie wydarzenie) {
        listaRezerwacji.remove(wydarzenie);
    }
}
