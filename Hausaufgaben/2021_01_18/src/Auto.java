public class Auto {
    private double tankvolumen;
    private double tankinhalt;
     double verbrauch;
    private double kilometerstand;

    Auto(double tankvolumen, double tankinhalt, double verbrauch){
        setTankvolumen(tankvolumen);
        setTankinhalt(tankinhalt);
        setVerbrauch(verbrauch);
    }

    public void tanken(double liter){
        if((getTankinhalt()+liter)<=getTankvolumen()){
            setTankinhalt(getTankinhalt()+liter);
        }
        else{
            System.out.println("Tank ist zu voll für die geplante Menge.");
        }
    }

    public void fahren(double km){
        if(km<0){
            km *= -1;
            System.out.println("Achtung! Du fährst rückwärts.");
        }
        if(km*getVerbrauch() > getTankinhalt()){
            System.out.println("Der Tank ist nicht voll genug.");
        }
        else {
            setTankinhalt(getTankinhalt() - km * getVerbrauch());
        }
    }

    public double maxFahrbareStrecke(){
        return getTankinhalt()/getVerbrauch();
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
