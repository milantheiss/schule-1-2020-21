import java.util.ArrayList;

public class Kunde {
    private String name;
    private ArrayList<Konto> meineKonten = new ArrayList<Konto>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Konto> getMeineKonten() {
        return meineKonten;
    }

    public void setMeineKonten(Konto konto) {
        meineKonten.add(konto);
    }
}
