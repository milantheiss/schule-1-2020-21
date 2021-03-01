public class Konto {
    private String kontonummer;
    private Kunde meinKunde;

    public Konto(String kontonummer, Kunde meinKunde) {
        this.kontonummer = kontonummer;
        this.meinKunde = meinKunde;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    public Kunde getMeinKunde() {
        return meinKunde;
    }

    public void setMeinKunde(Kunde meinKunde) {
        this.meinKunde = meinKunde;
    }
}
