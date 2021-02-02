import java.util.ArrayList;

public class Firma {
    private String name;
    ArrayList<Automat> meineAutomaten = new ArrayList<Automat>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Automat> getMeineAutomaten() {
        return meineAutomaten;
    }

    public void setMeineAutomaten(Automat automat) {
        meineAutomaten.add(automat);
    }
}
