public class Wichtiger extends Wichtig {
    public int i=2;
    public void wichtig(){
        super.wichtig();
        System.out.println("ich muss das bekräftigen!");
        System.out.println(super.i);
        System.out.println(i);
    }
}
