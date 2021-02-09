public class Konto {
    private String kontonummer;
    private Kunde meinKunde;

    public Konto(String kontonummer) {
        this.kontonummer = kontonummer;
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
