public class Haupt {
    public static void main(String args[]){
        Rechteck r1 = new Rechteck();
        r1.setSeiteA(4.0);
        r1.setSeiteB(-4.2);
        System.out.println("Objekt r1(Seite A): "+r1.getSeiteA());
        System.out.println("Objekt r1(Seite B): "+r1.getSeiteB());
        System.out.println("r1 (Fläche): "+r1.getFlaeche());
        System.out.println("r1 (Umfang): "+r1.getUmfang());
        System.out.println("Programmende");
    }
}
