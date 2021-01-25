public class Anzeige {
    private String beschreibung;
    private double preis;

    private Kunde meinKunde;

    public void setMeinKunde(Kunde meinKunde) {
        this.meinKunde = meinKunde;
    }

    public Kunde getMeinKunde() {
        return meinKunde;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getBeschreibung(){
        return beschreibung;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getPreis() {
        return preis;
    }
}
