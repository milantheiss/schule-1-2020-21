public class Auto {
    private double tankvolumen;
    private double tankinhalt;
    private double verbrauch;
    private double kilometerstand;

    Auto(double tankvolumen, double tankinhalt, double verbrauch){
        this.tankvolumen = tankvolumen;
        this.tankinhalt = tankinhalt;
        this.verbrauch = verbrauch;
    }

    public void tanken(double liter){
        setTankinhalt(getTankinhalt()+liter);
    }

    public void fahren(double km){
        setTankinhalt(getTankinhalt()+km*getVerbrauch());
    }

    public double maxFahrbareStrecke(){
        return getTankinhalt()/getVerbrauch()*100;
    }

    public void setTankvolumen(double tankvolumen){
        this.tankvolumen = tankvolumen;
    }

    public double getTankvolumen(){
        return tankvolumen;
    }

    public void setTankinhalt(double tankinhalt){
        this.tankinhalt = tankinhalt;
    }

    public double getTankinhalt(){
        return tankinhalt;
    }

    public void setVerbrauch(double verbrauch) {
        this.verbrauch = verbrauch/100;
    }

    public double getVerbrauch(){
        return verbrauch;
    }

    public void setKilometerstand(double kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public double getKilometerstand() {
        return kilometerstand;
    }
}
