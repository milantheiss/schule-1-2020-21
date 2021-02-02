public class Jaeger {
    private String name;
    private int zielgenauigkeit = (int)(Math.random()*10)+1;
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

    public void setZielgenauigkeit(int bonus) {
        zielgenauigkeit += bonus;
    }


    public String getName() {
        return name;
    }
}
