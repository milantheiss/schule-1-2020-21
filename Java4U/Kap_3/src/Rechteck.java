public class Rechteck {
    private double seiteA;
    private double seiteB;

    public void setSeiteA(double seiteA){
        if (seiteA >=0)
            this.seiteA = seiteA;
        else
            this.seiteA = 0;
    }

    public void setSeiteA(String seiteA){

        this.setSeiteA((Double.parseDouble(seiteA)));
    }

    public void setSeiteB(double seiteB){
        if (seiteB >=0)
            this.seiteB = seiteB;
        else
            this.seiteB = 0;
    }

    public void setSeiteB(String seiteB){
        this.setSeiteB((Double.parseDouble(seiteB)));
    }

    public void setSeiteAB(double seiteA, double seiteB){
        this.setSeiteA(seiteA);
        this.setSeiteB(seiteB);
    }

    public void showFlaeche(){
        System.out.println("Die Fläche beträgt: "+((this.seiteA/100)*(this.seiteB/100))+ " m*m");
    }

    public double getSeiteA(){
        return this.seiteA;
    }

    public double getSeiteB(){
        return this.seiteB;
    }

    public double getFlaeche(){
        return (this.seiteA*this.seiteB);
    }

    public double getUmfang(){
        return 2*(this.seiteA+this.seiteB);
    }
}
