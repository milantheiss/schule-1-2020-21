package AutoMieter;

public class Mieter {
    private String name;
    private int kundennummer;
    private Auto meinAuto;

    public int getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Auto getMeinAuto() {
        return meinAuto;
    }

    public void setMeinAuto(Auto meinAuto) {
        this.meinAuto = meinAuto;
    }
}
