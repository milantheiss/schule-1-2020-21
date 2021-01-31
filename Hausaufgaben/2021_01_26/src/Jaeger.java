public class Jaeger {
    private String name;
    private int zielgenauigkeit;
    private Hase hase;

    Jaeger(String name){
        this.name = name;
    }

    public void setHase(Hase input){
        this.hase = input;
    }

    public Hase getHase() {
        return hase;
    }

    public int getZielgenauigkeit() {
        return zielgenauigkeit;
    }

    public void setZielgenauigkeit() {
        this.zielgenauigkeit = (int)(Math.random()*10)+1;
    }

    public String getName() {
        return name;
    }
}
