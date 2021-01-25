public class Kunde {
    private String name;
    private String telefon;

    private Anzeige meineAnzeige;

    public void setMeineAnzeige(Anzeige meineAnzeige) {
        this.meineAnzeige = meineAnzeige;
    }

    public Anzeige getMeineAnzeige() {
        return meineAnzeige;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTelefon() {
        return telefon;
    }
}
