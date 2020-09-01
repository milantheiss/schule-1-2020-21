public class Farbe1 {
    private int farbe;
    static int blau = 1;
    int gruen = 2;
    int gelb = 3;
    private int rot = 4;

    public void setFarbe(int farbe){
        if (farbe > 0)
            System.out.println("Farbe halt:)");
    }
    public int getFarbe(){

        return this.farbe;

    }


}
