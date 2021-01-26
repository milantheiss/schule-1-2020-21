public class Hase {
    private String name;
    private int gegesseneMoehrchen = 0;
    private Jaeger jeager;

    Hase(String name){
        this.name = name;
    }

    public void setJeager(Jaeger input){
        this.jeager = input;
    }

    public Jaeger getJeager(){
        return jeager;
    }

    public void setGegesseneMoehrchen(int anzahl){
        gegesseneMoehrchen += anzahl;
    }

    public int getGegesseneMoehrchen() {
        return gegesseneMoehrchen;
    }

    public String getName() {
        return name;
    }
}
